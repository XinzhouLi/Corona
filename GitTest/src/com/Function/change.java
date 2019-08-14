package com.Function;

/**Represents the logic needed to alter the coordinates
 * of the player tokens in the GUI.
 */
public class change {
	
	/**
	 * looks at if the locations is between certain ranges that correspond to the top,right,bottom,
	 * and left of the board and finds the respective x coordinate relative to this.
	 * @param location the integer is the location you are at
	 * @return the respective x coordinate associated with that location on the map
	 */
	public static int changeX(int location) {
		int b = location + 1;
		int c = 0;
		int d = 0;
		if(b <= 6){
			c = b;
			d = 0;
		}
		if(b <= 11 && b > 6) {
			c = 7;
			d = b - 5;
	
		}
		if(b <= 16 && b > 11) {
			c = 17 - b;
			d = 7;
		}
		if(b <= 20 && b > 16) {
			c = 0;
			d = 22 - b;
		}
		c = c;
		d = d;
		return c;

	}
	
	/**
	 * looks at if the locations is between certain ranges that correspond to the top,right,bottom,
	 * and left of the board and finds the respective y coordinate relative to this.
	 * @param location the integer is the location you are at
	 * @return the respective y coordinate associated with that location on the map
	 */
	public static int changeY(int location) {
		int b = location + 1;
		int c = 0;
		int d = 0;
		if(b <= 6) {
			c = b;
			d = 0;
		}
		if(b <= 11 && b > 6) {
			c = 7;
			d = b - 5;
		}
		if(b <= 16 && b > 11) {
			c = 17 - b;
			d = 7;
		}
		if(b <= 20 && b >16) {
			c = 0;
			d = 22 - b;
		}
		
		c = c;
		d = d;
		return d;
	}
}
