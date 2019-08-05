import java.awt.GridLayout; 
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.FlowLayout; 
import java.awt.event.ActionListener; //waits for user to input something
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_Board extends JFrame {
	
	//variables 
		static ArrayList<Property> newAttempt = new ArrayList<Property>();
		static ArrayList<JButton> buttonToProperty = new ArrayList<JButton>();
		static ArrayList<String> names = new ArrayList<String>();
		static JButton infoButton = new JButton();
		
		public GUI_Board() {
			super("Information"); //adds title
			setLayout(new FlowLayout()); //gives layout to window
			add(infoButton);
			
//			theHandler handler = new theHandler(); //BUILDS ACTION LISTENER OBJECT
//			infoButton.addActionListener(handler); //gives functionality, like press Enter, it does something now
			infoButton.addMouseListener(new MouseAdapter() {
				public void mouseReleased(MouseEvent e) {

			        if (e.isPopupTrigger() || e.getButton() == MouseEvent.MOUSE_PRESSED) {
			          JOptionPane.showMessageDialog(null, "Hello!");
			        }
			      }
			    });
			
		}
//		class theHandler implements MouseListener {
//			public void actionPerformed(MouseEvent event) { //this handles events, method executes automatically whenever event occurs (press enter)
//				String string = ""; //this string outputs final
//				
//				//if touch text box 1, then change string in field 1 to whatever you typed in
//				//%s changes string variable
//				
//				if(event.mousePressed() == infoButton) {//if stuff happens at the source, if click happens at item1 field 
//					string = String.format("Field 1: %s", event.getActionCommand()); 
//				}
//				
//				JOptionPane.showMessageDialog(null, string); //makes BLANK window (position, message)
//			}
//		}
		
		/**
		 * Method sets Location of player and prints out 
		 * their corresponding numbers on the board space.
		 */
		public static void setLocation(Player a) {
//				String c = buttonToProperty.get(a.getLocation()).getText();
			    String b = buttonToProperty.get(a.getLocation()).getText() + " " + a.getPlayerNumber();
				buttonToProperty.get(a.getLocation()).setText(b);
			}
		

		/**
		 * Method finds the corresponding String
		 * in the array list of names. buttonProperty list will
		 * check/get the index of the names at Index a and set the
		 * text to String a. 
		 */
		public static void correctLocation() {
			for(String a : names) {
				buttonToProperty.get(names.indexOf(a)).setText(a);
			}
		}
		
		/**
		 * Method updates location.
		 */
		public static void updateLocation() {
			
		}
		
		
		/**
		 * Method will iterate through the properties list and see 
		 * if the property is owned by a player. If property index
		 * has corresponding number to player, set background to 
		 * appropriate colour. 
		 */
		public static void setColor() {
			for(Property a : InitialList.propertiesList()) {
				if(a.getOwner() == 1) {
					buttonToProperty.get(a.getPosition()).setBackground(Color.BLUE);
				}
				if(a.getOwner() == 2) {
					buttonToProperty.get(a.getPosition()).setBackground(Color.RED);
				}
				if(a.getOwner() == 3) {
					buttonToProperty.get(a.getPosition()).setBackground(Color.GREEN);
				}
				if(a.getOwner() == 0) {
					buttonToProperty.get(a.getPosition()).setBackground(Color.WHITE);
				}

			}
		}
		/**
			 * Class begins the game with the GUI input. 
			 * @param playersList Holds info on the numbers and names held by the player.
			 * @param propertiesList Holds info on the properties and what numebr is at which index 
			 * that corresponds to a player. 
			 */
		static void startGame() {	
			//setting layout
			JFrame MonopolyMap = new JFrame ("Monopoly Map");
			MonopolyMap.setLayout(new GridLayout(6, 6));
			JTextArea square = new JTextArea(); 
			

			
			//initializing buttons for properties
			JButton b0 = new JButton("GO");  
		    JButton b1 = new JButton("property 1");  
		    JButton b2 = new JButton("property 2");  
		    JButton b3 = new JButton("property 3");  
		    JButton b4 = new JButton("property 4");  
		    JButton b5 = new JButton("Random");  
		    JButton b6 = new JButton("property 6");  
		    JButton b7 = new JButton("property 7");  
		    JButton b8 = new JButton("property 8");  
		    JButton b9 = new JButton("property 9");
		    JButton b10 = new JButton("Jail");  
		    JButton b11 = new JButton("property 11");  
		    JButton b12 = new JButton("property 12");  
		    JButton b13 = new JButton("property 13");  
		    JButton b14 = new JButton("property 14");  
		    JButton b15 = new JButton("Random");  
		    JButton b16 = new JButton("property 16");  
		    JButton b17 = new JButton("property 17");  
		    JButton b18 = new JButton("property 18");  
		    JButton b19 = new JButton("property 19");  
			
		    JButton infoButton = new JButton("Information");
		    
			//adding the buttons to a list 
			buttonToProperty.add(b0);
			buttonToProperty.add(b1);
			buttonToProperty.add(b2);
			buttonToProperty.add(b3);
			buttonToProperty.add(b4);
			buttonToProperty.add(b5);
			buttonToProperty.add(b6);
			buttonToProperty.add(b7);
			buttonToProperty.add(b8);
			buttonToProperty.add(b9);
			buttonToProperty.add(b10);
			buttonToProperty.add(b11);
			buttonToProperty.add(b12);
			buttonToProperty.add(b13);
			buttonToProperty.add(b14);
			buttonToProperty.add(b15);
			buttonToProperty.add(b16);
			buttonToProperty.add(b17);
			buttonToProperty.add(b18);
			buttonToProperty.add(b19);

			//Adding MonopolyMap spaces 
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
			MonopolyMap.add(infoButton); //InformationButton
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
		}
	}
	
	
	



