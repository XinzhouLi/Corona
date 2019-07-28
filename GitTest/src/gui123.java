import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class gui123{
	//variables 
	static ArrayList<Property> newAttempt = new ArrayList<Property>();
	static ArrayList<JButton> buttonToProperty = new ArrayList<JButton>();
	static ArrayList<String> names = new ArrayList<String>();
	
	/**
	 * Method sets Location of player and prints out 
	 * their corresponding numbers on the board space.
	 */
	public static void setLocation() {
		for(Player a : InitialList.playersList()) {
			String c = buttonToProperty.get(a.getLocation()).getText();
			String b = buttonToProperty.get(a.getLocation()).getText() + " " + a.getPlayerNumber();
			buttonToProperty.get(a.getLocation()).setText(b);
		}
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
	public void startGame(ArrayList<Player> playersList, ArrayList<Property> propertiesList) {
			
		//setting layout
		JFrame MonopolyMap = new JFrame ("Monopoly Map");
		MonopolyMap.setLayout(new GridLayout(6, 6));
		JTextArea square = new JTextArea(); 
	}
	public static void main(String[] args) { }
		//initialize class startGame
		
		


	

	// public static void main(String args[]) {
		// public void startGame(ArrayList<Player> playersList, ArrayList<Property> propertiesList) {
		
//		JPanel go = new JPanel();
//		JButton goButton = new JButton();
//		goButton.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\CPSC233\\ProjectImages\\Go.png"));
////		MonopolyMap.add(goButton);
	    JButton b0=new JButton("GO");  
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

	

		
		//Go space
//		JPanel go = new JPanel();
//		JButton goButton = new JButton();
//		goButton.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\CPSC233\\ProjectImages\\Go.png"));

	
		while(Services.winingCondiction(playersList)) {
			System.out.println(playersList.toString());
				//Start round
			
			for (Player currentPlayer:playersList) {
				if (!Services.winingCondiction(playersList)) {
					break;
				}
				System.out.println(currentPlayer.getPlayerName() + "'s turn");
				System.out.println("Money: " + currentPlayer.getMoney());
				System.out.println("Location: " + currentPlayer.getLocation());
				Services.locationUpdate(currentPlayer);
				System.out.println("Location: " + currentPlayer.getLocation());
				System.out.println("Property name: " + propertiesList.get(currentPlayer.getLocation()).getPropertyName());
				
				//special location checking
				
				if(currentPlayer.getLocation() == 10) {
					Services.payJail(currentPlayer);
				}else if (currentPlayer.getLocation() == 5||currentPlayer.getLocation() == 15) {
					UsingRandomCard.humanUseRandomCard(propertiesList,currentPlayer);
					continue;
				}

				//if it is normal property, buying,renting ,building
				if (currentPlayer.getPlayerNumber()==0) {
					//Human player turn
		        	if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
		        		System.out.println("Do you want to bulid house on this property? (Y/N)");
						Scanner input = new Scanner(System.in);
				        String choice = input.nextLine();
				        if (choice.equalsIgnoreCase("Y")) {
				        	Services.buildHouse(currentPlayer, propertiesList);
				        }
					
					}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
						System.out.println("Do you want to buy this property? (Y/N)");
						Scanner input = new Scanner(System.in);
				        String choice = input.nextLine();
				        if (choice.equalsIgnoreCase("Y")) {
				        	Services.buyLand(currentPlayer, propertiesList);
				        }
					}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
						Services.rent(currentPlayer, propertiesList, playersList);
					}
				}else {
					//AI turn
						if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
							if (currentPlayer.getMoney()>=400) {
								Services.buildHouse(currentPlayer, propertiesList);
							}
						}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
							if (currentPlayer.getMoney()>=300) {
								Services.buyLand(currentPlayer, propertiesList);
							}	
						}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
							Services.rent(currentPlayer, propertiesList, playersList);
						}
				}
				System.out.println("");

			}
		}
		 
		//Game ends
		
		Services.findWinner(playersList, propertiesList);
		System.out.println("End Game");
		
	} 
	