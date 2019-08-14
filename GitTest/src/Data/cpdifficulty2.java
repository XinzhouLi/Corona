package com.Data;
import java.util.ArrayList;
import com.Function.*;

/**
 * Represents the intelligence logic that determines 
 * the second level of CPU difficulty. This
 * class is the child of the parent class computerPLayer. 
 *
 */
public class cpdifficulty2 extends computerPlayer{
	private int difficulty = 2;
//	public cpdifficulty2(int PlayerNumber,int difficulty) {
//		super(PlayerNumber);
//		this.difficulty =difficulty;
//		// TODO Auto-generated constructor stub
//	}
	
//	public cpdifficulty2(Player player,int difficulty) {
//		super(player);
//		this.difficulty=difficulty;
//	}
	
//	public int getDifficulty() {
//		return this.difficulty;
//	}
	
	/**
	 * Constructs an instance of cpdifficulty2
	 * level of intelligence.
	 * @param player the player
	 */
	public cpdifficulty2(Player player) {
		super(player);
	}
	
	/**
	 * Method allows the computer to use the 
	 * Steal card in the game.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 * @return the property location that currently has the highest rent value
	 */
	public static int computerUseStealCard(ArrayList<Property> propertyList, Player computerPlayer) {
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
	
	/**
	 * Method checks if there are any empty/unowned properties
	 * on the game board.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 * @return the boolean result if location found
	 */
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
	
	/**
	 * Method lets computer player to use Move
	 * card to move to a desired location.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 */
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
		} else {
			for(Property i:propertyList) {
				if(i.getOwner()==computerPlayer.getPlayerNumber()) {
					computerPlayer.setLocation(i.getPosition());
					break;
				}
			}
		}
		
	}
	
	/**
	 * Method allows computer player to use any of the 
	 * random cards it has at its disposal.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 */
	public static void computerUseRandom(ArrayList<Property> propertyList,Player computerPlayer) {
		int luckNumber=UsingRandomCard.reciveCard();
		
		if (luckNumber==1) {
			UsingRandomCard.jailCard(computerPlayer);
		} else if(luckNumber==2) {
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			System.out.println(""+computerPlayer.getPlayerName()+" gets the property "+chosenProperty.getPropertyName());
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
		} else if(luckNumber==3) {
			System.out.println("No cards, but received $200!");
			UsingRandomCard.addMoney(computerPlayer);
		} else if(luckNumber==4) {
			System.out.println("No cards, but received $200!");
			UsingRandomCard.lostMoney(computerPlayer);
		} else if(luckNumber==5){
			System.out.println("Computer player "+computerPlayer.getPlayerNumber()+ " receives a Move card");
			computerUseMoveCard(propertyList,computerPlayer);
		}
		
		else {
			System.out.println(""+computerPlayer.getPlayerName()+" receives $200 and a Rob card");
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			System.out.println(""+computerPlayer.getPlayerName()+" gets the property"+chosenProperty.getPropertyName());
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
			UsingRandomCard.addMoney(computerPlayer);
		}
	}
	
	/**
	 * Method displays the computer player's random card
	 * info usage on the GUI text box.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 * @param infotext the text to be inputted
	 */
	public static void GUIcomputerUseRandom(ArrayList<Property> propertyList,Player computerPlayer,String infotext) {
		int luckNumber = UsingRandomCard.reciveCard();
		
		if (luckNumber==1) {
			infotext+=computerPlayer.getPlayerName()+"go tot the jail";
			UsingRandomCard.jailCard(computerPlayer);
		} else if(luckNumber==2) {
			infotext+="Get a steal property card";
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			infotext+=""+computerPlayer.getPlayerName()+" gets the property "+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
		} else if(luckNumber==3) {
			infotext+=computerPlayer.getPlayerName()+"No cards, but recieved $200!";
			UsingRandomCard.addMoney(computerPlayer);
		} else if(luckNumber==4) {
			infotext+=computerPlayer.getPlayerName()+"No cards, but received $200!";
			UsingRandomCard.lostMoney(computerPlayer);
		} else if(luckNumber==5){
			infotext+=computerPlayer.getPlayerNumber()+" receives a Move card";
			computerUseMoveCard(propertyList,computerPlayer);
		} else {
			infotext+=""+computerPlayer.getPlayerName()+" receives $200 and a Rob card";
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			infotext+=""+computerPlayer.getPlayerName()+" gets the property "+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
			UsingRandomCard.addMoney(computerPlayer);
		}
	}
	
}
