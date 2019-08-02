import java.util.ArrayList;

public class cpdifficulty2 {
	public static int computerUseStealCard(ArrayList<Property> propertyList,Player computerPlayer) {
		int highestRent=0;
		Property highestRentProperty=null;
		for(Property i :propertyList) {
			if (i.getOwner()!=computerPlayer.getPlayerNumber()&&i.getRent()>highestRent) {
				highestRent=i.getRent();
				}
			}
		for(Property i:propertyList) {
			if(i.getRent()==highestRent&&i.getOwner()!=computerPlayer.getPlayerNumber()) {
				highestRentProperty=i;
			}
		}
		return highestRentProperty.getPosition();
	}
	
	
	
	//this part of program allow the computer check if there are any property that do not owned by any player
	public static Boolean haveEmptyProperty(ArrayList<Property> propertyList,Player computerPlayer) {
		Boolean result=false;
		for(Property i:propertyList) {
			if(i.getOwner()==5
			&&i.getPosition()!=Constant.JAIL
			&&i.getPosition()!=Constant.FIRST_RANDOM
			&&i.getPosition()!=Constant.SECOND_RANDOM
			&&i.getPosition()!=Constant.START_POSITION) 
			{
					result=true;
					break;
			}
		}
		return result;
		
	}
	
	
	
	//if there is a property that no one owns the computer will move to that property,so that he/she can buy the property
	// if all the property is owned by players, the computer will move to his/her own property,so that she/he can build his property
	public static void computerUseMoveCard(ArrayList<Property> propertyList,Player computerPlayer) {
		
		if(haveEmptyProperty(propertyList,computerPlayer)) {
			for(Property i:propertyList) {
				if(i.getOwner()==5
				&&i.getPosition()!=Constant.JAIL
				&&i.getPosition()!=Constant.FIRST_RANDOM
				&&i.getPosition()!=Constant.SECOND_RANDOM
				&&i.getPosition()!=Constant.START_POSITION) 
				{	
					System.out.println(computerPlayer.getPlayerName()+"move to property"+i.getPosition());
					computerPlayer.setLocation(i.getPosition());
					break;
				}
			}
		}
		else {
			for(Property i:propertyList) {
				if(i.getOwner()==computerPlayer.getPlayerNumber()) {
					computerPlayer.setLocation(i.getPosition());
					break;
					
				}
			}
		}
		
	}
}
