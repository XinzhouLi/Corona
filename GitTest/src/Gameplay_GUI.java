import javafx.application.Application;  
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
import javafx.scene.control.TextField;

	public class Gameplay_GUI extends Application {
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
			static Button infos = new Button("Information");
			static Button buy = new Button("Buy");
			static Button endturn = new Button("End Turn");
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
			static TextField LocationInput = new TextField();
			static Button Ok = new Button("Ok");
			static Circle circle = new Circle();
			static Circle circle2 = new Circle();
			static Circle circle3 = new Circle();
			static Circle circle4 = new Circle();
			public boolean ii = false;
			
			//setter for turn
			public static void setTurn(int a) {
				if(a >= 0 && a <= 3) {
					turn = a;
				}
			}
			
			//get turn
			public static int getTurn() {
				return turn;
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
	circle.setRadius(8);
	circle2.setRadius(8);
	circle3.setRadius(8);
	circle4.setRadius(8);
	
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
	LocationInput.setPrefWidth(btnWidth);
	
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
	
	//END SCENE 
			GridPane screenPane = new GridPane();
			screenPane.setAlignment(Pos.CENTER);
			screenPane.setVgap(20);
			
			//labels
			Label winningMessage = new Label(playersList.get(Services.findWinner(playersList, propertiesList)).getPlayerName() + " won, congratulations!");
			winningMessage.setStyle("-fx-font: 50 cambria;");
			screenPane.add(winningMessage, 0, 0);		
	
			
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
	
	//ALL SCENES
	Scene a1 = new Scene(borderPane,150,150);
	Scene startScene = new Scene(screen, 150, 150);
	Scene endScene = new Scene(screenPane, 150, 150);

	//event handler for all the map square buttons, when pressed they write their functions in the information text box.
	GUI_Board.buttonHandler(buttons, infoTextField);
		
		
		// moves a players circle relative to the map depending on whose turn it is
		

		roll.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	roll.setDisable(true);
		    	int presentLocation = playersList.get(turn).getLocation();
//		    	int newroll = Services.locationUpdate(playersList.get(turn));
		    	playersList.get(turn).setLocation(5);
		    	String newtext1 = Services.checkGo(presentLocation, playersList.get(turn));
//		    	infoText=turn + " Congrats, you rolled a " + newroll+"\n"  + newtext1;
//		    	infoTextField.setText(infoText);
		    	playersList.get(turn).setLocation(playersList.get(turn).getLocation());
		    	
		    	//bigproblem
		    	if (playersList.get(turn).getLocation() == 10) {
					Services.payJail(playersList.get(turn));
					infoText = playersList.get(turn).getPlayerName() + "You are in jail, lose 50 dollars, you filthy thief!\n";
					infoTextField.setText(infoText);
				}else if (propertiesList.get(playersList.get(turn).getLocation()).getOwner() != playersList.get(turn).getPlayerNumber() && propertiesList.get(playersList.get(turn).getLocation()).getOwner() != 5) {
					Services.rent(playersList.get(turn), propertiesList, playersList);
					infoText = infoText +playersList.get(turn).getPlayerName()+" pays "+propertiesList.get(playersList.get(turn).getLocation()).getRent()+" to "+Services.searchPlayer(playersList.get(turn).getLocation(), propertiesList, playersList).getPlayerName()+"\n";
					infoTextField.setText(infoText);
				}
		    	gridPane.getChildren().remove(circs.get(turn));
		    	gridPane.add(circs.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
		    	endturn.setDisable(false);
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
		    		infoText = infoText + "You cannot buy this property.\n";
					infoTextField.setText(infoText);
				}
		    }
		});
		endturn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	if(turn + 1 % 4 == 0) {
		    		endturn.setDisable(true);
		    	}
		    	roll.setDisable(false);
		    	buy.setDisable(false);
		    	build.setDisable(false);
		    	random.setDisable(false);

		    	
		    	infoText="";
		    	int a = turn + 1;
		    	int newturn = a%4;
		    	turn = newturn;
		    	infoText = infoText + "You have ended your turn! It's now player " + turn + "'s turn\n";
		    	infoTextField.setText(infoText);
	        	GUI_Board.setColor(propertiesList, buttons);
		    	if (Services.winingCondiction(playersList) == false) {
		    		grid.setScene(endScene);
				}
		    	AIturn();
		    }
		});
		infos.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	infoText = "Player name: " + playersList.get(turn).getPlayerName() +"\n Player Money: " + playersList.get(turn).getMoney() + "\n Player Properties: " + playersList.get(turn).getProperties() + "\n Player Number: " + playersList.get(turn).getPlayerNumber() + ", ";
	            infoTextField.setText(infoText);
		    		
		    }
		});

		random.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				if (playersList.get(turn).getLocation()==15||
						playersList.get(turn).getLocation()==5) {
					random.setDisable(true);
						if (playersList.get(turn).getPlayerNumber()==0) {
							printStuff(infoTextField);
							if (Constant.CHOSENNUM==1) {
							
								
								UsingRandomCard.jailCard(playersList.get(turn));
							}
							else if(Constant.CHOSENNUM==3) {
							
							
								UsingRandomCard.addMoney(playersList.get(turn));
							}
							else if(Constant.CHOSENNUM==4) {
							
							
								UsingRandomCard.lostMoney(playersList.get(turn));
							}else {
								LocationInput.setDisable(false);
								Ok.setDisable(false);
							}

							setColor();
							gridPane.add(circs.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
						}else {
							GUIcomputerUseRandom(propertiesList, playersList.get(turn), infoTextField);
							setColor();
							gridPane.add(circs.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
						}
	    }
			}});
		
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
		    	GUI_Board.setColor(propertiesList, buttons);
		    	grid.setScene(a1);
		    }
		});
		
		
		Ok.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				LocationInput.setDisable(true);
				Ok.setDisable(true);
				Integer value = Integer.valueOf(LocationInput.getText());
				System.out.println(value);
				if (Constant.CHOSENNUM==2) {
		
					UsingRandomCard.useStealCard(propertiesList,playersList.get(turn),value);
					setColor();
					gridPane.add(circs.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
				}
				else if(Constant.CHOSENNUM==5) {

					UsingRandomCard.moveCardGUI(value ,playersList.get(turn));
					setColor();
					gridPane.add(circs.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
				}
				else if(Constant.CHOSENNUM==6) {
				
					UsingRandomCard.useStealCard(propertiesList,playersList.get(turn),value);
					int money=playersList.get(turn).getMoney();
					playersList.get(turn).setMoney(money+200);
		
					setColor();
					gridPane.add(circs.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
				}
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
		gridPane.add(Ok, 0, 0);
		gridPane.add(LocationInput, 1, 0);
		
//		playersList.get(0).setMoney(200);
		
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
//public static void GUIhumanUseRandomCard(ArrayList<Property> propertyList,Player player,String infotext,Label infoTextField) {
//	Constant.CHOSENNUM=UsingRandomCard.reciveCard();
//	if (Constant.CHOSENNUM==1) {
//		infotext+="It is a jail card, go to the jail";
//		infoTextField.setText(infotext);
//		UsingRandomCard.jailCard(player);
//	}
////	else if(luckNumber==2) {
////		int propertyNumber=posStealCard();
////		useStealCard(propertyList,player,propertyNumber);
////	}
//	else if(Constant.CHOSENNUM==3) {
//		infotext+="do not get any card, but recive the money(200)";
//		infoTextField.setText(infotext);
//		UsingRandomCard.addMoney(player);
//	}
//	else if(Constant.CHOSENNUM==4) {
//		infotext+="do not get any card and lose the money(200)";
//		infoTextField.setText(infotext);
//		UsingRandomCard.lostMoney(player);
//	}
////	else if(luckNumber==5){
////		moveCard(player);
////	}
//	else {
//		//value
////		while (Constant.CHOSENNUM>19) {
////			Constant.CHOSENNUM=Constant.CHOSENNUM;
////		
//		
//		if (Constant.CHOSENNUM==2) {
//			infotext+="Steal property card";
//			infoTextField.setText(infotext);
//			int propertyNumber=Constant.CHOSENNUM;
//			UsingRandomCard.useStealCard(propertyList,player,Constant.CHOSENNUM);
//			
//		}
//		else if(Constant.CHOSENNUM==5) {
//			infotext+="It is a move card";
//			infoTextField.setText(infotext);
//			UsingRandomCard.moveCardGUI(Constant.CHOSENNUM ,player);
//			
//		}
//		else {
//			infotext+="Get 200 money any also get a steal proeprty card";
//			int propertyNumber=Constant.CHOSENNUM;
//			UsingRandomCard.useStealCard(propertyList,player,Constant.CHOSENNUM);
//			int money=player.getMoney();
//			player.setMoney(money+200);
//			infoTextField.setText(infotext);
//		}
//	}
//	}

public static void printStuff(Label infoTextField) {
	Constant.CHOSENNUM=UsingRandomCard.reciveCard();
	if (Constant.CHOSENNUM==1) {
		infoText+="It is a jail card, go to the jail";
		infoTextField.setText(infoText);
		System.out.println("It is a jail card, go to the jail");
	}
	else if(Constant.CHOSENNUM==2) {
		infoText+="Steal property card";
		infoTextField.setText(infoText);
		System.out.println("Steal property card");
}
	else if(Constant.CHOSENNUM==3) {
		infoText+="do not get any card, but recive the money(200)";
		infoTextField.setText(infoText);
		System.out.println("do not get any card, but recive the money(200)");
	}
	else if(Constant.CHOSENNUM==4) {
		infoText+="do not get any card and lose the money(200)";
		infoTextField.setText(infoText);
		System.out.println("do not get any card and lose the money(200)");
	}
	else if(Constant.CHOSENNUM==5){
		infoText+="It is a move card";
		infoTextField.setText(infoText);
		System.out.println("It is a move card");
	}
	else {
		infoText+="Get 200 money any also get a steal proeprty card";
		System.out.println("Get 200 money any also get a steal proeprty card");
		infoTextField.setText(infoText);
		}
	
}
public static void AIturn() {
	if (playersList.get(turn).getPlayerNumber()==1||
		playersList.get(turn).getPlayerNumber()==2||
		playersList.get(turn).getPlayerNumber()==3) {
		roll.fire();
		if (playersList.get(turn).getLocation()==5||
			playersList.get(turn).getLocation()==15) {
			random.fire();
		} 
		if (playersList.get(turn).getMoney()>=300&&propertiesList.get(playersList.get(turn).getLocation()).getOwner()==playersList.get(turn).getPlayerNumber()) {
			build.fire();
		}else if (playersList.get(turn).getMoney()>=300&&propertiesList.get(playersList.get(turn).getLocation()).getOwner()==5) {
			buy.fire();
		}
		
	}
}
public static void GUIcomputerUseRandom(ArrayList<Property> propertiesList, Player player,Label infoTextField) {
	int luckNumber=UsingRandomCard.reciveCard();
	if (luckNumber==1) {
		infoText+=player.getPlayerName()+"go tot the jail";
		UsingRandomCard.jailCard(player);
	}
	
	else if(luckNumber==2) {
		infoText+="Get a steal property card";
		int propertyNumber=computerUseRandomCard.computerUseStealCard(propertiesList,player);
		Property chosenProperty=propertiesList.get(propertyNumber);
		infoText+=""+player.getPlayerName()+"get the property"+chosenProperty.getPropertyName();
		UsingRandomCard.useStealCard(propertiesList,player,propertyNumber);
	}
	
	else if(luckNumber==3) {
		infoText+=player.getPlayerName()+"do not get any card, but recive the money(200)";
		UsingRandomCard.addMoney(player);
	}
	
	else if(luckNumber==4) {
		infoText+=player.getPlayerName()+"do not get any card and lose the money(200)";
		UsingRandomCard.lostMoney(player);
	}
	
	else if(luckNumber==5){
		infoText+=player.getPlayerNumber()+"Recive a move card";
		computerUseRandomCard.computerUseMoveCard(propertiesList,player);
	}
	
	else {
		infoText+=""+player.getPlayerName()+"Recive 200 money a rob card";
		int propertyNumber=computerUseRandomCard.computerUseStealCard(propertiesList,player);
		Property chosenProperty=propertiesList.get(propertyNumber);
		infoText+=""+player.getPlayerName()+"get the property"+chosenProperty.getPropertyName();
		UsingRandomCard.useStealCard(propertiesList,player,propertyNumber);
		UsingRandomCard.addMoney(player);
	}
	infoTextField.setText(infoText);
}


//colors the properties based on who owns them
public static void setColor() {
	for(Property a : propertiesList) {
		if(a.getOwner() == 0) {
			buttons.get(a.getPosition()).setStyle("-fx-background-color: Blue");
		}
		if(a.getOwner() == 1) {
			buttons.get(a.getPosition()).setStyle("-fx-background-color: Red");
		}
		if(a.getOwner() == 2) {
			buttons.get(a.getPosition()).setStyle("-fx-background-color: Green");
		}
		if(a.getOwner() == 3) {
			buttons.get(a.getPosition()).setStyle("-fx-background-color: Yellow");
		}
		if(a.getOwner() == 5) {
			buttons.get(a.getPosition()).setStyle("-fx-background-color: Tan");
		}
		
	}
}

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