import java.util.ArrayList;

public class Player{
	int Money;
	int Location;
	ArrayList<String> Properties = new ArrayList<String>();

	public Player(int Money, int Location, ArrayList<String> Properties) {
		setMoney(Money);
		setLocation(Location);
		setProperties(Properties);
	}
	
	public Player (Player player){
		 this.Money = player.Money;
		 this.Location = player.Location;
		 this.Properties = player.Properties;
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
}
