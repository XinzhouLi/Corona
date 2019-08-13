import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/** Represents the actions that can be enacted upon a player 
 * during a game, such as a dice rolling, selling land,
 * buying land, building houses, etcetera. 
*/
public class Services {
	
	/**
	 * Updates location of the player. Allows player to roll
	 * a six-side die.
	 * @param p Holds info on player
	 * @param diceNumber the number that will be rolled by the dice 
	 * @return the number rolled by dice
	 */
	
	//Use for Junit Test. due to can not get the random number.Location must between 0 and 19()
	public static int locationUpdate(Player p, int diceNumber) { 
		int location=p.getLocation();
		location+=diceNumber;
		System.out.println("Rolled a " + diceNumber);
		location = location % 20;
		p.setLocation(location);
		return diceNumber;
	}
	
	/** Updates the player's location on the map.
	 * @param p the player
	 * @return the number value of dice roll 
	 */
	public static int locationUpdate(Player p) { 
		Random rand = new Random();
		int diceNumber = rand.nextInt(7);
		while(diceNumber == 0) {
			diceNumber = rand.nextInt(7);
		}
		int location = p.getLocation();
		location += diceNumber;
		System.out.println("Rolled a " + diceNumber);
		location = location % 20;
		p.setLocation(location);
		return diceNumber;
	}
	

	/**
	 * Method transfers one player's funds to another player's bank in the form of rent.
	 * @param player the player playing the game 
	 * @param propertyList the list of properties on the board
	 * @param playersList the list of players in the game 
	 */
	
	public static void rent(Player player, ArrayList<Property> propertyList, ArrayList<Player> playersList) {
		int location=player.getLocation();
		Player landOwner = searchPlayer(location, propertyList, playersList);
		System.out.println(player.getPlayerName()+" pays "+propertyList.get(location).getRent()+" to "+landOwner.getPlayerName());
		Transfer(player, landOwner, propertyList.get(location).getRent());
		System.out.println("Rent paid!");
		
	}
	/**
	 * Transfers funds from the owner of the land to another player. 
	 * @param a Holds info on Player 
	 * @param landOwner Holds info on who owns the land 
	 * @param moneyAmount holds info on the amount of money 
	 */
	public static void Transfer(Player currentPlay,Player landOwner, int moneyAmount) {
		currentPlay.setMoney(currentPlay.getMoney() - moneyAmount);
		landOwner.setMoney(landOwner.getMoney() + moneyAmount);
	}
	/**
	 * Public, static method that makes player pay jailer. 
	 * @param player Holds information on player.
	 */
	
	public static void payJail(Player player) {
		
		int moneyRemained=player.getMoney();
		System.out.println("Go to Jail, pay 50 dollars.");
		moneyRemained-=50;
		player.setMoney(moneyRemained);
	}
	/**
	 * Method allows player to buy land using their money. 
	 * @param player Holds info on player
	 * @param propertyList Holds all the properties in a list. 
	 */
	public static void buyLand(Player player,ArrayList<Property> propertyList) {
		int location=player.getLocation();
		int money = player.getMoney();
		if (player.getMoney()>=200) {
			propertyList.get(location).setOwner(player.getPlayerNumber());
			money-=200;
			player.setMoney(money);
			System.out.println("Property bought!");
		}else {
			System.out.println("Not enough Money");
		}
	}
	/**
	 * Method allows player to sell land to gain money.  
	 * @param player Holds info on player
	 * @param propertyList Holds all the properties in a list. 
	 * @param landInformation Holds information on the type of land
	 */
	
	public static String buildHouse(Player player,ArrayList<Property> properties) {
		int money = player.getMoney();
		Property currentProperty = properties.get(player.getLocation());
		String text = "";
		if (player.getMoney()>=150) {
//			properties.get(player.getLocation()).setOwner(player.getPlayerNumber());
			money-=150;
			player.setMoney(money);
			currentProperty.setBuilding(currentProperty.getBuilding() + 1);
			currentProperty.setRent(currentProperty.getRent() + Constant.INCREASING_RENT);
			System.out.println("Build a hotel, rent increasing!");
			text = "Build a hotel, rent increasing!";
		}else {
			System.out.println("Not enough Money");
			text = "Not enough Money";
		}
		return text;
	}
	
	
	
	public static String sellLand(Player player,ArrayList<Property> properties,int propertyLocation) {
		String text = "";
		int location=player.getLocation();
		int moneyUpdate=player.getMoney();
		if(properties.get(propertyLocation).getOwner()==player.getPlayerNumber()&&
				propertyLocation!=0&&
				propertyLocation!=5&&
				propertyLocation!=10&&
				propertyLocation!=15) 
		{
			System.out.println("Sell the land");
			text = "sell the land";
			moneyUpdate+=properties.get(propertyLocation).getRent();
			player.setMoney(moneyUpdate);
			properties.get(propertyLocation).setOwner(5);
		} else {
			text = "That property does not belong to you!";
		}
		return text;
	}
	/**
	 * Checks which player is currently owning the property. 
	 * @param position holds info on the player's position in the list
	 * @param propertieslist holds info on all the properties
	 * @param playerslist holds info on the numbers corresponding to the player. 
	 * @return j, or if the current Player's number is equal to the Owner number in propertiesList
	 */

	public static Player searchPlayer(int position, ArrayList<Property> propertieslist, ArrayList<Player> playerslist) {
		for (Property i :propertieslist) {
			for (Player j :playerslist) {
				if (j.getPlayerNumber() == i.getOwner()) {
					return j;
				}
			}
		
		}
		return null;
	}
	
	public static boolean winingCondiction(ArrayList<Player> playerList) {
		boolean temp = playerList.get(0).getMoney()>0 && 
				playerList.get(1).getMoney()>0 &&
				playerList.get(2).getMoney()>0&&
				playerList.get(3).getMoney()>0; 
		return temp;
		
	}
	public static String checkGo(int location, Player player) {
		String text = "";
		if(location > player.getLocation()) {
			int money = player.getMoney();
			player.setMoney(money + 200);
			text = "You passed go! you get $200";
		}
		return text;
	}

	public static int findWinner( ArrayList<Player> playerslist, ArrayList<Property> propertieslist) {
		int integerWinner = 5;
		for (int propertyLocation = 0; propertyLocation < 20; propertyLocation++) {
			for(Player iPlayer : playerslist) {
				sellLand(iPlayer, propertieslist, propertyLocation );
			}
		}
	
		ArrayList<Integer> finalScore = new ArrayList<>();
		finalScore.add(playerslist.get(0).getMoney());
		finalScore.add(playerslist.get(1).getMoney());
		finalScore.add(playerslist.get(2).getMoney());
		finalScore.add(playerslist.get(3).getMoney());
		finalScore.sort(null);
		System.out.println(finalScore.toString());
		for (Player player :playerslist) {
			if (player.getMoney()==finalScore.get(finalScore.size()-1)) {
				integerWinner = player.getPlayerNumber();
			}
		}
		return integerWinner;
		}
	}

	

	
	
	
	
	
	