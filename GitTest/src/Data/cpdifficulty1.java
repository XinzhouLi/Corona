package com.Data; 
import java.util.ArrayList;  
import java.util.Random;
import com.Function.*;

/**
 * Represents the intelligence logic that determines the 
 * first CPU difficulty. This class is the child 
 * to the parent class computerPlayer.
 *
 */
public class cpdifficulty1 extends computerPlayer{
	private int difficulty = 1;
	
	/** Constructs a difficulty instance
	 * of cpdifficulty1.
	 * @param player the player 
	 */
	public cpdifficulty1(Player player) {
		super(player);
		
	}
	
	/**
	 * Method allows computer to use the steal card to steal
	 * a property. 
	 * @param propertyList the list of properties on the board
	 * @param computerPlayer the computer player
	 * @return the integer value of the property 
	 */
	public static int computerUseStealCard(ArrayList<Property> propertyList,Player computerPlayer) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		int owner=propertyList.get(n).getOwner();
		int currentPlayerNumber=computerPlayer.getPlayerNumber();
		while(owner!=currentPlayerNumber) {
			n = rand.nextInt(20);
		}
		return n;
	}
	
	/**
	 * Method allows the computer to use the move 
	 * card.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 * @return the integer value of the property space
	 */
	public static int computerUseMoveCard(ArrayList<Property> propertyList,Player computerPlayer) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		return n;
	}
	
	/**
	 * Method allows the computer to use any of
	 * the available Random cards.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 */
	public static void computerUseRandom(ArrayList<Property> propertyList,Player computerPlayer) {
		int luckNumber=UsingRandomCard.reciveCard();
		
		if (luckNumber==1) {
			UsingRandomCard.jailCard(computerPlayer);
		}
		
		else if(luckNumber==2) {
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			System.out.println(""+computerPlayer.getPlayerName()+" gets the property "+chosenProperty.getPropertyName());
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
		}
		
		else if(luckNumber==3) {
			System.out.println("No cards, but got some money($200)!");
			UsingRandomCard.addMoney(computerPlayer);
		}
		
		else if(luckNumber==4) {
			System.out.println("No cards, and lost some money($200)!");
			UsingRandomCard.lostMoney(computerPlayer);
		}
		
		else if(luckNumber==5){
			System.out.println("Computer player "+computerPlayer.getPlayerNumber()+
								"Receive a move card");
			computerUseMoveCard(propertyList,computerPlayer);
		}
		
		else {
			System.out.println(""+computerPlayer.getPlayerName()+" receives $200 and a Rob card");
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			System.out.println(""+computerPlayer.getPlayerName()+" gets the property "+chosenProperty.getPropertyName());
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
			UsingRandomCard.addMoney(computerPlayer);
		}
	}
	
	/**
	 * Method inputs what happens when a computer uses 
	 * a random card into the GUI text box.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 * @param infotext the information printed in the GUI text box
	 */
	public static void GUIcomputerUseRandom(ArrayList<Property> propertyList,Player computerPlayer,String infotext) {
		int luckNumber=UsingRandomCard.reciveCard();
		if (luckNumber==1) {
			infotext+=computerPlayer.getPlayerName()+", goes to Jail!";
			UsingRandomCard.jailCard(computerPlayer);
		}
		
		else if(luckNumber ==2) {
			infotext+="Get a Steal Property card!";
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			infotext+=""+computerPlayer.getPlayerName()+", gets the property "+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
		}
		
		else if(luckNumber==3) {
			infotext+=computerPlayer.getPlayerName()+" doesn't get a card, but receives $200!";
			UsingRandomCard.addMoney(computerPlayer);
		}
		
		else if(luckNumber==4) {
			infotext+=computerPlayer.getPlayerName()+" doesn't get a card, but receives $200!";
			UsingRandomCard.lostMoney(computerPlayer);
		}
		
		else if(luckNumber==5){
			infotext+=computerPlayer.getPlayerNumber()+
								" Receives a Move card!";
			computerUseMoveCard(propertyList,computerPlayer);
		}
		
		else {
			infotext+=""+computerPlayer.getPlayerName()+"Receive $200 and a Rob card!";
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			infotext+=""+computerPlayer.getPlayerName()+" gets the property "+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
			UsingRandomCard.addMoney(computerPlayer);
		}
	}
	
	
}
