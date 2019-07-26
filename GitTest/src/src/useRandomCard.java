import java.util.ArrayList;
import java.util.Scanner;

public class useRandomCard extends randomCard{

	public void moveCard(Player player) {
		System.out.println("Which location woud you like to go");
		Scanner number=new Scanner(System.in);
		int location=number.nextInt();
		while(location>MAXIMUM_LOCATION||location<MINIMUM_LOCATION)
		{
			System.out.println("Which location woud you like to go");
			number=new Scanner(System.in);
			location=number.nextInt();
		}
		player.setLocation(location);
	}

	public void useRobCard(ArrayList<Property> propertyList,Player player) {
		int location=posRobCard();
		int playerNumber=player.getPlayerNumber();
		Property property=Services.searchProperty(location,propertyList);
		property.setOwner(playerNumber);
	}
	
	public Boolean stopCard(Player player) {
		return(player.getPlayerNumber()==playerStopCard());
	}
	
	public int stop() {
		return 0;
	}
}
