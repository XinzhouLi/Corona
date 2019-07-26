import java.util.ArrayList;
import java.util.Scanner;

public class Character{

	public Character() {
		getNumberofPlayers();
		if (getNumberofPlayers() == 1) {
			Player p0 = new Player(1500, 0, null, 0);

		}
		if (getNumberofPlayers() == 2) {
			Player p0 = new Player(1500, 0, null, 0);
			Player p1 = new Player(1500, 0, null, 1);

		}
		if (getNumberofPlayers() == 3) {
			Player p0 = new Player(1500, 0, null, 0);
			Player p1 = new Player(1500, 0, null, 1);
			Player p2 = new Player(1500, 0, null, 2);

		}
		if (getNumberofPlayers() == 4) {
			Player p0 = new Player(1500, 0, null, 0);
			Player p1 = new Player(1500, 0, null, 1);
			Player p2 = new Player(1500, 0, null, 2);
			Player p3 = new Player(1500, 0, null, 3);

		}

	}
	
	public int getNumberofPlayers() {
		System.out.println("How many playes would you want?");
		Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        return s;
	}
}
