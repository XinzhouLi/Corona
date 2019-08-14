package com.Function;
import java.util.ArrayList;
import com.Data.*;
/**
 * Class represents the information held by the 
 * computer player, including money, location, name, etc.
 * This is a child class of the super class Player.
 */
public class computerPlayer extends Player{
	
	/**
	 * Constructs a computer player using their
	 * corresponding number in the game. 
	 * @param PlayerNumber the corresponding number of the player.
	 */
	public computerPlayer(int PlayerNumber) {
		super(PlayerNumber);
	}
	
	/**
	 * Constructs a computer player for competing with 
	 * within the game. 
	 * @param player the player 
	 */
	public computerPlayer(Player player) {
		super(player);
		
	}
	
	/**
	 * Method gets the computer player's location.
	 * @return the integer value associated with the board space
	 */
	public int getLocation() {
		int location=super.getLocation();
		return location;
	}
	
	/**
	 * Gets the computer player's money.
	 * @return the value of the money
	 */
	public int getMoney() {
		int money = super.getMoney();
		return money;
	}
	
	/**
	 * Sets the amount of money the computer player
	 * has.
	 * @param moneyAmount the amount of money 
	 */
	public void setMoney(int moneyAmount) {
		super.setMoney(moneyAmount);
	}
	
	/**
	 * Sets the location of the computer player on the board.
	 * @param location the location of the player on the board
	 */
	public void setLocation(int loacation) {
		super.setLocation(loacation);
	}
	
	/**
	 * Gets the computer player's corresponding number.
	 * @return the computer player's number.
	 */
	public int getPlayerNumber() {
		int playerNumber=super.getPlayerNumber();
		return playerNumber;
	}
	
	/**
	 * Sets the computer player's name.
	 * @param name the String name of the player
	 */
	public void setPlayerName(String name) {
		super.setPlayerName(name);
	}
	
	/**
	 * Gets the player's name
	 * @return the player's name
	 */
	public String getPlayerName() {
		String name = super.getPlayerName();
		return name;
	}

}

