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
	 * Method will set player name
	 * @return
	 */
	public String setPlayerName() {
		Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        return s;
	}
	
	public void addProperty(String element) { 
		Properties.add(element);
	}
	
	public int getMoney() {
		return Money;
	}
	
	public int getLocation() {
		return Location;
	}
	
	public ArrayList<String> getProperties(){
		return Properties;
	}
	
	public int getPlayerNumber() {
		return PlayerNumber;
	}
	
	public String getPlayerName() {
		return PlayerName;
	}
	
}
