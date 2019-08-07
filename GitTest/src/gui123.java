

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
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class gui123{
	static ArrayList<Property> newattempt = new ArrayList<Property>();

	static ArrayList<JButton> buttontoProperty = new ArrayList<JButton>();
	static ArrayList<String> ognames = new ArrayList<String>();
	public static void setLocation() {
		for(Player a : Gameplay.playersList()) {
			String c = buttontoProperty.get(a.getLocation()).getText();
			String b = buttontoProperty.get(a.getLocation()).getText() + " " + a.getPlayerNumber();
			buttontoProperty.get(a.getLocation()).setText(b);
		}
	}import javafx.application.Application; 
	import javafx.scene.Scene; 
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Circle;
	import javafx.stage.Stage; 
	import javafx.geometry.Insets;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.GridPane;
	import java.util.ArrayList;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.geometry.Pos;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;




		public class sdf extends Application {
			static private int btnWidth = 100; // width of buttons
			static private int btnHeight = 100; //height of buttons
			static private int infoWidth = 500; //width of info text box
			static private int infoHeight = 200; //height of info text box 
			static private String infoText = "";
			static ArrayList<Player> playersList = InitialList.playersList(); // arraylist made for the player 0th indecy is first player
			static ArrayList<Property> propertiesList = InitialList.propertiesList(); // arraylist made for the property 0th indecy is first property
			static ArrayList<Circle> circs = new ArrayList<Circle>(); //arraylist made for the cirlces 0th indecy is first circle correlating to first player
			static private int turn = 0; // whose turn it is 0 means it is first players turn
			private int startWidth = 150;
			private int startLength = 80;
			private Button startButton = new Button("Start");
			
			//the buttons used
				static Button infos = new Button("information");
				static Button buy = new Button("Buy");
				static Button endturn = new Button("endturn");
				static Button build = new Button("Build House");
				static Button random = new Button("Random");
				static Button roll = new Button("Roll Dice");
				static Button a = new Button("Go          ");
				static Button b = new Button(propertiesList.get(1).getPropertyName());
				static Button c = new Button(propertiesList.get(2).getPropertyName());
				static Button d = new Button(propertiesList.get(3).getPropertyName());
				static Button e = new Button(propertiesList.get(4).getPropertyName());
				static Button f = new Button("Random 1   ");
				static Button g = new Button(propertiesList.get(6).getPropertyName());
				static Button h = new Button(propertiesList.get(7).getPropertyName());
				static Button i = new Button(propertiesList.get(8).getPropertyName());
				static Button j = new Button(propertiesList.get(9).getPropertyName());
				static Button k = new Button("Jail        ");
				static Button l = new Button(propertiesList.get(11).getPropertyName());
				static Button m = new Button(propertiesList.get(12).getPropertyName());
				static Button n = new Button(propertiesList.get(13).getPropertyName());
				static Button o = new Button(propertiesList.get(14).getPropertyName());
				static Button p = new Button("Random 2    ");
				static Button q = new Button(propertiesList.get(16).getPropertyName());
				static Button r = new Button(propertiesList.get(17).getPropertyName());
				static Button s = new Button(propertiesList.get(18).getPropertyName());
				static Button t = new Button(propertiesList.get(19).getPropertyName());
				static Circle circle = new Circle();
				static Circle circle2 = new Circle();
				static Circle circle3 = new Circle();
				static Circle circle4 = new Circle();
				public boolean ii = false;
				//setter for setting whose turn it is
				public static void setTurn(int a) {
					if(a >= 0 && a <= 3) {
						turn = a;
					}
				}
				
	@Override
		public void start(Stage grid) throws Exception {
		
		
		grid.setTitle("Monopoly Board"); //grid title
		
		//adding circles
		circs.add(circle);
		circs.add(circle2);
		circs.add(circle3);
		circs.add(circle4);
		
		//coloring circles
		circle.setFill(Color.BLUE);
		circle2.setFill(Color.RED);
		circle3.setFill(Color.GREEN);
		circle4.setFill(Color.GOLD);

		//setting circles radiuses
		circle.setRadius(5);
		circle2.setRadius(5);
		circle3.setRadius(5);
		circle4.setRadius(5);
		
		// the gridpane I used
		BorderPane borderPane = new BorderPane();
		GridPane gridPane = new GridPane();
		borderPane.setCenter(gridPane);
		
		
		//gonna be in the center
		gridPane.setAlignment(Pos.CENTER);
		
		//spacing between the objects is 10
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		//information label and text settings
		Label info = new Label("Information");
		
		Label infoTextField = new Label();
		infoTextField.setWrapText(true);
		infoTextField.setStyle("-fx-background-color: white;");;
		infoTextField.setPrefSize(infoWidth, infoHeight);
		borderPane.setBottom(infoTextField);
		borderPane.setAlignment(infoTextField, Pos.CENTER);

		
		//START SCENE
				grid.setTitle("Start Screen");
				
				//setting up screen
				GridPane screen = new GridPane();
				screen.setAlignment(Pos.CENTER);
				screen.setVgap(20);
				
				//labels
				Label title = new Label("Monopoly");
				title.setStyle("-fx-font-size:50px;");
				screen.add(title, 0, 0);
				
				//buttons
				startButton.setPrefSize(startWidth, startLength);
				startButton.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
				screen.add(startButton, 0, 1);
		
		//setting the buttons to the width and height we want
				int index = 0;
				while(index < 20) {
					buttons.get(index).setPrefSize(btnWidth, btnHeight);
					index = index + 1;
				}

		infos.setPrefSize(btnWidth, btnHeight);
		buy.setPrefSize(btnWidth, btnHeight);
		endturn.setPrefSize(btnWidth, btnHeight);
		build.setPrefSize(btnWidth, btnHeight);
		random.setPrefSize(btnWidth, btnHeight);
		roll.setPrefSize(btnWidth, btnHeight);

		Scene a1 = new Scene(borderPane,150,150);
		Scene startScene = new Scene(screen, 150, 150);
		
		//event handler for all the map square buttons, when pressed they write their functions in the information text box.
		GUI_Board.buttonHandler(buttons, infoTextField);
			
			
			// moves a players circle relative to the map depending on whose turn it is
			

			roll.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent e) {
			    	roll.setDisable(true);
			    	int presentLocation = playersList.get(turn).getLocation();
			    	int newroll = Services.locationUpdate(playersList.get(turn));
			    	String newtext1 = Services.checkGo(presentLocation, playersList.get(turn));
			    	infoText=turn + " Congrats, you rolled a " + newroll+"\n"  + newtext1;
			    	infoTextField.setText(infoText);
			    	playersList.get(turn).setLocation(playersList.get(turn).getLocation());
			    	
			    	//bigproblem
			    	if (playersList.get(turn).getLocation() == 10) {
						Services.payJail(playersList.get(turn));
						infoText=turn + "You are in jail, lose 50 dollar.\n";
						infoTextField.setText(infoText);
					}else if (propertiesList.get(playersList.get(turn).getLocation()).getOwner() != playersList.get(turn).getPlayerNumber() && propertiesList.get(playersList.get(turn).getLocation()).getOwner() != 5) {
						Services.rent(playersList.get(turn), propertiesList, playersList);
						infoText = infoText +playersList.get(turn).getPlayerName()+" pays "+propertiesList.get(playersList.get(turn).getLocation()).getRent()+" to "+Services.searchPlayer(playersList.get(turn).getLocation(), propertiesList, playersList).getPlayerName()+"\n";
						infoTextField.setText(infoText);
					}
			    	gridPane.getChildren().remove(circs.get(turn));
			    	gridPane.add(circs.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));

			    }
			});
			buy.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent e) {
			    	buy.setDisable(true);
			    	build.setDisable(true);
			    	if (propertiesList.get(playersList.get(turn).getLocation()).getOwner() == 5&&
			    		!(playersList.get(turn).getLocation()==5)&&
			    		!(playersList.get(turn).getLocation()==15)&&
			    		!(playersList.get(turn).getLocation()==0)&&
			    		!(playersList.get(turn).getLocation()==10)){
			    			infoText = infoText + "You have bought "+propertiesList.get(playersList.get(turn).getLocation()).getPropertyName()+".\n";
			    			infoTextField.setText(infoText);
				        	Services.buyLand(playersList.get(turn), propertiesList);
				        	GUI_Board.setColor(propertiesList, buttons);
			    	}else {
			    		infoText = infoText + "You can not buy this property..\n";
						infoTextField.setText(infoText);
					}
			    }
			});
			endturn.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent e) {
			    	roll.setDisable(false);
			    	buy.setDisable(false);
			    	build.setDisable(false);
			    	random.setDisable(false);
			    	infoText="";
			    	int a = turn + 1;
			    	int newturn = a%4;
			    	turn = newturn;
			    	infoText = infoText + "you have ended your turn its now player" + turn + "'s turn\n";
			    	infoTextField.setText(infoText);
		        	GUI_Board.setColor(propertiesList, buttons);
			    	if (Services.winingCondiction(playersList)) {
						//jump to next scene and end game
					}
			    }
			});
			infos.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent e) {
			    	infoTextField.setText("Please, pressing roll first!!!");
			    }
			});

			random.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					if (playersList.get(turn).getLocation()==15||
						playersList.get(turn).getLocation()==5) {
						//use random card
					}else {
						random.setDisable(true);
						infoText = infoText + "You do not have chance to use random card.\n";
						infoTextField.setText(infoText);
						
					}
		    }
		});
			
			build.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent e) {
			    	
			    	build.setDisable(true);
					if (propertiesList.get(playersList.get(turn).getLocation()).getOwner() == playersList.get(turn).getPlayerNumber()) {

				        	Services.buildHouse(playersList.get(turn), propertiesList);
				        	buy.setDisable(true);
					}else {
						infoText = infoText + "This property does not belong to you.\n";
						infoTextField.setText(infoText);
					}
			    }
			});
			
			startButton.setOnAction(new EventHandler<ActionEvent>() {
				 
			    @Override
			    public void handle(ActionEvent e) {
			    	grid.setScene(a1);
			    }
			});
			
			gridPane.add(circle, change.changeX(playersList.get(0).getLocation()), change.changeY(playersList.get(0).getLocation()));
			gridPane.add(circle2, change.changeX(playersList.get(1).getLocation()), change.changeY(playersList.get(1).getLocation()));
			gridPane.add(circle3, change.changeX(playersList.get(2).getLocation()), change.changeY(playersList.get(2).getLocation()));
			gridPane.add(circle4, change.changeX(playersList.get(3).getLocation()), change.changeY(playersList.get(3).getLocation()));
			
		
		//setting padding and adding buttons to the coordinates we want
			gridPane.setPadding(new Insets (25, 25, 25, 25));
			gridPane.add(infos, 12, 3);
			gridPane.add(buy, 12, 1);
			gridPane.add(endturn, 11, 1);
			gridPane.add(build, 11, 3);
			gridPane.add(random, 12, 2);
			gridPane.add(roll, 11, 2);
			gridPane.add(a, 1, 1,1,1);
			gridPane.add(b, 2, 1,1,1);
			gridPane.add(c, 3, 1,1,1);
			gridPane.add(d, 4, 1,1,1);
			gridPane.add(e, 5, 1,1,1);
			gridPane.add(f, 6, 1,1,1);
			gridPane.add(g, 6, 2,1,1);
			gridPane.add(h, 6, 3,1,1);
			gridPane.add(i, 6, 4,1,1);
			gridPane.add(j, 6, 5,1,1);
			gridPane.add(k, 6, 6,1,1);
			gridPane.add(l, 5, 6,1,1);
			gridPane.add(m, 4, 6,1,1);
			gridPane.add(n, 3, 6,1,1);
			gridPane.add(o, 2, 6,1,1);
			gridPane.add(p, 1, 6,1,1);
			gridPane.add(q, 1, 5,1,1);
			gridPane.add(r, 1, 4,1,1);
			gridPane.add(s, 1, 3,1,1);
			gridPane.add(t, 1, 2,1,1);
			
			
			//Rest of the scenes
			
			grid.setHeight(1000);
			grid.setWidth(1200);
			grid.setScene(startScene);
			grid.setTitle("Monopoly");
			grid.show();


		}


	static ArrayList<Button> buttons = new ArrayList<Button>(); // arraylist for buttons
	static ArrayList<String> ognames = new ArrayList<String>();


	public static void setLocation() {
		for(Player a : playersList) {
			String b = buttons.get(a.getLocation()).getText();
			buttons.get(a.getLocation()).setText(b + " " + a.getPlayerNumber());
		}
	}
	public static void correctLocation() {
		for(int a = 0; a< 19; a++) {
			buttons.get(a).setText(ognames.get(a));
		}
	}

	//colors the properties based on who owns them
		public static void main(String[] args) {
			
			//adding the map buttons to the buttons arraylist
			buttons.add(a);
			buttons.add(b);
			buttons.add(c);
			buttons.add(d);
			buttons.add(e);
			buttons.add(f);
			buttons.add(g);
			buttons.add(h);
			buttons.add(i);
			buttons.add(j);
			buttons.add(k);
			buttons.add(l);
			buttons.add(m);
			buttons.add(n);
			buttons.add(o);
			buttons.add(p);
			buttons.add(q);
			buttons.add(r);
			buttons.add(s);
			buttons.add(t);
			

	launch(args);
	}
	}
	public static void correctLocation() {
		for(String a : ognames) {
			buttontoProperty.get(ognames.indexOf(a)).setText(a);
	}
	}
	public static void setColor() {
	for(Property a : Gameplay.propertiesList()) {
		if(a.getOwner() == 1) {
			buttontoProperty.get(a.getPosition()).setBackground(Color.BLUE);
		}
		if(a.getOwner() == 2) {
			buttontoProperty.get(a.getPosition()).setBackground(Color.RED);
		}
		if(a.getOwner() == 3) {
			buttontoProperty.get(a.getPosition()).setBackground(Color.GREEN);
		}
		if(a.getOwner() == 0) {
			buttontoProperty.get(a.getPosition()).setBackground(Color.WHITE);
		}

	}
	}


	public static void main(String args[]) {
		public void startGame(ArrayList<Player> playersList, ArrayList<Property> propertiesList) {


		JFrame MonopolyMap = new JFrame("Monopoly Map");
		MonopolyMap.setLayout(new GridLayout(6, 6));
		JTextArea square = new JTextArea(); 
		
<<<<<<< HEAD
		//Go space
=======
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
	}
}
	// public static void main(String[] args) { 
	// 	ArrayList<Player> playersList = new ArrayList<Player>();
	// 	ArrayList<Property> propertiesList = new ArrayList<Property>();

	// 	while(Services.winingCondiction(playersList)) {
			
	// 	}
	// } 
 

	
		
		


	

	// public static void main(String args[]) {
		// public void startGame(ArrayList<Player> playersList, ArrayList<Property> propertiesList) {
		
