import java.util.ArrayList;
import java.util.Scanner;

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
		Player p0 = new Player(0);
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Player p3 = new Player(3);
		ArrayList<Player> playerList =new ArrayList<Player>();
		playerList.add(p0);
		playerList.add(p1);
		playerList.add(p2);
		playerList.add(p3);
		return playerList;	
	}
	
	public static ArrayList<Property> propertiesList() {
		Property b0 = new Property(0,"Start");
		Property b1 = new Property(1,"Canada");
		Property b2 = new Property(2,"Brazil");
		Property b3 = new Property(3,"Russia");
		Property b4 = new Property(4, "Mexico");
		Property b5 = new Property(5,"Random");
		Property b6 = new Property(6,"Egypt");
		Property b7 = new Property(7,"Turkey");
		Property b8 = new Property(8,"Germany");
		Property b9 = new Property(9,"United Kingdom");
		Property b10 = new Property(10,"Jail");
		Property b11 = new Property(11,"Italy");
		Property b12 = new Property(12,"South Africa");
		Property b13 = new Property(13,"South Korea");
		Property b14 = new Property(14,"Colombia");
		Property b15 = new Property(15,"Radom");
		Property b16 = new Property(16,"China");
		Property b17 = new Property(17,"India");
		Property b18 = new Property(18,"United States");
		Property b19 = new Property(19,"Japan");
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
		while(Services.winingCondiction(playersList)) {
			System.out.println(playersList.toString());
				//Start round
			
			for (Player currentPlayer:playersList) {
				if (!Services.winingCondiction(playersList)) {
					break;
				}
				System.out.println(currentPlayer.getPlayerName() + "'s turn");
				System.out.println("Money: " + currentPlayer.getMoney());
				System.out.println("Location: " + currentPlayer.getLocation());
				Services.locationUpdate(currentPlayer);
				System.out.println("Location: " + currentPlayer.getLocation());
				System.out.println("Property name: " + propertiesList.get(currentPlayer.getLocation()).getPropertyName());
				
				//special location checking
				
				if(currentPlayer.getLocation() == 10) {
					Services.payJail(currentPlayer);
				}else if (currentPlayer.getLocation() == 5||currentPlayer.getLocation() == 15) {
					UsingRandomCard.randomCard(propertiesList,currentPlayer);
					continue;
				}

				//if it is normal property, buying,renting ,building
				if (currentPlayer.getPlayerNumber()==0) {
					//Human player turn
		        	if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
		        		System.out.println("Do you want to bulid house on this property? (Y/N)");
						Scanner input = new Scanner(System.in);
				        String choice = input.nextLine();
				        if (choice.equalsIgnoreCase("Y")) {
				        	Services.buildHouse(currentPlayer, propertiesList);
				        }
					
					}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
						System.out.println("Do you want to buy this property? (Y/N)");
						Scanner input = new Scanner(System.in);
				        String choice = input.nextLine();
				        if (choice.equalsIgnoreCase("Y")) {
				        	Services.buyLand(currentPlayer, propertiesList);
				        }
					}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
						Services.rent(currentPlayer, propertiesList, playersList);
					}
				}else {
					//AI turn
						if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
							if (currentPlayer.getMoney()>=400) {
								Services.buildHouse(currentPlayer, propertiesList);
							}
						}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
							if (currentPlayer.getMoney()>=300) {
								Services.buyLand(currentPlayer, propertiesList);
							}	
						}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
							Services.rent(currentPlayer, propertiesList, playersList);
						}
				}
				System.out.println("");

				
			}
		}
		
		//Game ends
		
		Services.findWinner(playersList, propertiesList);
		System.out.println("End Game");
		
	}
}
