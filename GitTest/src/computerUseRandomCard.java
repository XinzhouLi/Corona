import java.util.ArrayList;

public class computerUseRandomCard {
	
	/**
	 * Method allows computer player to steal another player's property
	 * @param propertyList the list of properties 
	 * @param computerPlayer the computer player
	 * @return the position of the property with the highest rent 
	 */
	public static int computerUseStealCard(ArrayList<Property> propertyList, Player computerPlayer) {
		int highestRent = 0;
		Property highestRentProperty = null;
		for(Property i : propertyList) {
			if (i.getOwner()!=computerPlayer.getPlayerNumber()&&i.getRent()>highestRent) {
				highestRent = i.getRent();
				}
			}
		for(Property i:propertyList) {
			if(i.getRent() == highestRent && i.getOwner() != computerPlayer.getPlayerNumber()) {
				highestRentProperty = i;
			}
		}
		return highestRentProperty.getPosition();
	}
	
	/**
	 * Computer checks if there are any properties now owned by the player
	 * @param propertyList the list of properties on the board 
	 * @param computerPlayer the computer player's information
	 * @return the boolean when property ownership by player is found  
	 */
	public static Boolean haveEmptyProperty(ArrayList<Property> propertyList, Player computerPlayer) {
		Boolean result = false;
		for(Property i:propertyList) {
			if(i.getOwner() == 5
			&& i.getPosition() != Constant.JAIL
			&& i.getPosition() != Constant.FIRST_RANDOM
			&& i.getPosition() != Constant.SECOND_RANDOM
			&& i.getPosition() != Constant.START_POSITION) 
			{
					result = true;
					break;
			}
		}
		return result;
		
	}
	
	//if there is a property that no one owns the computer will move to that property,so that he/she can buy the property
	// if all the property is owned by players, the computer will move to his/her own property,so that she/he can build his property
	/**
	 * 
	 * @param propertyList
	 * @param computerPlayer
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
	
	
	//exactly same as the human random card, but instead the computer player will use move card and steal card automatically.
	public static void computerUseRandom(ArrayList<Property> propertyList,Player computerPlayer) {
		int luckNumber=UsingRandomCard.reciveCard();
		
		if (luckNumber==1) {
			UsingRandomCard.jailCard(computerPlayer);
		}
		
		else if(luckNumber==2) {
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			System.out.println(""+computerPlayer.getPlayerName()+"get the property"+chosenProperty.getPropertyName());
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
		}
		
		else if(luckNumber==3) {
			System.out.println("do not get any card, but recive the money(200)");
			UsingRandomCard.addMoney(computerPlayer);
		}
		
		else if(luckNumber==4) {
			System.out.println("do not get any card and lose the money(200)");
			UsingRandomCard.lostMoney(computerPlayer);
		}
		
		else if(luckNumber==5){
			System.out.println("Computer player"+computerPlayer.getPlayerNumber()+
								"Recive a move card");
			computerUseMoveCard(propertyList,computerPlayer);
		}
		
		else {
			System.out.println(""+computerPlayer.getPlayerName()+ "recieves 200 money and robs a card");
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			System.out.println(""+computerPlayer.getPlayerName()+" get the property "+chosenProperty.getPropertyName());
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
			UsingRandomCard.addMoney(computerPlayer);
		}
	}
}
