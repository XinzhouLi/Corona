import java.awt.Button;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/** Class implements usage of the random cards
 * upon the player
*/
public class UsingRandomCard {
	//player will get into the jail after he get this card
	/** Method sends player to Jail space.
	 * @param player the player playing
	 */
	public static void jailCard(Player player) {
		System.out.println("Unlucky,go to the jail");
		player.setLocation(Constant.JAIL);
	}
	
	
	
	//player has a chance to take any property he wants except jail,start position
//	public static int GUIposStealCard(int num,String infotext) {
//		infotext+="Which property woud you like to take(from 0 to 19)"   get input from user in GUI
//				+ "excepet jail,start location and random.";
//		Button a=new Button();
//		while(propertyNumber<=Constant.START_POSITION
//				||propertyNumber==Constant.JAIL
//				||propertyNumber==Constant.FIRST_RANDOM
//				||propertyNumber==Constant.SECOND_RANDOM
//				||propertyNumber>Constant.MAXIMUM_LOCATION)
//		{
//			System.out.println("Which property woud you like to take");
//			number=new Scanner(System.in);
//			propertyNumber=number.nextInt();
//		}
//		propertyNumber=num;
//		return propertyNumber;
//	}
	
	
	//create a method to get input from user for GUI called input() and return a int
	
	
	
	/** Allows player to steal property from another
	 * player. 
	 * @return the property's corresponding number.
	*/
	public static int posStealCard() {
		System.out.println("Which property woud you like to take (from 0 to 19)?"
				+ " Excepet Jail, GO and Random.");
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
	
	/**Randomly gives player a card.
	 * @return the number of the random card.
	 */
	public static int reciveCard() {
		int number=new Random().nextInt(7);
		while (number==0) {
			number=1;
		}
		return number;
	}

	/**
	 * Moves the player to a new space by setting location.
	 * @param i the numerical location of the player. 
	 * @param player the player
	 */
	public static void moveCardGUI(int i, Player player) {
		player.setLocation(i);
	}
	
	/**
	 * Method enacts move card to move 
	 * the player to a new board space. 
	 * @param player the player
	 * @param num the number of the new locations
	 */
	public static void moveCard(Player player, int num) {
		System.out.println("Which location woud you like to go?");
		Scanner number=new Scanner(System.in);
		int location=number.nextInt();
		while(location>Constant.MAXIMUM_LOCATION||location<Constant.MINIMUM_LOCATION)
		{
			System.out.println("Which location woud you like to go?");
			number=new Scanner(System.in);
			location=number.nextInt();
		}
		location=num;
		player.setLocation(location);
	}
	
	/**
	 * Method enacts move card to move 
	 * the player to a new board space; overloading.
	 * @param player the player
	 */
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

	/** Method allows use of the steal
	 * card to steal someone else's property
	 * @param propertyList the list of proeprties in the game
	 * @param player the player
	 * @param propertyNumber the number corresponding to the property
	 */
	public static void useStealCard(ArrayList<Property> propertyList,Player player,int propertyNumber) {
		int playerNumber=player.getPlayerNumber();
		Property property=propertyList.get(propertyNumber);
		property.setOwner(playerNumber);
	}
	
	/**
	 * Adds money to the player.
	 * @param player the player 
	 */
	public static void addMoney(Player player) {
		player.setMoney(player.getMoney()+Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
	
	/**
	 * Takes money from the player
	 * @param player the player
	 */
	public static void lostMoney(Player player) {
		player.setMoney(player.getMoney()-Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
		
		
	/**
	 * Method automatically chooses the card to use for human player.
	 * @param propertyList the list of properties
	 * @param player the player
	 */
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
			while (Constant.ChosenNum>19) {
				Constant.ChosenNum>19=Constant.chosenNum;
			}
			
			if (luckNumber==2) {
				int propertyNumber=Constant.ChosenNum;
				useStealCard(propertyList,player,propertyNumber);
				
			}
			else if(luckNumber==5) {
				moveCardGUI(Constant.ChosenNum ,player);
				
			}
			else {
				int propertyNumber=Constant.ChosenNum;
				useStealCard(propertyList,player,propertyNumber);
				int money=player.getMoney();
				player.setMoney(money+200);
				
			}
		}
		Constant.ChosenNum=20;
	}
}
