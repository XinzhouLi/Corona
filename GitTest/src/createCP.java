import java.util.Scanner;

public class createCP {
	public static Player createComputerPlayer(Player player) {
		Player a= player;
		System.out.println("Choose the level of difficulty for the computer player");
		int diffi=new Scanner(System.in).nextInt();
		while(diffi<1&&diffi>2) {
			System.out.println("Choose the level of difficulty for the computer player");
			diffi=new Scanner(System.in).nextInt();
		}
		if(diffi==1) {
			a=new cpdifficulty1(player);
		}
		else {
			a=new cpdifficulty2(player);
		}
		
		return a;
	}
}
