import java.util.ArrayList;

public class Gameplay {

	public static void findWinner(Player p0,Player p1,Player p2,Player p3) {
		ArrayList<Integer> finalScore = new ArrayList<>();
		finalScore.add(p0.getMoney());
		finalScore.add(p1.getMoney());
		finalScore.add(p2.getMoney());
		finalScore.add(p3.getMoney());
		finalScore.sort(null);
		if (p0.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p0.getPlayerName());
		}else if (p1.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p1.getPlayerName());
		}else if (p2.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p2.getPlayerName());
		}else if (p3.getMoney() == finalScore.get(finalScore.size()-1)) {
			System.out.println("Winner is "+p3.getPlayerName());
		}
	}
	public static ArrayList<Player> playersList() {
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
		return playerList;	
	}
	
	public static ArrayList<Property> propertiesList() {
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
		Property b12 = new Property(12);
		Property b13 = new Property(13);
		Property b14 = new Property(14);
		Property b15 = new Property(15);
		Property b16 = new Property(16);
		Property b17 = new Property(17);
		Property b18 = new Property(18);
		Property b19 = new Property(19);
		ArrayList<Property> propertiesList = new ArrayList<Property>();
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
		propertiesList.add(b12);
		propertiesList.add(b13);
		propertiesList.add(b14);
		propertiesList.add(b15);
		propertiesList.add(b16);
		propertiesList.add(b17);
		propertiesList.add(b18);
		propertiesList.add(b19);
		return propertiesList;
	}

	
	
	public static void startGame(ArrayList<Player> playersList, ArrayList<Property> propertiesList) {
		while(winingCondiction(playersList)) {
			
				//Start round
			
			for (Player currentPlayer:playersList) {
				System.out.println(currentPlayer.getPlayerName() + "'s turn");
				System.out.println("Money: " + currentPlayer.getMoney());
				System.out.println("Location: " + currentPlayer.getLocation());
				locationUpdate(currentPlayer);
				System.out.println("Location: " + currentPlayer.getLocation());
				
				//special location checking
				
				if(currentPlayer.getLocation() == 10) {
					payJail(currentPlayer);
				}else if (currentPlayer.getLocation() == 5||currentPlayer.getLocation() == 15) {
					UsingRandom.randomCard(playersList,propertiesList);
				}

				//if it is normal property, buying,renting ,building
				if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
					buildHouse(currentPlayer, propertiesList);
				}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
					buyLand(currentPlayer, propertiesList);
				}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
					rent(currentPlayer, propertiesList, playersList);
				}
				System.out.println("");
				if (winingCondiction(playersList)) {
					break;
				}
			}
		}
		findWinner(playersList, propertiesList);
		System.out.println("End Game");
		
	}
}
