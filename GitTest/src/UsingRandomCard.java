package com.Function;
import java.awt.Button;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import com.Data.*;

/**
 * Class represents the information and methods needed 
 * for the human player to use Random cards.
 *
 */
public class UsingRandomCard {
	
	/**
	 * Method sends the player to jail.
	 * @param player the player
	 */
	public static void jailCard(Player player) {
		System.out.println("How unlucky! Got a Jail card, so you were sent to Jail!");
		player.setLocation(Constant.JAIL);
	}
	
	/**
	 * Method allows player to steal another player's property. Checks
	 * if the player's number entered is a special space (Jail, Random, Go)
	 * @return the corresponding integer value of the property
	 */
	public static int posStealCard() {
		System.out.println("Which property woud you like to take(from 0 to 19)?"
				+ " Can't take Jail, GO or random.");
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
	
	/**
	 * Method randomly gives out a Random card 
	 * to the player.
	 * @return the numebr of the random card.
	 */
	public static int reciveCard() {
		int number = new Random().nextInt(7);
		while (number==0) {
			number=1;
		}
		return number;
	}
	
	/**
	 * Method sets the player's new location on the board
	 * with the Move card.
	 * @param i the integer value of the location board space
	 * @param player the player
	 */
	public static void moveCardGUI(int i,Player player) {
		player.setLocation(i);
	}
	
	/**
	 * Moves the player to a desired location on the board.
	 * @param player the player
	 * @param num the number of the property on the board
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
	
	/**
	 * Allows player to steal another player's property.
	 * @param propertyList the list of properties
	 * @param player the player
	 * @param propertyNumber the number coresponding to the property
	 */
	public static void useStealCard(ArrayList<Property> propertyList,Player player,int propertyNumber) {
		int playerNumber=player.getPlayerNumber();
		Property property=propertyList.get(propertyNumber);
		property.setOwner(playerNumber);
	}
	
	/**
	 * Method gives money to the player
	 * @param player the player
	 */
	public static void addMoney(Player player) {
		player.setMoney(player.getMoney()+Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
	
	/**
	 * Method decreases player's money
	 * @param player the player
	 */
	public static void lostMoney(Player player) {
		player.setMoney(player.getMoney()-Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
		
	/**
	 * Method allows human to use the Random card
	 * he/she is given
	 * @param propertyList the list of properties
	 * @param player the player
	 */
	public static void humanUseRandomCard(ArrayList<Property> propertyList,Player player) {
		int luckNumber=reciveCard();
		if (luckNumber==1) {
			jailCard(player);
		} else if(luckNumber==2) {
			int propertyNumber=posStealCard();
			useStealCard(propertyList,player,propertyNumber);
		} else if(luckNumber==3) {
			System.out.println("No cards, but received $200!");
			addMoney(player);
		} else if(luckNumber==4) {
			System.out.println("No cards, and lost $200!");
			lostMoney(player);
		} else if(luckNumber==5){
			moveCard(player);
		} else {
			System.out.println("Receive $200 and a Rob card!");
			int propertyNumber=posStealCard();
			useStealCard(propertyList,player,propertyNumber);
			addMoney(player);
		}
	}
	
	/**
	 * Method stores the information that would be printed
	 * on the GUI text box when the human player uses a Random
	 * card.
	 * @param propertyList the list of properties
	 * @param player the player
	 * @param infotext the information displayed in the GUI text box
	 */
	public static void GUIhumanUseRandomCard(ArrayList<Property> propertyList, Player player, String infotext) {
		int luckNumber=reciveCard();
		if (luckNumber==1) {
			jailCard(player);
		} else if(luckNumber==3) {
			infotext+="No cards, but received $200!";
			addMoney(player);
		}
		else if(luckNumber==4) {
			infotext+="No cards, and lost $200!";
			lostMoney(player);
		} else {		
			if (luckNumber==2) {
				int propertyNumber=Constant.CHOSENNUM;
				useStealCard(propertyList,player,propertyNumber);
			} else if(luckNumber==5) {
				moveCardGUI(Constant.CHOSENNUM, player);
				
			} else {
				int propertyNumber=Constant.CHOSENNUM;
				useStealCard(propertyList,player, propertyNumber);
				int money=player.getMoney();
				player.setMoney(money+200);	
			}
		}
		Constant.CHOSENNUM = 20;
	}
}
