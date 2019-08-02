
public class createCP {
	public static void createPlayer(Player player,int difficulty) {
		if(difficulty==1) {
			computerPlayer computerPlayer=new cpdifficulty1(player);
		}
		else {
			computerPlayer computerPlayer=new cpdifficulty2(player);
		}
	}
}
