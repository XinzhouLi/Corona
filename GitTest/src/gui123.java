package mapstuffformonopoly;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		JFrame MonopolyMap = new JFrame("Monopoly Map");
		MonopolyMap.setLayout(new GridLayout(6, 6));
		JTextArea square = new JTextArea(); 
		
		//Go space
		JPanel go = new JPanel();
		JButton goButton = new JButton();
		goButton.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\CPSC233\\ProjectImages\\Go.png"));
		MonopolyMap.add(goButton);
		
	    JButton b1=new JButton("property 1");  
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
	    
	MonopolyMap.add(goButton);
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


	MonopolyMap.pack();
	MonopolyMap.setVisible(true);
	b1.setBackground(Color.RED);
	b1.add(BorderLayout.CENTER, square);
	ActionListener click = new ActionListener() {
		
	@Override
	public void actionPerformed(ActionEvent a) {
		square.append("          |\n          |\n         |\n          |\n          |\n______|\n");
		
	}
	};
	b1.addActionListener(click);
	}
}
		