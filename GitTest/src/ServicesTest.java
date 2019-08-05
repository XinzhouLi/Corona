import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ServicesTest {

	@Test
	public void testLocationUpdate() {
		Services a=new Services();
		Player player=new Player(1);
		player.setLocation(2);
		Services.locationUpdate(player,3);
		assertEquals("Test if player update the location",5,player.getLocation());
	}
	
	
	@Test
	public void testLocationUpdateForTwoTimes() {
		Services a=new Services();
		Player player=new Player(1);
		player.setLocation(2);
		Services.locationUpdate(player,3);
		Services.locationUpdate(player,5);
		assertEquals("Test if player update the location",10,player.getLocation());
	}
	
	
	
	@Test
	public void testLargeLocationUpdate() {
		Services a=new Services();
		Player player=new Player(1);
		player.setLocation(2);
		Services.locationUpdate(player,15);
		assertEquals("Test if player update the location",17,player.getLocation());
	}
	
	
	@Test
	public void testOverMapSizeLocationUpdate() {
		Services a=new Services();
		Player player=new Player(1);
		player.setLocation(18);
		Services.locationUpdate(player,2);
		assertEquals("check if the player update the location after over map size location",0,player.getLocation());
	}
	
	
	@Test
	public void testTransfer() {
		Services test=new Services();
		Player player=new Player(1);
		Player owner=new Player(2);
		player.setMoney(1000);
		owner.setMoney(1000);
		Services.Transfer(player,owner,200);
		assertEquals("check if player lose money",800,player.getMoney());
		assertEquals("check if player get money",1200,owner.getMoney());
	}
	
	
	@Test
	public void testNegativeTransfer() {
		Services test=new Services();
		Player player=new Player(1);
		Player owner=new Player(2);
		player.setMoney(0);
		owner.setMoney(0);
		Services.Transfer(player,owner,200);
		assertEquals("player may get a negative money amount, check if player lose money",-200,player.getMoney());
		assertEquals("check if owner get the money",200,owner.getMoney());
	}
	
	
	@Test
	public void testPayJail() {
		Services test=new Services();
		Player testPlayer=new Player(1);
		testPlayer.setLocation(10);
		Services.payJail(testPlayer);
		assertEquals("test if player pay the jail",1450 , testPlayer.getMoney());
	}
	
	
	@Test
	public void testNegativePayJail() {
		Services test=new Services();
		Player testPlayer=new Player(1);
		testPlayer.setLocation(10);
		testPlayer.setMoney(0);
		Services.payJail(testPlayer);
		assertEquals("test if player pay the jail even though the money amount becomes nagetive",-50 , testPlayer.getMoney());
	}
	
	
	@Test
	public void testBuyLand() {
		Services test=new Services();
		Player testPlayer=new Player(1);
		ArrayList<Property> propertyList=InitialList.propertiesList();
		testPlayer.setLocation(2);
		Property pro=propertyList.get(2);
		Services.buyLand(testPlayer,propertyList);
		assertEquals("Test if player lose money",1300,testPlayer.getMoney());
		assertEquals("Test the owner of the land",1,pro.getOwner());
		
	}
	
	
	@Test
	public void testNotEnoughMouneyBuyLand() {
		Services test=new Services();
		Player testPlayer=new Player(1);
		testPlayer.setMoney(100);
		ArrayList<Property> propertyList=InitialList.propertiesList();
		testPlayer.setLocation(2);
		Property pro=propertyList.get(2);
		Services.buyLand(testPlayer,propertyList);
		assertEquals("Player will not buy the land due to not enough money",100,testPlayer.getMoney());
		assertEquals("No one owns the money",5,pro.getOwner());
		
	}
	
	
	@Test
	public void testBuildHouse() {
		Services test=new Services();
		Player testPlayer=new Player(1);
		testPlayer.setLocation(2);
		String correct="Build a hotel, rent increasing!";
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Property pro=propertyList.get(2);
		pro.setOwner(0);
		String actual=Services.buildHouse(testPlayer,propertyList) ;
		assertEquals("Player buy the land,building level incerase by1",1,pro.getBuilding());
		assertEquals("Rent increase after build the building",350,pro.getRent());
		assertEquals(correct,actual);
		assertEquals("Money amount after the buying of the building",1350,testPlayer.getMoney());
	}
	
	
	@Test
	public void testNotEnoughMoneyForBuildHouse() {
		Services test=new Services();
		Player testPlayer=new Player(1);
		testPlayer.setLocation(2);
		testPlayer.setMoney(100);
		String correct="Not enough Money";
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Property pro=propertyList.get(2);
		pro.setOwner(0);
		String actual=Services.buildHouse(testPlayer,propertyList) ;
		assertEquals("Will not build the house because not enough money",0,pro.getBuilding());
		assertEquals("Rent will not increase due to not build the house",200,pro.getRent());
		assertEquals(correct,actual);
		assertEquals("Money amount will not decrease due to player do not increase the level of the building",100,testPlayer.getMoney());
	}
	
	@Test
	public void testBuildHouseForOtherPlayer() {
		Services test=new Services();
		Player testPlayer=new Player(1);
		Player testPlayer2=new Player(2);
		testPlayer.setLocation(2);
		String correct="Build a hotel, rent increasing!";
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Property pro=propertyList.get(2);
		pro.setOwner(2);
		String actual=Services.buildHouse(testPlayer,propertyList) ;
		assertEquals("Player buy the land,building level incerase by1",1,pro.getBuilding());
		assertEquals("Rent increase after build the building",350,pro.getRent());
		assertEquals(correct,actual);
		assertEquals("Money amount after the buying of the building decreases",1350,testPlayer.getMoney());
		assertEquals("Owner of the land will not be changed",2,pro.getOwner());
	}
	
	@Test
	public void testSellLand() {
		Services test=new Services();
		Player testPlayer=new Player(1);
		testPlayer.setLocation(2);
		String correct= "sell the land";
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Property pro=propertyList.get(2);
		pro.setOwner(1);
		String actual=Services.sellLand(testPlayer,propertyList,2);
		assertEquals("Player sell the land,building level remain 0",0,pro.getBuilding());
		assertEquals("Rent do not change after sell the building",200,pro.getRent());
		assertEquals(correct,actual);
		assertEquals("Money amount after the selling of the building increases",1700,testPlayer.getMoney());
		assertEquals("no one own this land",5,pro.getOwner());
	}
	
	@Test
	public void testSellLandNotBelongsToPlayer() {
		Services test=new Services();
		Player testPlayer=new Player(3);
		testPlayer.setLocation(2);
		String correct= "That property does not belong to you";
		ArrayList<Property> propertyList=InitialList.propertiesList();
		Property pro=propertyList.get(2);
		pro.setOwner(2);
		String actual=Services.sellLand(testPlayer,propertyList,2);
		assertEquals("building level remains 0",0,pro.getBuilding());
		assertEquals("Rent do not change after build the building",200,pro.getRent());
		assertEquals(correct,actual);
		assertEquals("Money amount will not changed",1500,testPlayer.getMoney());
		assertEquals("owner of the land will not changed",2,pro.getOwner());
	}
	
	
	@Test
	public void testSearchPlayer() {
		Services test=new Services();
		String testS="";
		InitialList testList=new InitialList();
		Player testPlayer=new Player(3);
		ArrayList<Property> propertyList=InitialList.propertiesList();
		ArrayList<Player> playerList=InitialList.playersList(testS);
		Property pro=propertyList.get(2);
		pro.setOwner(3);
		Player player=Services.searchPlayer(2,propertyList,playerList);
		int num=player.getPlayerNumber();
		assertEquals(3,num);
		}
	
	@Test
	public void testSearchPlayerNoOneOwns() {
		Services test=new Services();
		String testS="";
		InitialList testList=new InitialList();
		Player player=new Player(1);
		ArrayList<Property> propertyList=InitialList.propertiesList();
		ArrayList<Player> playerList=InitialList.playersList(testS);
		Property pro=propertyList.get(2);
		assertEquals(null,Services.searchPlayer(2,propertyList,playerList));
//		int num=player.getPlayerNumber();
//		assertEquals(5,num);
		}
	
	
	@Test
	public void testFalseWinCondition() {
		String s="";
		int num=0;
		ArrayList<Player> playerList=InitialList.playersList(s);
		Player player=playerList.get(0);
		player.setMoney(-100);
//		if(Services.winingCondiction(playerList)) {
//			num=1;
//		}
//		else {
//			num=0;
//		}
		assertEquals(false,Services.winingCondiction(playerList));
		
	
	}
	
	@Test
	public void testTrueWinCondition() {
		String s="";
		int num=0;
		ArrayList<Player> playerList=InitialList.playersList(s);
		Player player=playerList.get(0);
		player.setMoney(1100);

		assertEquals(true,Services.winingCondiction(playerList));
		
	
	}
		
	
	
	
}
