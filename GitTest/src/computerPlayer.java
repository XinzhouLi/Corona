import java.util.ArrayList;

public class computerPlayer extends Player{
	/**
	 * Constructs the computer player's information
	 * @param playerNumber the player's corresponding number
	 */
	public computerPlayer(int playerNumber) {
		super(playerNumber);
	}

	/**
	 * Copy constructor that constructs a computer player
	 * @param player the player in the game 
	 */
	public computerPlayer(Player player) {
		super(player);
		
	}
	
	/**
	 * Gets the location of the computer player
	 * @return the loction of the player
	 */
	public int getLocation() {
		int location = super.getLocation();
		return location;
	}
	
	/**
	 * Gets the amount of the money the computer player has.
	 * @return the amount of money
	 */
	public int getMoney() {
		int money = super.getMoney();
		return money;
	}
	
	/**
	 * Sets the computer's money amount.
	 * @param moneyAmount the amount of money 
	 */
	public void setMoney(int moneyAmount) {
		super.setMoney(moneyAmount);
	}
	
	/**
	 * Sets the location of the computer player
	 * @param location the integer value of the location
	 */
	public void setLocation(int location) {
		super.setLocation(location);
	}
	
	/**
	 * Method gets the computer player's number
	 * @return the computer player's number
	 */
	public int getPlayerNumber() {
		int playerNumber = super.getPlayerNumber();
		return playerNumber;
	}
	
	/**
	 * 
	 */
	public void setPlayerName(String name) {
		super.setPlayerName(name);
	}
	
	public String getPlayerName() {
		String name=super.getPlayerName();
		return name;
	}

}

