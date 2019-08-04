import java.util.Random;
import java.util.Scanner;

public class randomCard {
	public int randomCard;
	public static final int NO_CARD = 0;
	public static final int START_POSITION = 0;
	public static final int JAIL = 10;
	public static final int FIRST_RANDOM = 5;
	public static final int SECOND_RANDOM = 15;
	public static final int MINIMUM_LOCATION = 0;
	public static final int MAXIMUM_LOCATION = 19;
	
	// allow the player to recive random card during the game, 1 represents for stop card the player can not move for 1 turn
	//2stand for rob card, player can get a property from other player or the property that no one owns
	//3 stand for move card, player can choose the location they want to go
	
	/**
	 * Method grants the player a card.
	 */
	public void reciveCard() {
		int number = new Random().nextInt(4);
		if (number == 0) {
			number = 1;
		} 
		randomCard = number;
	}
	
	/**
	 * Method gets a card for the player. 
	 * @return the value held by the card
	 */
	public int getCard() {
		return randomCard;
	}
	
	/**
	 * Method checks if player has a card
	 * @return true of false if player card has any value
	 */
	public Boolean cardInBag() {
		return (getCard() > NO_CARD);
	}
	
	/**
	 * Method will 
	 */
	public int playerStopCard() {
		System.out.println("Which player will stop at next turn? Enter value between 0 to 4.");
		Scanner number = new Scanner(System.in);
		int playerNumber = number.nextInt();
		while(playerNumber<0||playerNumber>4)
		{
			System.out.println("Which player will stop at next turn? Enter value between 0 to 4.");
			number=new Scanner(System.in);
			playerNumber=number.nextInt();
		}
		System.out.println("player"+number+"will stop at next turn");
		return playerNumber;
	}
	
	
	
	public int posRobCard() {
		System.out.println("Which property woud you like to take(from 0 to 19)"
				+ "excepet jail,start location and random.");
		Scanner number=new Scanner(System.in);
		int propertyNumber=number.nextInt();
		while(propertyNumber<=START_POSITION
				||propertyNumber==JAIL
				||propertyNumber==FIRST_RANDOM
				||propertyNumber==SECOND_RANDOM
				||propertyNumber>MAXIMUM_LOCATION)
		{
			System.out.println("Which property woud you like to take");
			number=new Scanner(System.in);
			propertyNumber=number.nextInt();
		}
		return propertyNumber;
	}
}
