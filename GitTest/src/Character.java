import java.util.ArrayList;
import java.util.Scanner;

public class Character{
	private ArrayList<Player> Characters = new ArrayList<Player>();
	public Character() {
		if (getNumberofPlayers() = 1) {
			Player p0 = new Player(1500, 0, null, 0);
			Characters.add(p0);
		}
		if (getNumberofPlayers() = 2) {
			Player p0 = new Player(1500, 0, null, 0);
		}
			Player p1 = new Player(1500, 0, null, 1);
		Player p2 = new Player(1500, 0, null, 2);
		Player p3 = new Player(1500, 0, null, 3);
		Characters.add(p0);
		Characters.add(p1);
		Characters.add(p2);
		Characters.add(p3);
	}
	
	public getNumberofPlayers();
		System.out.println("How many players would you want?")
		Scanner input = new Scanner(System.in);
        int s = input.nextLine();
        return s;
	
}
}