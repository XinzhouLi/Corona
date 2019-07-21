import java.util.ArrayList;
import java.util.Scanner;

public class Player{
	private int Money= Constant.INITAIAL_MONEY; //Player's money; will default to 1500 at the start of the game
	private int Location = 0;
	private ArrayList<String> Properties = new ArrayList<String>();
	private int PlayerNumber;
	private String PlayerName;

	/**
	 * Method will set money, location, associated property, player number, and player name.
	 */
	public Player(int Money, int Location, ArrayList<String> Properties, int PlayerNumber) { //Constructor
		setMoney(Money);
		setLocation(Location);
		setProperties(Properties);
		setPlayerNumber(PlayerNumber);
		setPlayerName();
	}
	
	/**
	 * Method acts as a copy constructor and sets a new instance of player's money, location, 
	 * properties, player number, and name.
	 * @param player Of type player and holds info on player's money, location, 
	 * properties, player number, and name.
	 */
	public Player (Player player){ //Copy Constructor
		 this.Money = player.Money;
		 this.Location = player.Location;
		 this.Properties = player.Properties;
		 this.PlayerNumber = player.PlayerNumber;
		 this.PlayerName = player.PlayerName;
	}

	/**
	 * Method sets player's amount of money.
	 */
	public void setMoney(int Money) {
		this.Money = Money;
	}
	
	/**
	 * Method sets player's current location as an integer value. 
	 */
	public void setLocation(int Location) {
		this.Location = Location;
	}
	
	/**
	 * Method will set properties belonging to the player. 
	 * @param Properties An ArrayList that hold values associated to each player.
	 */
	public void setProperties(ArrayList<String> Properties) {
		this.Properties = Properties;
	}
	
	/**
	 * Method will set player's name.
	 * @param PlayerNumber An integer that holds information on player's number.
	 */
	public void setPlayerNumber(int PlayerNumber) {
		this.PlayerNumber = PlayerNumber;
	}
	
	/**
	 * Method will set player name.
	 * @return a String that stores the user's input.  
	 */
	public String setPlayerName() {
		Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        return s;
	}
	
	/**
	 * Method adds property value to a list.
	 * @param element String value that holds info on the property element 
	 * being added to list
	 */
	public void addProperty(String element) { 
		Properties.add(element);
	}
	
	/**
	 * Method acts as getter, which gets a method. 
	 * @return Money, or amount of money held by player.
	 */
	public int getMoney() {
		return Money;
	}
	
	/**
	 * Method will get location of player. 
	 * @return Location, or the current location held by player.
	 */
	public int getLocation() {
		return Location;
	}
	
	/**
	 * Method gets the Array List of properties
	 * @return Properties, or the array list of proeprty values
	 */
	public ArrayList<String> getProperties(){
		return Properties;
	}
	
	/**
	 * Method gets player's number.
	 * @return PlayerNumber, or the integer value held by the Player.
	 */
	public int getPlayerNumber() {
		return PlayerNumber;
	}
	
	/**
	 * Method gets player's name. 
	 * @return PlayerName, or the String value of the Player's name.
	 */
	public String getPlayerName() {
		return PlayerName;
	}
	
}
