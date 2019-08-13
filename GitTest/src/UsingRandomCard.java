import java.awt.Button;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UsingRandomCard {
	//player will get into the jail after he get this card
	public static void jailCard(Player player) {
		System.out.println("Unlucky,go to the jail");
		player.setLocation(Constant.JAIL);
	}
	
	
	
	public static int posStealCard() {
		System.out.println("Which property woud you like to take(from 0 to 19)"
				+ "excepet jail, start location and random.");
		Scanner number=new Scanner(System.in);
		int propertyNumber=number.nextInt();
		while(propertyNumber<=Constant.START_POSITION
				||propertyNumber==Constant.JAIL
				||propertyNumber==Constant.FIRST_RANDOM
				||propertyNumber==Constant.SECOND_RANDOM
				||propertyNumber>Constant.MAXIMUM_LOCATION)
		{
			System.out.println("Which property woud you like to take");
			number=new Scanner(System.in);
			propertyNumber=number.nextInt();
		}
		return propertyNumber;
	}
	
	//decide which card will this player get.
	public static int reciveCard() {
		int number=new Random().nextInt(7);
		while (number==0) {
			number=1;
		}
		return number;
	}
	public static void moveCardGUI(int i,Player player) {
		player.setLocation(i);
	}
	
	
	public static void moveCard(Player player,int num) {
		System.out.println("Which location woud you like to go");
		Scanner number=new Scanner(System.in);
		int location=number.nextInt();
		while(location>Constant.MAXIMUM_LOCATION||location<Constant.MINIMUM_LOCATION)
		{
			System.out.println("Which location woud you like to go");
			number=new Scanner(System.in);
			location=number.nextInt();
		}
		location=num;
		player.setLocation(location);
	}
	

	//the player may move to any location he wants
	public static void moveCard(Player player) {
		System.out.println("Which location woud you like to go");
		Scanner number=new Scanner(System.in);
		int location=number.nextInt();
		while(location>Constant.MAXIMUM_LOCATION||location<Constant.MINIMUM_LOCATION)
		{
			System.out.println("Which location woud you like to go");
			number=new Scanner(System.in);
			location=number.nextInt();
		}
		player.setLocation(location);
	}

	// by the using of rob card, a property of others player becomes the player's property
	public static void useStealCard(ArrayList<Property> propertyList,Player player,int propertyNumber) {
		int playerNumber=player.getPlayerNumber();
		Property property=propertyList.get(propertyNumber);
		property.setOwner(playerNumber);
	}
	
	//get money
	public static void addMoney(Player player) {
		player.setMoney(player.getMoney()+Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
	
	//lose money
	public static void lostMoney(Player player) {
		player.setMoney(player.getMoney()-Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
		
		
	//automatically choose the card and use the card.
	public static void humanUseRandomCard(ArrayList<Property> propertyList,Player player) {
		int luckNumber=reciveCard();
		if (luckNumber==1) {
			jailCard(player);
		}
		else if(luckNumber==2) {
			int propertyNumber=posStealCard();
			useStealCard(propertyList,player,propertyNumber);
		}
		else if(luckNumber==3) {
			System.out.println("do not get any card, but recive the money(200)");
			addMoney(player);
		}
		else if(luckNumber==4) {
			System.out.println("do not get any card and lose the money(200)");
			lostMoney(player);
		}
		else if(luckNumber==5){
			moveCard(player);
		}
		else {
			System.out.println("Recive 200 money a rob card");
			
			int propertyNumber=posStealCard();
			useStealCard(propertyList,player,propertyNumber);
			addMoney(player);
		}
	}
	
	
	public static void GUIhumanUseRandomCard(ArrayList<Property> propertyList,Player player,String infotext) {
		int luckNumber=reciveCard();
		if (luckNumber==1) {
			jailCard(player);
		}
//		else if(luckNumber==2) {
//			int propertyNumber=posStealCard();
//			useStealCard(propertyList,player,propertyNumber);
//		}
		else if(luckNumber==3) {
			infotext+="do not get any card, but recive the money(200)";
			addMoney(player);
		}
		else if(luckNumber==4) {
			infotext+="do not get any card and lose the money(200)";
			lostMoney(player);
		}
//		else if(luckNumber==5){
//			moveCard(player);
//		}
		else {
			//value
		
			if (luckNumber==2) {
				int propertyNumber=Constant.CHOSENNUM;
				useStealCard(propertyList,player,propertyNumber);
				
			}
			else if(luckNumber==5) {
				moveCardGUI(Constant.CHOSENNUM, player);
				
			}
			else {
				int propertyNumber=Constant.CHOSENNUM;
				useStealCard(propertyList,player, propertyNumber);
				int money=player.getMoney();
				player.setMoney(money+200);
				
			}
		}
		Constant.CHOSENNUM = 20;
	}
}
