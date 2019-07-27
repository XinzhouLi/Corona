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
	public static void startTurn(Player p0,Player p1,Player p2,Player p3, ArrayList<Player> playerList, ArrayList propertiesList, ArrayList propertyPosList) {
		while ( p0.getMoney()>=0 &&
				p1.getMoney()>=0&&
				p2.getMoney()>=0&&
				p3.getMoney()>=0) {   
//start round
		for (Player player:playerList) {
			System.out.println(player.getPlayerName() + "'s turn");
			System.out.println("Money: " + player.getMoney());
			System.out.println("Location: " + player.getLocation());
			if (player.getPlayerNumber() != 0) {
				Services.locationUpdate(player);
			}
			else {
				System.out.println("Roll or Build?");
			}
			System.out.println("Location: " + player.getLocation());
			System.out.println("Properties: " + player.getProperties());
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
			}
			System.out.println(player.getPlayerName() + ": End turn");
			System.out.println("");
			}
		}

	System.out.println("End game");
	}
}