>>>>>>> branch 'master' of https://github.com/joseph5-ship/Corona.git
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

	
<<<<<<< HEAD
		while(Services.winingCondiction(playersList)) {
			System.out.println(playersList.toString());
				//Start round
=======
	// 	while (Services.winingCondiction(playersList)) {
	// 		System.out.println(playersList.toString());
>>>>>>> branch 'master' of https://github.com/joseph5-ship/Corona.git
			
	// 		for (Player currentPlayer:playersList) {
	// 			if (!Services.winingCondiction(playersList)) {
	// 				break;
	// 			}
	// 			System.out.println(currentPlayer.getPlayerName() + "'s turn");
	// 			System.out.println("Money: " + currentPlayer.getMoney());
	// 			System.out.println("Location: " + currentPlayer.getLocation());
	// 			Services.locationUpdate(currentPlayer);
	// 			System.out.println("Location: " + currentPlayer.getLocation());
	// 			System.out.println("Property name: " + propertiesList.get(currentPlayer.getLocation()).getPropertyName());
				
	// 			//special location checking
				
<<<<<<< HEAD
				if(currentPlayer.getLocation() == 10) {
					Services.payJail(currentPlayer);
				}else if (currentPlayer.getLocation() == 5||currentPlayer.getLocation() == 15) {
					if (currentPlayer.getPlayer) {
						
					}
					continue;
				}
=======
	// 			if(currentPlayer.getLocation() == 10) {
	// 				Services.payJail(currentPlayer);
	// 			}else if (currentPlayer.getLocation() == 5||currentPlayer.getLocation() == 15) {
	// 				UsingRandomCard.humanUseRandomCard(propertiesList,currentPlayer);
	// 				continue;
	// 			}
>>>>>>> branch 'master' of https://github.com/joseph5-ship/Corona.git

	// 			//if it is normal property, buying,renting ,building
	// 			if (currentPlayer.getPlayerNumber()==0) {
	// 				//Human player turn
	// 	        	if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
	// 	        		System.out.println("Do you want to bulid house on this property? (Y/N)");
	// 					Scanner input = new Scanner(System.in);
	// 			        String choice = input.nextLine();
	// 			        if (choice.equalsIgnoreCase("Y")) {
	// 			        	Services.buildHouse(currentPlayer, propertiesList);
	// 			        }
					
	// 				}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
	// 					System.out.println("Do you want to buy this property? (Y/N)");
	// 					Scanner input = new Scanner(System.in);
	// 			        String choice = input.nextLine();
	// 			        if (choice.equalsIgnoreCase("Y")) {
	// 			        	Services.buyLand(currentPlayer, propertiesList);
	// 			        }
	// 				}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
	// 					Services.rent(currentPlayer, propertiesList, playersList);
	// 				}
	// 			}else {
	// 				//AI turn
	// 					if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
	// 						if (currentPlayer.getMoney()>=400) {
	// 							Services.buildHouse(currentPlayer, propertiesList);
	// 						}
	// 					}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
	// 						if (currentPlayer.getMoney()>=300) {
	// 							Services.buyLand(currentPlayer, propertiesList);
	// 						}	
	// 					}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
	// 						Services.rent(currentPlayer, propertiesList, playersList);
	// 					}
	// 			}
	// 			System.out.println("");

	// 		}
	// 	}
		 
	// 	//Game ends
		
	// 	Services.findWinner(playersList, propertiesList);
	// 	System.out.println("End Game");
		
	// } 
	