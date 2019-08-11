
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage; 
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;
import java.util.Collection;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;




	public class Gameplay_GUI extends Application {
		static ArrayList<Button> buttons = new ArrayList<Button>(); // arraylist for buttons
		static ArrayList<String> ognames = new ArrayList<String>();
		static private int btnWidth = 150; // width of buttons
		static private int btnHeight = 150; //height of buttons
		static private int imgWidth = 130; // width of buttons
		static private int imgHeight = 130; //height of buttons
		static private int picSizeHeight;
		static private int picSizeWidth;
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
			static Button button1 = new Button("Go");
			static Button button2 = new Button("Canada");
			static Button button3 = new Button("Brazil");
			static Button button4 = new Button("Russia");
			static Button button5 = new Button("Mexico");
			static Button button6 = new Button("Chance");
			static Button button7 = new Button("Egypt");
			static Button button8 = new Button("Turkey");
			static Button button9 = new Button("Germany");
			static Button button10 = new Button("UK");
			static Button button11 = new Button("Jail");
			static Button button12 = new Button("Italy");
			static Button button13 = new Button("SouthAfrica");
			static Button button14 = new Button("SouthKorea");
			static Button button15 = new Button("Columbia");
			static Button button16 = new Button("Treasure");
			static Button button17 = new Button("China");
			static Button button18 = new Button("India");
			static Button button19 = new Button("US");
			static Button button20 = new Button("Japan");
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
	buttons.add(button1);
	buttons.add(button2);
	buttons.add(button3);
	buttons.add(button4);
	buttons.add(button5);
	buttons.add(button6);
	buttons.add(button7);
	buttons.add(button8);
	buttons.add(button9);
	buttons.add(button10);
	buttons.add(button11);
	buttons.add(button12);
	buttons.add(button13);
	buttons.add(button14);
	buttons.add(button15);
	buttons.add(button16);
	buttons.add(button17);
	buttons.add(button18);
	buttons.add(button19);
	buttons.add(button20);
	 Image bg1 = new Image(getClass().getResourceAsStream("bg1.jpg"));
	 Image Go = new Image(getClass().getResourceAsStream("Go.png"));
	 Image Canada = new Image(getClass().getResourceAsStream("Canada.png"));
	 Image Brazil = new Image(getClass().getResourceAsStream("Brazil.png"));
	 Image Russia = new Image(getClass().getResourceAsStream("Russia.png"));
	 Image Mexico = new Image(getClass().getResourceAsStream("Mexico.png"));
	 Image Chance = new Image(getClass().getResourceAsStream("Chance.png"));
	 Image Egypt = new Image(getClass().getResourceAsStream("Egypt .png"));
	 Image Turkey = new Image(getClass().getResourceAsStream("Turkey.png"));
	 Image Germany = new Image(getClass().getResourceAsStream("Germany.png"));
	 Image UK = new Image(getClass().getResourceAsStream("Uk.png"));
	 Image Jail = new Image(getClass().getResourceAsStream("Jail.png"));
	 Image Italy = new Image(getClass().getResourceAsStream("Italy.png"));
	 Image SouthAfrica = new Image(getClass().getResourceAsStream("South Africa.png"));
	 Image SouthKorea = new Image(getClass().getResourceAsStream("SouthKorea.png"));
	 Image Columbia = new Image(getClass().getResourceAsStream("Columbia.png"));
	 Image Treasure = new Image(getClass().getResourceAsStream("Treasure.jpg"));
	 Image China = new Image(getClass().getResourceAsStream("China.png"));
	 Image India = new Image(getClass().getResourceAsStream("India.png"));
	 Image US = new Image(getClass().getResourceAsStream("US.png"));
	 Image Japan = new Image(getClass().getResourceAsStream("Japan.png"));

	 ImageView Go1 = new ImageView(Go);
	 ImageView Canada1 = new ImageView(Canada);
	 ImageView Brazil1 = new ImageView(Brazil);
	 ImageView Russia1 = new ImageView(Russia);
	 ImageView Mexico1 = new ImageView(Mexico);
	 ImageView Chance1 = new ImageView(Chance);
	 ImageView Egypt1 = new ImageView(Egypt );
	 ImageView Turkey1 = new ImageView(Turkey);
	 ImageView Germany1 = new ImageView(Germany);
	 ImageView UK1 = new ImageView(UK);
	 ImageView Jail1 = new ImageView(Jail);
	 ImageView Italy1 = new ImageView(Italy);
	 ImageView SouthAfrica1 = new ImageView(SouthAfrica);
	 ImageView SouthKorea1 = new ImageView(SouthKorea);
	 ImageView Columbia1 = new ImageView(Columbia);
	 ImageView Treasure1 = new ImageView(Treasure);
	 ImageView China1 = new ImageView(China);
	 ImageView India1 = new ImageView(India);
	 ImageView US1 = new ImageView(US);
	 ImageView Japan1 = new ImageView(Japan);
	 Go1.setFitHeight(imgHeight);
	 Canada1.setFitHeight(imgHeight);
	 Brazil1.setFitHeight(imgHeight);
	 Russia1.setFitHeight(imgHeight);
	 Mexico1.setFitHeight(imgHeight);
	 Chance1.setFitHeight(imgHeight);
	 Egypt1.setFitHeight(imgHeight);
	 Turkey1.setFitHeight(imgHeight);
	 Germany1.setFitHeight(imgHeight);
	 UK1.setFitHeight(imgHeight);
	 Jail1.setFitHeight(imgHeight);
	 Italy1.setFitHeight(imgHeight);
	 SouthAfrica1.setFitHeight(imgHeight);
	 SouthKorea1.setFitHeight(imgHeight);
	 Columbia1.setFitHeight(imgHeight);
	 Treasure1.setFitHeight(imgHeight);
	 China1.setFitHeight(imgHeight);
	 India1.setFitHeight(imgHeight);
	 US1.setFitHeight(imgHeight);
	 Japan1.setFitHeight(imgHeight);
		Go1.setFitWidth(imgWidth);
		 Canada1.setFitWidth(imgWidth);
		 Brazil1.setFitWidth(imgWidth);
		 Russia1.setFitWidth(imgWidth);
		 Mexico1.setFitWidth(imgWidth);
		 Chance1.setFitWidth(imgWidth);
		 Egypt1.setFitWidth(imgWidth);
		 Turkey1.setFitWidth(imgWidth);
		 Germany1.setFitWidth(imgWidth);
		 UK1.setFitWidth(imgWidth);
		 Jail1.setFitWidth(imgWidth);
		 Italy1.setFitWidth(imgWidth);
		 SouthAfrica1.setFitWidth(imgWidth);
		 SouthKorea1.setFitWidth(imgWidth);
		 Columbia1.setFitWidth(imgWidth);
		 Treasure1.setFitWidth(imgWidth);
		 China1.setFitWidth(imgWidth);
		 India1.setFitWidth(imgWidth);
		 US1.setFitWidth(imgWidth);
		 Japan1.setFitWidth(imgWidth);
		button1.setGraphic(Go1);
		button2.setGraphic(Canada1);
		button3.setGraphic(Brazil1);
		button4.setGraphic(Russia1);
		button5.setGraphic(Mexico1);
		button6.setGraphic(Chance1);
		button7.setGraphic(Egypt1);
		button8.setGraphic(Turkey1);
		button9.setGraphic(Germany1);
		button10.setGraphic(UK1);
		button11.setGraphic(Jail1);
		button12.setGraphic(Italy1);
		button13.setGraphic(SouthAfrica1);
		button14.setGraphic(SouthKorea1);
		button15.setGraphic(Columbia1);
		button16.setGraphic(Treasure1);
		button17.setGraphic(China1);
		button18.setGraphic(India1);
		button19.setGraphic(US1);
		button20.setGraphic(Japan1);
		for(Button button: buttons) {
			 button.setContentDisplay(ContentDisplay.BOTTOM);
		}

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
//	borderPane.setBottom(infoTextField);

	
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
	Scene mainScene = new Scene(borderPane,150,150);
	Scene startScene = new Scene(screen, 150, 150);
	Scene endScene = new Scene(screenPane, 150, 150);
	BackgroundSize sizeforbg = new BackgroundSize(100,100,true,true,true,true
			);
	BackgroundImage bimg = new BackgroundImage(bg1, null, null, null, sizeforbg);
	gridPane.setBackground(new Background(bimg));
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
		    	GUI_Board.setColor(propertiesList, buttons);
		    	if(turn + 1 %4 == 0) {
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
		    	GUI_Board.setColor(propertiesList, buttons);
		    	grid.setScene(mainScene);
		    }
		});
		
		gridPane.add(circle, change.changeX(playersList.get(0).getLocation()), change.changeY(playersList.get(0).getLocation()));
		gridPane.add(circle2, change.changeX(playersList.get(1).getLocation()), change.changeY(playersList.get(1).getLocation()));
		gridPane.add(circle3, change.changeX(playersList.get(2).getLocation()), change.changeY(playersList.get(2).getLocation()));
		gridPane.add(circle4, change.changeX(playersList.get(3).getLocation()), change.changeY(playersList.get(3).getLocation()));
		
	
	//setting padding and adding buttons to the coordinates we want
		gridPane.setPadding(new Insets (25, 25, 25, 25));
