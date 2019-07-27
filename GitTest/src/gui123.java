package mapstuffformonopoly;

import java.awt.FlowLayout; //FlowLayout imports layout of windows 
import java.awt.GridLayout; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; //JLabel gives text and outputs on screen
import java.awt.Font;

//https://stackoverflow.com/questions/37542955/how-to-set-a-tooltip-on-a-javafx-button (tooltip button)
public class gui123{
	public static void main(String args[]) {
	JFrame MonopolyMap = new JFrame("Monopoly Map");
	MonopolyMap.setLayout(new GridLayout(6, 6));

	
	MonopolyMap.add(new JButton("Go"));
	MonopolyMap.add(new JButton("Property 1"));
	MonopolyMap.add(new JButton("Property 2"));
	MonopolyMap.add(new JButton("Property 3"));
	MonopolyMap.add(new JButton("Property 4"));
	MonopolyMap.add(new JButton("Random"));
	MonopolyMap.add(new JButton("Property 19"));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton("Property 6"));
	MonopolyMap.add(new JButton("Property 18"));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton("Property 7"));
	MonopolyMap.add(new JButton("Property 17"));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton("Property 8"));
	MonopolyMap.add(new JButton("Property 16"));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton("Property 9"));
	MonopolyMap.add(new JButton("Random"));
	MonopolyMap.add(new JButton("Property 14"));
	MonopolyMap.add(new JButton("Property 13"));
	MonopolyMap.add(new JButton("Property 12"));
	MonopolyMap.add(new JButton("Property 11"));
	MonopolyMap.add(new JButton("Jail"));
	MonopolyMap.pack();
	MonopolyMap.setVisible(true);
	}
}
		