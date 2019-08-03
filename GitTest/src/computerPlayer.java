import java.util.ArrayList;

public class computerPlayer extends Player{
	public computerPlayer(int PlayerNumber) {
		super(PlayerNumber);
	}

	public computerPlayer(Player player) {
		super(player);
		
	}
	
	public int getLocation() {
		int location=super.getLocation();
		return location;
	}
	
	public int getMoney() {
		int money=super.getMoney();
		return money;
	}
	
	public void setMoney(int moneyAmount) {
		super.setMoney(moneyAmount);;
	}
	
	public void setLocation(int loacation) {
		super.setLocation(loacation);
	}
	
	public int getPlayerNumber() {
		int playerNumber=super.getPlayerNumber();
		return playerNumber;
	}
	
	public void setPlayerName(String name) {
		super.setPlayerName(name);
	}
	
	public String getPlayerName() {
		String name=super.getPlayerName();
		return name;
	}

}

