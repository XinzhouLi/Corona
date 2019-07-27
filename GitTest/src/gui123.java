
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class gui123{
	public static void main(String args[]) {
		
		//Establishing Monopoly map framework
		JFrame MonopolyMap = new JFrame("Monopoly Map");
		MonopolyMap.setLayout(new GridLayout(6, 6));
		JTextArea square = new JTextArea(); 
		
		//Go space
		// JPanel go = new JPanel();
		// JButton goButton = new JButton();
		// goButton.setIcon(Constant.goImage);
		// MonopolyMap.add(goButton);

		ArrayList<JButton> buttontoProperty = new ArrayList<JButton>;
		JButton b1 = new JButton("property 1");
	    JButton b2=new JButton("property 2");  
	    JButton b3=new JButton("property 3");  
	    JButton b4=new JButton("property 4");  
	    JButton b5=new JButton("Random");  
	    JButton b6=new JButton("property 6");  
	    JButton b7=new JButton("property 7");  
	    JButton b8=new JButton("property 8");  
	    JButton b9=new JButton("property 9");  
	    JButton b10=new JButton("Jail");  
	    JButton b11=new JButton("property 11");  
	    JButton b12=new JButton("property 12");  
	    JButton b13=new JButton("property 13");  
	    JButton b14=new JButton("property 14");  
	    JButton b15=new JButton("Random");  
	    JButton b16=new JButton("property 16");  
	    JButton b17=new JButton("property 17");  
	    JButton b18=new JButton("property 18");  
	    JButton b19=new JButton("property 19");  
	
	buttontoProperty.add(b0);
	buttontoProperty.add(b1);
	buttontoProperty.add(b2);
	buttontoProperty.add(b3);
	buttontoProperty.add(b4);
	buttontoProperty.add(b5);
	buttontoProperty.add(b6);
	buttontoProperty.add(b7);
	buttontoProperty.add(b8);
	buttontoProperty.add(b9);
	buttontoProperty.add(b10);
	buttontoProperty.add(b11);
	buttontoProperty.add(b12);
	buttontoProperty.add(b13);
	buttontoProperty.add(b14);
	buttontoProperty.add(b15);
	buttontoProperty.add(b16);
	buttontoProperty.add(b17);
	buttontoProperty.add(b18);
	buttontoProperty.add(b19);
	    
	MonopolyMap.add(b0);
	MonopolyMap.add(b1);
	MonopolyMap.add(b2);
	MonopolyMap.add(b3);
	MonopolyMap.add(b4);
	MonopolyMap.add(b5);
	MonopolyMap.add(b19);
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(b6);
	MonopolyMap.add(b18);
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));

	MonopolyMap.add(b7);
	MonopolyMap.add(b17);
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));

	MonopolyMap.add(b8);
	MonopolyMap.add(b16);
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(new JButton(""));
	MonopolyMap.add(b9);
	MonopolyMap.add(b15);
	MonopolyMap.add(b14);
	MonopolyMap.add(b13);
	MonopolyMap.add(b12);
	MonopolyMap.add(b11);
	MonopolyMap.add(b10);
	for(Player a : Gameplay.playersList()) {
		String b = buttontoProperty.get(a.getLocation()).getText() + " " + a.getPlayerNumber();
		buttontoProperty.get(a.getLocation()).setText(b);
		}
	MonopolyMap.pack();
	MonopolyMap.setVisible(true);

}		
}