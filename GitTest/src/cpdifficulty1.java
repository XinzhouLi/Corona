import java.util.ArrayList;
import java.util.Random;

public class cpdifficulty1 extends computerPlayer{
	private int difficulty=1;
	public cpdifficulty1(int PlayerNumber) {
		super(PlayerNumber);
		// TODO Auto-generated constructor stub
	}
	public int getDifficulty() {
		return this.difficulty;
	}
	
	public int computerUseStealCard(ArrayList<Property> propertyList,Player computerPlayer) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		int owner=propertyList.get(n).getOwner();
		int currentPlayerNumber=computerPlayer.getPlayerNumber();
		while(owner!=currentPlayerNumber) {
			n = rand.nextInt(20);
		}
		return n;
	}
	public int computerUseMoveCard(ArrayList<Property> propertyList,Player computerPlayer) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		return n;
	}
	
	
}
