import java.util.ArrayList;

public class Updated_Main {

	public static void main(String[] args) {
		System.out.println("Initializing...");
		Player p0 = new Player(1500, 0, null, 0);
		Player p1 = new Player(1500, 0, null, 1);
		Player p2 = new Player(1500, 0, null, 2);
		Player p3 = new Player(1500, 0, null, 3);
		ArrayList<Player> playerList =new ArrayList<Player>();
		playerList.add(p0);
		playerList.add(p1);
		playerList.add(p2);
		playerList.add(p3);
		
		Property b0 = new Property(0);
		Property b1 = new Property(1);
		Property b2 = new Property(2);
		Property b3 = new Property(3);
		Property b4 = new Property(4);
		Property b5 = new Property(5);
		Property b6 = new Property(6);
		Property b7 = new Property(7);
		Property b8 = new Property(8);
		Property b9 = new Property(9);
		Property b10 = new Property(10);
		Property b11 = new Property(11);
		
		ArrayList<Property> propertiesList = new ArrayList<Property>();
		System.out.println("i");
		propertiesList.add(b0);
		propertiesList.add(b1);
		propertiesList.add(b2);
		propertiesList.add(b3);
		propertiesList.add(b4);
		propertiesList.add(b5);
		propertiesList.add(b6);
		propertiesList.add(b7);
		propertiesList.add(b8);
		propertiesList.add(b9);
		propertiesList.add(b10);
		propertiesList.add(b11);
		
		ArrayList<Integer> propertyPosList = new ArrayList<>();
		for (int i=0 ; i<11;i++) {
			propertyPosList.add(0);
		}

//Starting game
		while ( p0.getMoney()>=0 &&
					p1.getMoney()>=0&&
					p2.getMoney()>=0&&
					p3.getMoney()>=0) {   
//start round
			for (Player player:playerList) {
				System.out.println(player.getPlayerName() + "'s turn");
				System.out.println("Location: " + player.getLocation());
				Services.locationUpdate(player);
				System.out.println("Location: " + player.getLocation());
				if (player.getLocation()==6) {
					Services.payJail(player, null, null);
				}
				int the_owner = Services.searchProperty(player.getLocation(),propertiesList).getOwner();
				Property players_property = Services.searchProperty(player.getLocation(),propertiesList);
				if(the_owner != 5) { //If Owner is not Bank
					if(player.getPlayerNumber() != the_owner) { //If Property is owned by another player, pay Rent
						if(the_owner == 0) {
							Services.rent(player, p0, players_property, propertyPosList);
						}
						if(the_owner == 1) {
							Services.rent(player, p1, players_property, propertyPosList);
						}
						if(the_owner == 2) {
							Services.rent(player, p2, players_property, propertyPosList);
						}
						if(the_owner == 3) {
							Services.rent(player, p2, players_property, propertyPosList);
						}
					else {
						;
					}
					}
				}
				if (the_owner == 5) { //If Owner is Bank
					Services.buyLand(player, propertyPosList, Services.searchProperty(player.getLocation(),propertiesList));
					System.out.println("Property bought!");
				}
				System.out.println(player.getPlayerName() + ": End turn");
				System.out.println("");
				}
			}

		System.out.println("End game");
		ArrayList<Integer> finalScore = new ArrayList<>();
		finalScore.add(p0.getMoney());
		finalScore.add(p1.getMoney());
		finalScore.add(p2.getMoney());
		finalScore.add(p3.getMoney());
		finalScore.sort(null);
		if (p0.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p0.getPlayerNumber());
		}else if (p1.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p1.getPlayerNumber());
		}else if (p2.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p2.getPlayerNumber());
		}else if (p3.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p3.getPlayerNumber());
		}

		
		}
				
				
			
	
}