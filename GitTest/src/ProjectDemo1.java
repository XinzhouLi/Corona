package project;

import java.util.ArrayList;
import java.util.Random;



public class ProjectDemo1 {
	public static void main(String[] args) {
		System.out.println(diceNumber());
		
	}
	public static int diceNumber() {
		Random rand=new Random();
		int diceNumber=rand.nextInt(7);
		while(diceNumber==0) {
			diceNumber=rand.nextInt(7);
		}
		return diceNumber;
	}
	public static int locationUpadate(player) {
		player.playerLocation+=diceNumber();
		return player.Location;
	}

}
