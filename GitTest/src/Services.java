import java.util.ArrayList;
import java.util.Random;
public class Services {

	/**
	 * Updates location of the player. Allows player to roll
	 * a six-side die.
	 * @param p Holds info on player
	 */
	public static void locationUpdate(Player p) { 
		Random rand=new Random();
		int diceNumber=rand.nextInt(6) + 1;
		//while(diceNumber==0) {
			//diceNumber=rand.nextInt(7);
		//}
		int location=p.getLocation();
		location+=diceNumber;
		System.out.println("Rolled a " + diceNumber);
		location = location % 11;
		p.setLocation(location);
	}
	/**
	 * Method transfers one player's funds to another player's bank in the form of rent.
	 * @param player Holds info on player. 
	 * @param landOwner Hold info on who owns the property
	 * @param landInformation Hold info on what kind of property it is
	 * @param propertyList Hold ArrayList of properties 
	 */
	public static void rent(Player player,Player landOwner,Property landInformation,ArrayList<Integer> propertyList) {
		int location=player.getLocation();
		if(propertyList.get(location)!=player.getPlayerNumber()&&location!=6) {
				System.out.println(player.getPlayerName()+" pays "+landInformation.getRent()+" to "+landOwner.getPlayerName());
				Transfer(player,landOwner,landInformation.getRent());
				System.out.println("Rent paid!");
		}
	}
	/**
	 * Transfers funds from the landOwner to another player. 
	 * @param a Holds info on Player 
	 * @param landOwner Holds info on who owns the land 
	 * @param moenyAmount holds info on the amount of money 
	 */
	
	public static void Transfer(Player a,Player landOwner, int moneyAmount) {
		if(a != landOwner) {
		a.setMoney(a.getMoney() + moneyAmount);
		landOwner.setMoney(landOwner.getMoney() - moneyAmount);
		}
	}
	/**
	 * Public, static method that makes player pay jailer. 
	 * @param player Holds information on player.
	 * @param landInformation
	 * @param propertyList
	 */
	
	public static void payJail(Player player,Property landInformation,ArrayList<Integer> propertyList) {
		int location=player.getLocation();
		int moneyRemained=player.getMoney();
		if(location==6) {
			System.out.println("Go to Jail, pay 50 dollars.");
			moneyRemained-=50;
		}player.setMoney(moneyRemained);
	}
	/**
	 * Method allows player to buy land using their money. 
	 * @param player Holds info on player
	 * @param propertyList Holds all the properties in a list. 
	 * @param landInformation Holds information on the type of land
	 */
	public static void buyLand(Player player,ArrayList<Integer> propertyList,Property landInformation) {
		int location=player.getLocation();
		if(location !=6 && propertyList.get(location) == 0 && location!= 0) {
			if (landInformation.getOwner() == 5) {
				propertyList.set(location,player.getPlayerNumber());
				player.setMoney(player.getMoney()-landInformation.getCost());
				landInformation.setOwner(player.getPlayerNumber());
				player.addProperty(landInformation.getPropertyName());
				System.out.println("Property bought!");
			}
		}
	}
	/**
	 * Method allows player to sell land to gain money.  
	 * @param player Holds info on player
	 * @param propertyList Holds all the properties in a list. 
	 * @param landInformation Holds information on the type of land
	 */
	
	public static void sellLand(Player player,ArrayList<Integer> propertyList,Property landInformation) {
		int location=player.getLocation();
		int moneyUpdate=player.getMoney();
		if(propertyList.get(location)==player.getPlayerNumber()) {
			System.out.println("Buy the land");
			moneyUpdate+=(int) (landInformation.getCost()*0.75);
			player.setMoney(moneyUpdate);
		}
	}
	public static void sellLandEnd() {
		
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
	 * Method searches if the property the player has landed on is in the property list
	 * @param position the player's position
	 * @param propertieslist has all the properties in the list.
	 * @return j, or if the player's position matched the position of the property. 
	 */
	
	public static Property searchProperty(int position, ArrayList<Property> propertieslist) { 

			for (Property j :propertieslist) {
				if (position == j.getPosition()) {
					return j;
				}
			}
		return null;
	}
	public static void findWinner(Player p0,Player p1,Player p2,Player p3) {
		ArrayList<Integer> finalScore = new ArrayList<>();
		finalScore.add(p0.getMoney());
		finalScore.add(p1.getMoney());
		finalScore.add(p2.getMoney());
		finalScore.add(p3.getMoney());
		finalScore.sort(null);
		if (p0.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p0.getPlayerName());
		}else if (p1.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p1.getPlayerName());
		}else if (p2.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p2.getPlayerName());
		}else if (p3.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p3.getPlayerName());
		}
	}
	public static void startTurn(Player p0,Player p1,Player p2,Player p3,ArrayList<Player> playerList,ArrayList propertiesList,ArrayList propertyPosList) {
		while ( p0.getMoney()>=0 &&
				p1.getMoney()>=0&&
				p2.getMoney()>=0&&
				p3.getMoney()>=0) {   
//start round
		for (Player player:playerList) {
			System.out.println(player.getPlayerName() + "'s turn");
			System.out.println("Money: " + player.getMoney());
			System.out.println("Location: " + player.getLocation());
			Services.locationUpdate(player);
			System.out.println("Location: " + player.getLocation());
			System.out.println("Properties: " + player.getProperties());
			if (player.getLocation()==6) {
				Services.payJail(player, null, null);
			}
			int the_owner = Services.searchProperty(player.getLocation(),propertiesList).getOwner();
			Property players_property = Services.searchProperty(player.getLocation(),propertiesList);
			if(the_owner != 5) { //If Owner is not Bank
				if(player.getPlayerNumber() != the_owner) { //If Property is owned by another player, pay Rent
					if(the_owner == 0) {
						Services.rent(player, p0, players_property, propertyPosList);
					}
					if(the_owner == 1) {
						Services.rent(player, p1, players_property, propertyPosList);
					}
					if(the_owner == 2) {
						Services.rent(player, p2, players_property, propertyPosList);
					}
					if(the_owner == 3) {
						Services.rent(player, p2, players_property, propertyPosList);
					}
				else {
					;
				}
				}
			}
			if (the_owner == 5) { //If Owner is Bank
				Services.buyLand(player, propertyPosList, Services.searchProperty(player.getLocation(),propertiesList));
			}
			System.out.println(player.getPlayerName() + ": End turn");
			System.out.println("");
			}
		}

	System.out.println("End game");
	}

}

	
