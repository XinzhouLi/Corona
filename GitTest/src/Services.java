import java.util.ArrayList;
import java.util.Random;
public class Services {
	public static ArrayList<Player> playersList() {
		System.out.println("Initializing...");
		Player p0 = new Player(1500, 0, 0);
		Player p1 = new Player(1500, 0, 1);
		Player p2 = new Player(1500, 0, 2);
		Player p3 = new Player(1500, 0, 3);
		ArrayList<Player> playerList =new ArrayList<Player>();
		playerList.add(p0);
		playerList.add(p1);
		playerList.add(p2);
		playerList.add(p3);
		return playerList;	
	}
	
	public static ArrayList<Property> propertiesList() {
		Property b0 = new Property(0, 0, 0, "GO");
		Property b1 = new Property(1, 100, 100, "P1");
		Property b2 = new Property(2, 100, 100, "P2");
		Property b3 = new Property(3, 125, 125, "P3");
		Property b4 = new Property(4, 125, 125, "P4");
		Property b5 = new Property(5, 150, 150, "P5");
		Property b6 = new Property(6, 150, 150, "P6");
		Property b7 = new Property(7, 175, 175, "P7");
		Property b8 = new Property(8, 175, 175, "P8");
		Property b9 = new Property(9, 200, 200, "P9"); //Three properties that cost 200
		Property b10 = new Property(10, 200, 200, "P10");
		Property b11 = new Property(11, 200, 200, "P11");
		Property b12 = new Property(12, 225, 225, "P12");
		Property b13 = new Property(13, 225, 225, "P13");
		Property b14 = new Property(14, 250, 250, "P14");
		Property b15 = new Property(15, 250, 250, "P15");
		Property b16 = new Property(16, 275, 275, "P16");
		Property b17 = new Property(17, 275, 275, "P17");
		Property b18 = new Property(18, 300, 300, "P18");
		Property b19 = new Property(19, 300, 300, "P19");
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

	
	
	public static void startGame(ArrayList<Player> playerList, ArrayList<Property> propertiesList) {
		while(winingCondiction(playerList)) {
	
			for (Player currentPlayer:playerList) {
				System.out.println(currentPlayer.getPlayerName() + "'s turn");
				System.out.println("Money: " + currentPlayer.getMoney());
				System.out.println("Location: " + currentPlayer.getLocation());
				locationUpdate(currentPlayer);
				System.out.println("Location: " + currentPlayer.getLocation());
				//special location checking
				if(currentPlayer.getLocation() == 10) {
					payJail(currentPlayer);
				}else if (currentPlayer.getLocation() == 5||currentPlayer.getLocation() == 15) {
					//random
				}
				
				
				//if it is normal property, buying,renting ,building
				if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
					buildHouse(currentPlayer, propertiesList);
				}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
					buyLand(currentPlayer, propertiesList);
				}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
					rent(currentPlayer, propertiesList, playerList);
				}
				System.out.println("");
				if (winingCondiction(playerList)) {
					break;
				}
			}
		}
		findWinner(playerList, propertiesList);
		System.out.println("End Game");
		
	}
	/**
	 * Updates location of the player. Allows player to roll
	 * a six-side die.
	 * @param p Holds info on player
	 */
	public static void locationUpdate(Player p) { 
		Random rand=new Random();
		int diceNumber=rand.nextInt(7);
		while(diceNumber==0) {
			diceNumber=rand.nextInt(7);
		}
		int location=p.getLocation();
		location+=diceNumber;
		System.out.println("Rolled a " + diceNumber);
		location = location % 11;
		p.setLocation(location);
	}
	/**
	 * Method transfers one player's funds to another player's bank in the form of rent.
	 * @param player Holds info on player. 
	 * @param propertyList Hold ArrayList of properties 
	 * @param propertyList Hold ArrayList of players 
	 */
	public static void rent(Player player,ArrayList<Property> propertyList,ArrayList<Player> playersList) {
		int location=player.getLocation();
		Player landOwner = searchPlayer(location, propertyList, playersList);
		System.out.println(player.getPlayerName()+" pays "+propertyList.get(location).getRent()+" to "+landOwner.getPlayerName());
		Transfer(player,landOwner,propertyList.get(location).getRent());
		System.out.println("Rent paid!");
		
	}
	/**
	 * Transfers funds from the landOwner to another player. 
	 * @param a Holds info on Player 
	 * @param landOwner Holds info on who owns the land 
	 * @param moenyAmount holds info on the amount of money 
	 */
	
	public static void Transfer(Player currentPlay,Player landOwner, int moneyAmount) {
		currentPlay.setMoney(currentPlay.getMoney() - moneyAmount);
		landOwner.setMoney(landOwner.getMoney() + moneyAmount);
	}
	/**
	 * Public, static method that makes player pay jailer. 
	 * @param player Holds information on player.
	 * @param landInformation
	 * @param propertyList
	 */
	
	public static void payJail(Player player) {
		
		int moneyRemained=player.getMoney();
		System.out.println("Go to Jail, pay 50 dollars.");
		moneyRemained-=50;
		player.setMoney(moneyRemained);
	}
	/**
	 * Method allows player to buy land using their money. 
	 * @param player Holds info on player
	 * @param propertyList Holds all the properties in a list. 
	 */
	public static void buyLand(Player player,ArrayList<Property> propertyList) {
		int location=player.getLocation();
		int money = player.getMoney();
		if (player.getMoney()>=200) {
			propertyList.get(location).setOwner(player.getPlayerNumber());
			money-=200;
			player.setMoney(money);
			System.out.println("Property bought!");
		}else {
			System.out.println("Not enough Money");
		}
	}
	/**
	 * Method allows player to sell land to gain money.  
	 * @param player Holds info on player
	 * @param propertyList Holds all the properties in a list. 
	 * @param landInformation Holds information on the type of land
	 */
	
	public static void buildHouse(Player player,ArrayList<Property> properties) {
		int money = player.getMoney();
		Property currentProperty = properties.get(player.getLocation());
		if (player.getMoney()>=150) {
			properties.get(player.getLocation()).setOwner(player.getPlayerNumber());
			money-=150;
			player.setMoney(money);
			currentProperty.setBuilding(currentProperty.getBuilding() + 1);
			currentProperty.setRent(currentProperty.getRent() + Constant.INCREASING_RENT);
			System.out.println("Build a hotel, rent increasing!");
		}else {
			System.out.println("Not enough Money");
		}
	}
	
	
	
	public static void sellLand(Player player,ArrayList<Property> properties,int propertyLocation) {
		//int location=player.getLocation();
		int moneyUpdate=player.getMoney();
		if(properties.get(propertyLocation).getOwner()==player.getPlayerNumber()&&
				propertyLocation!=0&&
				propertyLocation!=5&&
				propertyLocation!=10&&
				propertyLocation!=15) 
		{
			System.out.println("Sell the land");
			moneyUpdate+=properties.get(propertyLocation).getRent();
			player.setMoney(moneyUpdate);
			properties.get(propertyLocation).setOwner(5);
		}else {
//			System.out.println("That property does not belong to you");
		}
	}
	/**
	 * Checks which player is currently owning the property. 
	 * @param position holds info on the player's position in the list
	 * @param propertieslist holds info on all the properties
	 * @param playerslist holds info on the numbers corresponding to the player. 
	 * @return j, or if the current Player's number is equal to the Owner number in propertiesList
	 */

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
	
	public static boolean winingCondiction(ArrayList<Player> playerList) {
		boolean temp = playerList.get(0).getMoney()>0 && 
				playerList.get(1).getMoney()>0 &&
				playerList.get(2).getMoney()>0&&
				playerList.get(3).getMoney()>0; 
		return temp;
		
	}
	
	public static void findWinner( ArrayList<Player> playerslist,ArrayList<Property> propertieslist) {
		for (int propertyLocation = 0; propertyLocation < 20; propertyLocation++) {
			for(Player iPlayer : playerslist) {
				sellLand(iPlayer, propertieslist, propertyLocation );
			}
		}
	
		ArrayList<Integer> finalScore = new ArrayList<>();
		finalScore.add(playerslist.get(0).getMoney());
		finalScore.add(playerslist.get(1).getMoney());
		finalScore.add(playerslist.get(2).getMoney());
		finalScore.add(playerslist.get(3).getMoney());
		finalScore.sort(null);
		System.out.println(finalScore.toString());
		for (Player player :playerslist) {
			if (player.getMoney()==finalScore.get(finalScore.size()-1)) {
				System.out.println("Winner is "+playerslist.get(0).getPlayerName());
				System.out.println(player.getMoney());
			}
		}
	}
}
	

	
	
	
	
	
	