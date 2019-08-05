import java.util.Scanner;

public class createCP {
	public static Player createComputerPlayer(Player player,int diffi) {
		Player a= player;

		if(diffi==1) {
			a=new cpdifficulty1(player);
		}
		else {
			a=new cpdifficulty2(player);
		}
		
		return a;
	}
}
