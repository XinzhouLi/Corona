import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UsingRandomCard {
	//player will get into the jail after he get this card
	public static void jailCard(Player player) {
		System.out.println("Unlucky,go to the jail");
		player.setLocation(Constant.JAIL);
	}
	
	
	//player has a chance to take any property he wants except jail,start position
	public static int posStealCard() {
		System.out.println("Which property woud you like to take(from 0 to 19)"
				+ "excepet jail,start location and random.");
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
	public static void useStealCard(ArrayList<Property> propertyList,Player player) {
		int propertyNumber=posStealCard();
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
	public static void randomCard(ArrayList<Property> propertyList,Player player) {
		int luckNumber=reciveCard();
		if (luckNumber==1) {
			jailCard(player);
		}
		else if(luckNumber==2) {

			useStealCard(propertyList,player);
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
			useStealCard(propertyList,player);
			addMoney(player);
		}
	}
}
