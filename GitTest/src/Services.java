import java.util.ArrayList;
import java.util.Random;
public class Services {

	/**
	 * Public, static method that rolls a six-sided die. 
	 * @return diceNumber, or the random value of the dice roll.
	 */
	public static int diceNumber() {
		Random rand=new Random();
		int diceNumber=rand.nextInt(7);
		while(diceNumber==0) {
			diceNumber=rand.nextInt(7);
		}
		return diceNumber;
	}
	
	/**
	 * Public, static method with void return type that 
	 * updates the current location of the player.
	 * @param p A variable holding the player's information.
	 */
	public static void locationUpdate(Player p) {
		int location=p.getLocation();
		location+=diceNumber();
		if(location>=11) {
			location-=11;
		}
		p.setLocation(location);

	}
	
	/**
	 * Public, static method with return type void that gets information
	 * on the player's location and makes them pay rent if they are on a property board
	 * space owned by another player. 
	 * @param player Holds info on who the player is
	 * @param landOwner Holds info on who owns the property
	 * @param landInformation Holds info on what kind of property it is
	 * @param propertyList Holds an array list of information of all player's properties
	 */
	public static void rent(Player player,Player landOwner,Property landInformation,ArrayList<Integer> propertyList) {
		int location=player.getLocation();
		System.out.println(location);
		if(propertyList.get(location)!=player.getPlayerNumber()&&location!=6) {
			System.out.println("player:"+player+"pay"+landInformation.getRent()+"to"+landOwner);
			Transfer(player,landOwner,landInformation.getRent());
		}
	}
	
	/**
	 * Transfers one player's funds to another player's bank. 
	 * @param a Holds information on the player
	 * @param landOwner Holds information on who owns the land
	 * @param moneyAmount Hold info on the money amount being transferred,
	 */
	public static void Transfer(Player a,Player landOwner, int moneyAmount) {
		a.setMoney(a.getMoney() + moneyAmount);
		landOwner.setMoney(landOwner.getMoney() - moneyAmount);
	}
	
	/**
	 * Public, static
	 * @param player Holds information on player.
	 * @param landInformation
	 * @param propertyList
	 */
	public static void payJail(Player player,Property landInformation,ArrayList<Integer> propertyList) {
		int location=player.getLocation();
		int moneyRemained=player.getMoney();
		if(location==6) {
			System.out.println("Get into the jail,pay 50 dollar.");
			moneyRemained-=50;
		}player.setMoney(moneyRemained);
	}
	
	public static void buyLand(Player player,ArrayList<Integer> propertyList,Property landInformation) {
		int location=player.getLocation();
		if(location!=6&&propertyList.get(location)==0&&location!=0) {
			propertyList.set(location,player.getPlayerNumber());
			player.setMoney(player.getMoney()-landInformation.getCost());
		}
	}
	
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
	
	public static Property searchProperty(int position, ArrayList<Property> propertieslist) { 

			for (Property j :propertieslist) {
				if (position == j.getPosition()) {
					return j;
				}
			}
		return null;
	}
}
