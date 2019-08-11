import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
class computerUseRandomCardTest {
	
	public static int computerUseMoveCardForTest(ArrayList<Property> propertyList,Player computerPlayer) {
		int result=0;
		if(computerUseRandomCard.haveEmptyProperty(propertyList,computerPlayer)) {
			for(Property i:propertyList) {
				if(i.getOwner()==5
				&&i.getPosition()!=Constant.JAIL
				&&i.getPosition()!=Constant.FIRST_RANDOM
				&&i.getPosition()!=Constant.SECOND_RANDOM
				&&i.getPosition()!=Constant.START_POSITION) 
				{	
					System.out.println(computerPlayer.getPlayerName()+"move to property"+i.getPosition());
					result= i.getPosition();
				}
			}
		}
		else {
			for(Property i:propertyList) {
				if(i.getOwner()==computerPlayer.getPlayerNumber()) {
					result=i.getPosition();
					
				}
			}
		}
		return result;
		
	}
	
	@Test
	public void computerUseStealCardTest(){
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Player testPlayer=new Player(0);
		Property testProperty=propertyList.get(2);
		testProperty.setRent(500);
		int result=computerUseRandomCard.computerUseStealCard(propertyList,testPlayer);
		assertEquals(2,result);
	}
	
	@Test
	public void computerUseStealCardWithSameRentTest(){
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Player testPlayer=new Player(0);
		Property testProperty=propertyList.get(2);
		int result=computerUseRandomCard.computerUseStealCard(propertyList,testPlayer);
		assertEquals(19,result);
	}
	
	@Test
	public void computerUseStealCardJail_HighestRentTest(){
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Player testPlayer=new Player(0);
		Property testProperty=propertyList.get(Constant.JAIL);
		testProperty.setRent(1000);
		int result=computerUseRandomCard.computerUseStealCard(propertyList,testPlayer);
		assertEquals(19,result);
	}
	
	@Test
	public void computerUseStealCardRandom_HighestRentTest(){
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Player testPlayer=new Player(0);
		Property testProperty=propertyList.get(Constant.FIRST_RANDOM);
		testProperty.setRent(1000);
		int result=computerUseRandomCard.computerUseStealCard(propertyList,testPlayer);
		assertEquals(19,result);
	}
	
	@Test
	public void computerUseStealCardSecondRandom_HighestRentTest(){
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Player testPlayer=new Player(0);
		Property testProperty=propertyList.get(Constant.SECOND_RANDOM);
		testProperty.setRent(1000);
		int result=computerUseRandomCard.computerUseStealCard(propertyList,testPlayer);
		assertEquals(19,result);
	}
	
	@Test
	public void computerUseStealCardStart_HighestRentTest(){
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Player testPlayer=new Player(0);
		Property testProperty=propertyList.get(Constant.START_POSITION);
		testProperty.setRent(1000);
		int result=computerUseRandomCard.computerUseStealCard(propertyList,testPlayer);
		assertEquals(19,result);
	}
	
	
	public static ArrayList<Property> PropertyListForTest() {
		ArrayList<Property> propertyList=InitialList.propertiesList();
		for(Property i:propertyList) {
			i.setOwner(1);
		}
		return propertyList;
		
	}
	
	
	@Test
	public void testHaveEmptyProperty() {
		ArrayList<Property> propertyList=PropertyListForTest();
		Player testPlayer=new Player(0);
		Boolean result=computerUseRandomCard.haveEmptyProperty(propertyList,testPlayer);
		assertEquals(false,result);
	}
	
	
	@Test
	public void testTrueHaveEmptyProperty() {
		ArrayList<Property> propertyList=PropertyListForTest();
		Player testPlayer=new Player(0);
		Property testProperty=propertyList.get(2);
		testProperty.setOwner(5);
		Boolean result=computerUseRandomCard.haveEmptyProperty(propertyList,testPlayer);
		assertEquals(true,result);
	}
	
	
	@Test
	public void computerUseMoveCardTest() {
		ArrayList<Property> propertyList=PropertyListForTest();
		Player testPlayer=new Player(0);
		Property testProperty=propertyList.get(2);
		testProperty.setOwner(0);
		int proNumber=computerUseMoveCardForTest(propertyList,testPlayer);
		assertEquals(2,proNumber);
	}
	
	@Test
	public void computerUseMoveCardTest2() {
		ArrayList<Property> propertyList=PropertyListForTest();
		Player testPlayer=new Player(0);
		Property testProperty=propertyList.get(2);
		testProperty.setOwner(5);
		int proNumber=computerUseMoveCardForTest(propertyList,testPlayer);
		assertEquals(2,proNumber);
	}
	
	
	

	
	

}
