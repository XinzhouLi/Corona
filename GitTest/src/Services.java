import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Services {
	
	/**
	 * Updates location of the player. Allows player to roll
	 * a six-side die.
	 * @param p Holds info on player
	 */
	public static void locationUpdate(Player p) { 
		Random rand=new Random();
		int diceNumber=rand.nextInt(7);
		while(diceNumber==0) {
			diceNumber=rand.nextInt(7);
		}
		int location=p.getLocation();
		location+=diceNumber;
		System.out.println("Rolled a " + diceNumber);
		location = location % 19;
		p.setLocation(location);
	}
	/**
	 * Method transfers one player's funds to another player's bank in the form of rent.
	 * @param player Holds info on player. 
	 * @param propertyList Hold ArrayList of properties 
	 * @param propertyList Hold ArrayList of players 
	 */
	public static void rent(Player player,ArrayList<Property> propertyList,ArrayList<Player> playersList) {
		int location=player.getLocation();
		Player landOwner = searchPlayer(location, propertyList, playersList);
		System.out.println(player.getPlayerName()+" pays "+propertyList.get(location).getRent()+" to "+landOwner.getPlayerName());
		Transfer(player,landOwner,propertyList.get(location).getRent());
		System.out.println("Rent paid!");
		
	}
	/**
	 * Transfers funds from the landOwner to another player. 
	 * @param a Holds info on Player 
	 * @param landOwner Holds info on who owns the land 
	 * @param moenyAmount holds info on the amount of money 
	 */
	
	public static void Transfer(Player currentPlay,Player landOwner, int moneyAmount) {
		currentPlay.setMoney(currentPlay.getMoney() - moneyAmount);
		landOwner.setMoney(landOwner.getMoney() + moneyAmount);
	}
	/**
	 * Public, static method that makes player pay jailer. 
	 * @param player Holds information on player.
	 * @param landInformation
	 * @param propertyList
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
	 */
	public static void buildHouse(Player player,ArrayList<Property> properties) {
		int money = player.getMoney();
		Property currentProperty = properties.get(player.getLocation());
		if (player.getMoney()>=150) {
			properties.get(player.getLocation()).setOwner(player.getPlayerNumber());
			money -= 150;
			player.setMoney(money);
			currentProperty.setBuilding(currentProperty.getBuilding() + 1);
			currentProperty.setRent(currentProperty.getRent() + Constant.INCREASING_RENT);
			System.out.println("Build a hotel, rent increasing!");
		} else {
			System.out.println("Not enough Money");
		}
	}
	
	
	/**
	 * Method allows player to sell owned property/land.
	 * @param player the player and all their information
	 * @param properties the list of properties available on the board
	 * @param propertyLocation the number that corresponds with the property in the list
	 */
	public static void sellLand(Player player,ArrayList<Property> properties, int propertyLocation) {
		int location = player.getLocation();
		int moneyUpdate = player.getMoney();
		if(properties.get(propertyLocation).getOwner()==player.getPlayerNumber()&&
				propertyLocation!=0 &&
				propertyLocation!=5 &&
				propertyLocation!=10 &&
				propertyLocation!=15) 
		{
			System.out.println("Sell the "+properties.get(propertyLocation).getPropertyName()+" Ownner is "+properties.get(propertyLocation).getOwner() +" "+properties.get(propertyLocation).getRent() );
			moneyUpdate+=properties.get(propertyLocation).getRent();
			player.setMoney(moneyUpdate);
			properties.get(propertyLocation).setOwner(5);
		} else {
//			System.out.println("That property does not belong to you");
		}
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

	/**
	 * Tests if players' money is above $0. 
	 * @param playerList the list of players
	 * @return temp the boolean value that determines if a player has over $0
	 */
	public static boolean winingCondiction(ArrayList<Player> playerList) {
		boolean temp = playerList.get(0).getMoney()>0 && 
				playerList.get(1).getMoney()>0 &&
				playerList.get(2).getMoney()>0&&
				playerList.get(3).getMoney()>0; 
		return temp;
		
	}
	
	/**
	 * Locates the winner on the board
	 * @param playersList the list of players
	 * @param propertiesList the list of properties
	 */
	public static void findWinner(ArrayList<Player> playersList, ArrayList<Property> propertiesList) {
		for (int propertyLocation = 0; propertyLocation < 20; propertyLocation++) {
			for(Player iPlayer : playersList) {
				sellLand(iPlayer, propertiesList, propertyLocation);
			}
		}
	
		ArrayList<Integer> finalScore = new ArrayList<>();
		finalScore.add(playersList.get(0).getMoney());
		finalScore.add(playersList.get(1).getMoney());
		finalScore.add(playersList.get(2).getMoney());
		finalScore.add(playersList.get(3).getMoney());
		System.out.println(finalScore.toString());
		finalScore.sort(null);
		System.out.println(finalScore.toString());
		for (Player player : playersList) {
			if (player.getMoney() == finalScore.get(finalScore.size()-1)) {
				System.out.println("Winner is " + player.getPlayerName());
				System.out.println(player.getMoney());
			}
		}
	}
}
	

	
	
	
	
	
	