import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UsingRandomCard {

	public static void jailCard(Player player) {
		System.out.println("Unlucky,go to the jail");
		player.setLocation(Constant.JAIL);
	}
	
	
	
	public static int posRobCard() {
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
	
	
	public static int reciveCard() {
		int number=new Random().nextInt(7);
		while (number==0) {
			number=1;
		}
		return number;
	}
	

	
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

	
	public static void useRobCard(ArrayList<Property> propertyList,Player player,int propertyNumber) {
		int playerNumber=player.getPlayerNumber();
		Property property=Services.searchProperty(propertyNumber,propertyList);
		property.setOwner(playerNumber);
	}
	
	
	public static void addMoney(Player player) {
		player.setMoney(player.getMoney()+Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
	
	
	public static void lostMoney(Player player) {
		player.setMoney(player.getMoney()-Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
		
		
	
	public static void randomCard(ArrayList<Property> propertyList,Player player) {
		int luckNumber=reciveCard();
		if (luckNumber==1) {
			jailCard(player);
		}
		else if(luckNumber==2) {
			int propertyNumber=posRobCard();
			useRobCard(propertyList,player,propertyNumber);
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
			int propertyNumber=posRobCard();
			useRobCard(propertyList,player,propertyNumber);
			addMoney(player);
		}
	}
}
