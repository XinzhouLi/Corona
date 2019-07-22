import java.util.ArrayList;
import java.util.Random;
public class Services {

	public static int diceNumber() {
		Random rand=new Random();
		int diceNumber=rand.nextInt(7);
		while(diceNumber==0) {
			diceNumber=rand.nextInt(7);
		}
		return diceNumber;
	}
	
	public static void locationUpdate(Player p) {
		int location=p.getLocation();
		location+=diceNumber();
		System.out.println("Rolled a " + diceNumber());
		if(location>=11) {
			location-=11;
		}
		p.setLocation(location);

	}
	
	public static void rent(Player player,Player landOwner,Property landInformation,ArrayList<Integer> propertyList) {
		int location=player.getLocation();
		if(propertyList.get(location)!=player.getPlayerNumber()&&location!=6) {
				System.out.println(player.getPlayerName()+" pays "+landInformation.getRent()+" to "+landOwner.getPlayerName());
				Transfer(player,landOwner,landInformation.getRent());
				System.out.println("Rent paid!");
		}
	}
	
	public static void Transfer(Player a,Player landOwner, int moneyAmount) {
		if(a != landOwner) {
		a.setMoney(a.getMoney() + moneyAmount);
		landOwner.setMoney(landOwner.getMoney() - moneyAmount);
		}
	}
	
	public static void payJail(Player player,Property landInformation,ArrayList<Integer> propertyList) {
		int location=player.getLocation();
		int moneyRemained=player.getMoney();
		if(location==6) {
			System.out.println("Go to Jail, pay 50 dollars.");
			moneyRemained-=50;
		}player.setMoney(moneyRemained);
	}
	
	public static void buyLand(Player player,ArrayList<Integer> propertyList,Property landInformation) {
		int location=player.getLocation();
		if(location !=6 && propertyList.get(location) == 0 && location!= 0) {
			if (landInformation.getOwner() == 5) {
				propertyList.set(location,player.getPlayerNumber());
				player.setMoney(player.getMoney()-landInformation.getCost());
				landInformation.setOwner(player.getPlayerNumber());
				System.out.println("Property bought!");
			}
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

	
