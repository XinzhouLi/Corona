import java.util.ArrayList;
import java.util.Scanner;

public class Player{
	int Money; //Player's money; will default to 1500 at the start of the game
	int Location;
	ArrayList<String> Properties = new ArrayList<String>();
	int PlayerNumber;
	String PlayerName;

	public Player(int Money, int Location, ArrayList<String> Properties, int PlayerNumber) { //Constructor
		setMoney(Money);
		setLocation(Location);
		setProperties(Properties);
		setPlayerNumber(PlayerNumber);
		setPlayerName();
	}
	
	public Player (Player player){ //Copy Constructor
		 this.Money = player.Money;
		 this.Location = player.Location;
		 this.Properties = player.Properties;
		 this.PlayerNumber = player.PlayerNumber;
		 setPlayerName();
	}
	
	public void setMoney(int Money) {
		this.Money = Money;
	}
	
	public void setLocation(int Location) {
		this.Location = Location;
	}
	
	public void setProperties(ArrayList<String> Properties) {
		this.Properties = Properties;
	}
	
	public void setPlayerNumber(int PlayerNumber) {
		this.PlayerNumber = PlayerNumber;
	}
	
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
	
	
}
