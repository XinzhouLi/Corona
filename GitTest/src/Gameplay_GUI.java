import java.util.ArrayList; 
import java.util.Scanner;
import javax.swing.JFrame;


public class Gameplay_GUI {
	public static void findWinner( ArrayList<Player> playerslist, ArrayList<Property> propertieslist) {
		for (int propertyLocation = 0; propertyLocation < 20; propertyLocation++) {
			for(Player iPlayer : playerslist) {
				Services.sellLand(iPlayer, propertieslist, propertyLocation );
			}
		}
	
		ArrayList<Integer> finalScore = new ArrayList<>();
		finalScore.add(playerslist.get(0).getMoney());
		finalScore.add(playerslist.get(1).getMoney());
		finalScore.add(playerslist.get(2).getMoney());
		finalScore.add(playerslist.get(3).getMoney());
		finalScore.sort(null);
		System.out.println(finalScore.toString());
		for (Player player : playerslist) {
			if (player.getMoney()==finalScore.get(finalScore.size()-1)) {
				System.out.println("Winner is "+ player.getPlayerName());
				System.out.println(player.getMoney());
			}
		}
	}
	
	public static void startGame(ArrayList<Player> playersList, ArrayList<Property> propertiesList) {		
	    GUI_Board.startGame();
//	    GUI_EventHandle bucky = new GUI_EventHandle();
//		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes on exit
//		bucky.setSize(350, 100); //sets dimensions
//		bucky.setVisible(true); //can see the good stuff
		
		while(Services.winingCondiction(playersList)) {
			for (Player currentPlayer:playersList) {
				GUI_Board.setLocation(currentPlayer);
				if (!Services.winingCondiction(playersList)) {
					break;
				}
				
				System.out.println("Money: " + currentPlayer.getMoney());
				System.out.println("Location: " + currentPlayer.getLocation());
				if(currentPlayer.getPlayerNumber() == 0) {
					System.out.println("Roll? (Y)");
					Scanner input = new Scanner(System.in);
			        String choice = input.nextLine();
			        if (choice.equalsIgnoreCase("Y")) {
			        	Services.locationUpdate(currentPlayer);
						GUI_Board.setLocation(currentPlayer);
						System.out.println("Location: " + currentPlayer.getLocation());
			        }
			        while (choice.equalsIgnoreCase("Y") == false){
			        	input = new Scanner(System.in);
				        choice = input.nextLine();
			        }
				}
				else {
					Services.locationUpdate(currentPlayer);
					GUI_Board.setLocation(currentPlayer);
					System.out.println("Location: " + currentPlayer.getLocation());
				}
				System.out.println("Properties: " + currentPlayer.getProperties());
				System.out.println("Property name: " + propertiesList.get(currentPlayer.getLocation()).getPropertyName());
				
				//special location checking
				
				if(currentPlayer.getLocation() == 10) {
					Services.payJail(currentPlayer);
					System.out.println("");
					continue;
				}else if (currentPlayer.getLocation() == 5||currentPlayer.getLocation() == 15) {
					if (currentPlayer.getPlayerNumber() == 0){
						UsingRandomCard.humanUseRandomCard(propertiesList,currentPlayer);
						System.out.println("");
						continue;
					}
					else {
						computerUseRandomCard.computerUseRandom(propertiesList, currentPlayer);
					}
				}else if (currentPlayer.getLocation() == 0) {
					currentPlayer.setMoney(currentPlayer.getMoney()+300);
				}

				//if it is normal property, buying, renting ,building
				if (currentPlayer.getPlayerNumber()==0) {
					//Human player turn
		        	if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
		        		System.out.println("Do you want to bulid house on this property? (Y/N)");
						Scanner input = new Scanner(System.in);
				        String choice = input.nextLine();
				        if (choice.equalsIgnoreCase("Y")) {
				        	Services.buildHouse(currentPlayer, propertiesList);
				        }
				        while (choice.equalsIgnoreCase("Y") == false && choice.equalsIgnoreCase("N") == false) {
				        	input = new Scanner(System.in);
					        choice = input.nextLine();
				        }
					
					}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
						System.out.println("Do you want to buy this property? (Y/N)");
						Scanner input = new Scanner(System.in);
				        String choice = input.nextLine();
				        if (choice.equalsIgnoreCase("Y")) {
				        	Services.buyLand(currentPlayer, propertiesList);
				        	currentPlayer.addProperty(propertiesList.get(currentPlayer.getLocation()).getPropertyName());
				        }
				        while (choice.equalsIgnoreCase("Y") == false && choice.equalsIgnoreCase("N") == false) {
				        	input = new Scanner(System.in);
					        choice = input.nextLine();
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
		
		findWinner(playersList, propertiesList);
		System.out.println("End Game");
		
	}
}
