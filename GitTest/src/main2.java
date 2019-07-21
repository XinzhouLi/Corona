import java.util.ArrayList;
import java.util.Random;
public class main2 {
	public static void main(String[] args) {
		ArrayList<Integer> maplist=new ArrayList();
		for(int i=0;i<12;i+=1) {
			maplist.add(0);
		}
		
	}
	public static int diceNumber() {
		Random rand=new Random();
		int diceNumber=rand.nextInt(7);
		while(diceNumber==0) {
			diceNumber=rand.nextInt(7);
		}
		return diceNumber;
		}
	public static void locationUpdate(Player p) {
		p.Location+=diceNumber();
	}
	public static void loseMoney(Player player,Property player1) {
		ArrayList map=monopolyMap.getMap();
		if(player.Location!=)
		if(player.Money>=player1.Cost) {
				player.Money-=player1.getCost();
				
		}
	}
}
