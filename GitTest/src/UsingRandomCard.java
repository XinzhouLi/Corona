import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/** UsingRandomCard class implements the effects of 
 * the six random cards available in-game, including
 * the jail, move, steal, gain/lose money, etcetera.
*/
public class UsingRandomCard {
	
	/**
	 * Method puts player in jail.
	 * @param player the player that the card affects 
	 */
	public static void jailCard(Player player) {
		System.out.println("How unlucky! You must now go to jail!");
		player.setLocation(Constant.JAIL);
	}
	
	/**
	 * Method allows player to steal another player's property. 
	 * @return the corresponding property number in the property list
	 */
	public static int posStealCard() {
		System.out.println("Which property woud you like to take (from 0 to 19)?"
				+ " Can't take Jail, GO, or Random.");
		Scanner number = new Scanner(System.in);
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
	 * Method assigns a random Card to a player. 
	 * @return the numerical value of the card received.
	 */
	public static int reciveCard() {
		int number = new Random().nextInt(6) + 1;
		return number;
	}
	
	/**
	 * Method lets player move to a different locaiton on the board. 
	 * @param player the player the move card affects
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
	 * Method allows player to steal another player's property
	 * @param propertyList the list of properties on the board
	 * @param player the player the card affects
	 * @param propertyNumber the property's corresponding number int he property list
	 */
	public static void useStealCard(ArrayList<Property> propertyList, Player player, int propertyNumber) {
		int playerNumber = player.getPlayerNumber();
		Property property = propertyList.get(propertyNumber);
		property.setOwner(playerNumber);
	}
	
	/**
	 * Method allows player to gain money.
	 * @param player the player that the card affects
	 */
	public static void addMoney(Player player) {
		player.setMoney(player.getMoney()+Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
	
	/**
	 * Method makes player lose money
	 * @param player
	 */
	public static void lostMoney(Player player) {
		player.setMoney(player.getMoney() - Constant.RONDOM_CARD_MONEY_AMOUNT);
	}
		
	/**
	 * Method will plater to use any of the Random Cards they may possess. 
	 * @param propertyList the list of properties 
	 * @param player the player the method affects. 
	 */	
	public static void humanUseRandomCard(ArrayList<Property> propertyList, Player player) {
		int luckNumber = reciveCard();
		if (luckNumber == 1) {
			jailCard(player);
		} else if(luckNumber == 2) {
			int propertyNumber=posStealCard();
			useStealCard(propertyList, player, propertyNumber);
		} else if(luckNumber == 3) {
			System.out.println("do not get any card, but recive the money(200)");
			addMoney(player);
		} else if(luckNumber == 4) {
			System.out.println("do not get any card and lose the money(200)");
			lostMoney(player);
		} else if(luckNumber == 5){
			moveCard(player);
		} else {
			System.out.println("Recive 200 money a rob card");
			int propertyNumber=posStealCard();
			useStealCard(propertyList, player, propertyNumber);
			addMoney(player);
		}
	}
}
