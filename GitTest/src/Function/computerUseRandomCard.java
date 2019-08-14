package com.Function;
import java.util.ArrayList;
import com.Data.*;

public class computerUseRandomCard {
	
	/**
	 * Method allows computer player to choose another player's property,
	 * so long as it has the highest rent
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 * @return the position of the highest rent valued property
	 */
	public static int computerUseStealCard(ArrayList<Property> propertyList,Player computerPlayer) {
		int highestRent = 0;
		Property highestRentProperty = null;
		for(Property i :propertyList) {
			if (i.getOwner()!=computerPlayer.getPlayerNumber()&&i.getRent()>highestRent) {
				highestRent=i.getRent();
				}
			}
		for(Property x:propertyList) {
			if(x.getRent()==highestRent&&x.getOwner()!=computerPlayer.getPlayerNumber()) {
				highestRentProperty=x;
			}
		}
		return highestRentProperty.getPosition();
	}
	
	/**
	 * Method allows computer player to check if there are any unowned or empty
	 * properties.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 * @return the boolean value if property is empty
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
	 * Method allows computer player to use the Random card
	 * to move to unowned properties. If all properties owned, computer will move
	 * to his/her own property to build.
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
	 * Method allows computer to automatically use the Move card and Steal
	 * card.
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
			System.out.println("No cards, and lost $200!");
			UsingRandomCard.lostMoney(computerPlayer);
		} else if(luckNumber==5){
			System.out.println("Computer player "+computerPlayer.getPlayerNumber()+ " receives a Move card!");
			computerUseMoveCard(propertyList,computerPlayer);
		} else {
			System.out.println(""+computerPlayer.getPlayerName()+" receives $200 and a Rob card!");
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			System.out.println(""+computerPlayer.getPlayerName()+" gets the property "+chosenProperty.getPropertyName());
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
			UsingRandomCard.addMoney(computerPlayer);
		}
	}
	
	/**
	 * Method displays the computer's use of Random cards
	 * to the GUI text box for player viewing.
	 * @param propertyList the list of properties
	 * @param computerPlayer the computer player
	 * @param infotext the text to be displayed in the GUI text box.
	 */
	public static void GUIcomputerUseRandom(ArrayList<Property> propertyList,Player computerPlayer,String infotext) {
		int luckNumber=UsingRandomCard.reciveCard();
		if (luckNumber==1) {
			infotext+=computerPlayer.getPlayerName()+" goes to Jail!";
			UsingRandomCard.jailCard(computerPlayer);
		} else if(luckNumber==2) {
			infotext+="Got a Steal Property card!";
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			infotext+=""+computerPlayer.getPlayerName()+" gets the property "+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
		} else if(luckNumber==3) {
			infotext+=computerPlayer.getPlayerName()+" gets no cards, but received $200!";
			UsingRandomCard.addMoney(computerPlayer);
		} else if(luckNumber==4) {
			infotext+=computerPlayer.getPlayerName()+" gets no cards, and loses $200!";
			UsingRandomCard.lostMoney(computerPlayer);
		} else if(luckNumber==5){
			infotext+=computerPlayer.getPlayerNumber()+ " receives a Move card";
			computerUseMoveCard(propertyList,computerPlayer);
		} else {
			infotext+=""+computerPlayer.getPlayerName()+" receives $200 and a Rob card!";
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			infotext+=""+computerPlayer.getPlayerName()+" gets the property "+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
			UsingRandomCard.addMoney(computerPlayer);
		}
	}
}