//		gridPane.add(infos, 4, 3);
		gridPane.add(buy, 3, 4);
		gridPane.add(endturn, 3, 3);
		gridPane.add(build, 4, 4);
		gridPane.add(random, 4, 3);
		gridPane.add(roll, 20, 2);
		gridPane.add(button1, 1, 1,1,1);
		gridPane.add(button2, 2, 1,1,1);
		gridPane.add(button3, 3, 1,1,1);
		gridPane.add(button4, 4, 1,1,1);
		gridPane.add(button5, 5, 1,1,1);
		gridPane.add(button6, 6, 1,1,1);
		gridPane.add(button7, 6, 2,1,1);
		gridPane.add(button8, 6, 3,1,1);
		gridPane.add(button9, 6, 4,1,1);
		gridPane.add(button10, 6, 5,1,1);
		gridPane.add(button11, 6, 6,1,1);
		gridPane.add(button12, 5, 6,1,1);
		gridPane.add(button13, 4, 6,1,1);
		gridPane.add(button14, 3, 6,1,1);
		gridPane.add(button15, 2, 6,1,1);
		gridPane.add(button16, 1, 6,1,1);
		gridPane.add(button17, 1, 5,1,1);
		gridPane.add(button18, 1, 4,1,1);
		gridPane.add(button19, 1, 3,1,1);
		gridPane.add(button20, 1, 2,1,1);
		
		
//		playersList.get(0).setMoney(200);	
		grid.setHeight(1000);
		grid.setWidth(1200);
		grid.setScene(startScene);
		grid.setTitle("Monopoly");
		grid.show();


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
//colors the properties based on who owns them
	public static void main(String[] args) {

		//adding the map buttons to the buttons arraylist
//		buttons.add(firstbutton);
		
launch(args);
}
}

