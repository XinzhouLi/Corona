package com.Data;
import java.util.ArrayList; 
import java.util.Scanner;
import com.Function.*;

/** Represents all information of the player,
 * including their money, location, properties, 
 * numbers, name, and ways to manipulate that data. 
*/
public class Player {
	private int Money = Constant.INITAIAL_MONEY; //Player's money; will default to 1500 at the start of the game
	private int Location = 0;
	private ArrayList<String> Property_Names = new ArrayList<String>();
	private int PlayerNumber;
	private String PlayerName;
	private int moneyLost = 50;
	
	/**
	 * Constructs player's info, such as money, location, and number.
	 * @param playerNumber the player's number within the game
	 */
	public Player(int playerNumber) { 
		setMoney(Money);
		setLocation(Location);
		setPlayerNumber(playerNumber);
		setHumanPlayerName(PlayerName);
		 
	}
	
	/**
	 * Method acts as a copy constructor and sets a new instance of player's money, location, 
	 * properties, player number, and name.
	 * @param player holds info on player's money, location, properties, player number, and name.
	 */
	public Player (Player player){ 
		 this.Money = player.Money;
		 this.Location = player.Location;
		 this.PlayerNumber = player.PlayerNumber;
		 this.PlayerName = player.PlayerName;
	}

	/**
	 * Method sets player's amount of money.
	 * @param Money the money amount 
	 */
	public void setMoney(int Money) {
		this.Money = Money;
	}
	
	/**
	 * Method sets player's current location as an integer value. 
	 * @param Location the location value 
	 */
	public void setLocation(int Location) {
		this.Location = Location;
	}
	
	/**
	 * Method will set properties belonging to the player. 
	 * @param properties the ArrayList that holds properties
	 */
	public void setProperties(ArrayList<String> properties) {
		this.Property_Names = properties;
	}
	
	/**
	 * Method will set player's name.
	 * @param PlayerNumber the integer that holds information on player's number.
	 */
	public void setPlayerNumber(int playerNumber) {
		this.PlayerNumber = playerNumber;
	}
	
	/**
	 * Method will set player name.
	 * @param name the user's name.  
	 */
	public void setPlayerName(String name) {
		this.PlayerName = name;
	}
	
	/**
	 * Method adds property value to a list.
	 * @param element the element in the properties ArrayList 
	 */
	public void addProperty(String element) { 
		Property_Names.add(element);
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
		return Property_Names;
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
	
	/**
	 * Method makes player pay money to jail. 
	 * @return the player's money after paying
	 */
	public int doJail() {
		return getMoney() - moneyLost;
	}
	
	/**
	 * Method sets human player's name.
	 * @return the player's name 
	 */
	public String setHumanPlayerName(String name) {
        PlayerName = name;
        return PlayerName;
	}
	
}
