import java.util.ArrayList;

public class Character{
	ArrayList<Player> Characters = new ArrayList<Player>();
	
	public Character(Player player) {
		Player p0 = new Player(1500, 0, null, 0);
		Player p1 = new Player(1500, 0, null, 1);
		Player p2 = new Player(1500, 0, null, 2);
		Player p3 = new Player(1500, 0, null, 3);
		Characters.add(p0);
		Characters.add(p1);
		Characters.add(p2);
		Characters.add(p3);
	}
	
}