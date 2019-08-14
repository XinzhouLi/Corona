package com.Data;
import java.util.Scanner;
import com.Function.*;

/**
 * Class holds information responsible 
 * for the creation of computer player intelligence.
 *
 */
public class createCP {
	
	/**
	 * Method sets intelligence to the player .
	 * @param player the player 
	 * @param diffi the difficulty of the computer players
	 * @return the player
	 */
	public static Player createComputerPlayer(Player player, int diffi) {
		Player a= player;

		if(diffi ==1) {
			a = new cpdifficulty1(player);
		} else {
			a = new cpdifficulty2(player);
		}
		return a;
	}
}
