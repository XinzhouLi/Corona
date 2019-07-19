import java.util.ArrayList;

public class Player{
<<<<<<< HEAD
	int Money;
	int Location;
	ArrayList<String> Properties = new ArrayList<String>();

	public Player(int Money, int Location, ArrayList<String> Properties) {
		setMoney(Money);
		setLocation(Location);
		setProperties(Properties);
=======
	int Money;
	int Location;
	ArrayList<String> properties = new ArrayList<String>();
	
	public Player(int money, int location, ArrayList<String> properties) {
		setMoney(money);
		setLocation(location);
		setProperties(properties);
>>>>>>> 7d35ffa9718ec9eb6dda470c077394c9d12113b9
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
