
import javafx.animation.RotateTransition;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Gameplay_GUI extends Application {
	static ArrayList<Button> buttons = new ArrayList<Button>(); // arraylist for buttons
	static ArrayList<String> ognames = new ArrayList<String>();
	static private int btnWidth = 100; // width of buttons
	static private int btnHeight = 70; //height of buttons
	static private int imgWidth = 80; // width of buttons
	static private int imgHeight = 50; //height of buttons
	static private int picSizeHeight;
	static private int picSizeWidth;
	static private int infoWidth = 300; //width of info text box
	static private int infoHeight = 500; //height of info text box 
	static private String infoText = "";
	static ArrayList<Player> playersList = InitialList.playersList(); // arraylist made for the player 0th indecy is first player
	static ArrayList<Property> propertiesList = InitialList.propertiesList(); // arraylist made for the property 0th indecy is first property
	static ArrayList<Circle> circs = new ArrayList<Circle>(); //arraylist made for the cirlces 0th indecy is first circle correlating to first player
	static private int turn = 0; // whose turn it is 0 means it is first players turn

	//START SCREEN
	private int btnWidthSelect = 200;
	private int btnLengthSelect = 80;
	private int scrnWidth = 900;
	private int scrnLength = 600;
	private int buttonSpace = 30;
	private int duration = 500;
	private int btnAngle = 15;
	private int cycleCount = 1000;
	
	private Button startButton = new Button("Start");
	private Button creditButton = new Button("Credits");
	private Button descriptButton = new Button("Description");
	private Button backButtonCredit = new Button("Back");
	private Button backButtonDescript = new Button("Back");
	static TextField LocationInput = new TextField();

	
	//INITIALIZING MUSIC
		URL url = this.getClass().getClassLoader().getResource("bensound-energy.mp3");
		Media music = new Media(url.toExternalForm());
		MediaPlayer mPlayer = new MediaPlayer(music);
	
	
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
	AnchorPane anchorPane = new AnchorPane();
	Label info = new Label("Information");
	borderPane.setRight(info);
	Label infoTextField = new Label();
	infoTextField.setAlignment(Pos.BOTTOM_CENTER);
	infoTextField.setWrapText(true);
	infoTextField.setStyle("-fx-background-color: white;");;
	infoTextField.setPrefSize(infoWidth, infoHeight);
	LocationInput.setPrefWidth(btnWidth);
	anchorPane.getChildren().addAll(info,infoTextField);
	borderPane.setRight(anchorPane);

	
	//START SCENE
			grid.setTitle("Start Screen");
			Reflection ref = new Reflection();
			
			GridPane screen = new GridPane();
			screen.setAlignment(Pos.CENTER);
			screen.setVgap(20);
			screen.setPadding(new Insets(25, 25, 25, 25));		

			GridPane creditScreen = new GridPane();
			creditScreen.setAlignment(Pos.CENTER);
			creditScreen.setPadding(new Insets(25, 25, 25, 25));		
			
			GridPane descriptScreen = new GridPane();
			descriptScreen.setAlignment(Pos.CENTER);
			descriptScreen.setPadding(new Insets(25, 25, 25, 25));
	
	//END SCENE 
			
	
	//SCENES
			Scene startScene = new Scene(screen, scrnWidth, scrnLength);
			Scene creditScene = new Scene(creditScreen, scrnWidth, scrnLength);
			Scene descriptScene = new Scene(descriptScreen, scrnWidth, scrnLength);
		
			
	//BUTTONS - Start Scene
	startButton.setPrefSize(btnWidthSelect, btnLengthSelect);
	startButton.setStyle("-fx-font: 25 tahoma; -fx-base: #b6e7c9;");
	startButton.setEffect(ref);
	
	creditButton.setPrefSize(btnWidthSelect, btnLengthSelect);
	creditButton.setStyle("-fx-font: 25 tahoma; -fx-base: #b6e7c9;");
	creditButton.setEffect(ref);
	
	descriptButton.setPrefSize(btnWidthSelect, btnLengthSelect);
	descriptButton.setStyle("-fx-font: 25 tahoma; -fx-base: #b6e7c9;");
	descriptButton.setEffect(ref);
	
	HBox horizontalButton = new HBox(buttonSpace);
	horizontalButton.getChildren().addAll(startButton, creditButton, descriptButton);
	screen.add(horizontalButton, 0, 3);
	
	//END SCENE 
			GridPane screenPane = new GridPane();
			screenPane.setAlignment(Pos.CENTER);
			screenPane.setVgap(20);
			
			//labels
			Label winningMessage = new Label(playersList.get(Services.findWinner(playersList, propertiesList)).getPlayerName() + " won, congratulations!");
			winningMessage.setStyle("-fx-font: 50 cambria;");
			screenPane.add(winningMessage, 0, 0);		
	
			//TITLE - Start Scene
			FileInputStream imageInput = new FileInputStream("C:\\Users\\User\\Desktop\\CPSC233\\ProjectImages\\MonopolyTitle.png");
	        Image title = new Image(imageInput);
	        ImageView viewTitle = new ImageView(title);        
			screen.add(viewTitle, 0, 0);
			
			//BACKGROUNDS 	
			String styleStart = "-fx-background-color: rgba(100, 255, 255, 0.5);";
			screen.setStyle(styleStart);
			
			String styleCredit = "-fx-background-color: rgba(100, 55, 255, 0.5);";
			creditScreen.setStyle(styleCredit);
			
			String styleDescript = "-fx-background-color: rgba(100, 125, 255, 0.5);";
			descriptScreen.setStyle(styleDescript);
			
	//setting the buttons to the width and height we want
			int index = 0;
			while(index < 20) {
				buttons.get(index).setPrefSize(btnWidth, btnHeight);
				index = index + 1;
			}
			
			//ANIMATION
			RotateTransition rotateStart = new RotateTransition();
			rotateStart.setNode(startButton);
		    rotateStart.setDuration(Duration.millis(duration)); 
			rotateStart.setByAngle(btnAngle);
			rotateStart.setCycleCount(cycleCount);
			rotateStart.setAutoReverse(true);
			rotateStart.play();
			
			RotateTransition rotateCredit = new RotateTransition();
			rotateCredit.setNode(creditButton);
			rotateCredit.setDuration(Duration.millis(duration)); 
			rotateCredit.setByAngle(-btnAngle);
			rotateCredit.setCycleCount(cycleCount);
			rotateCredit.setAutoReverse(true);
			rotateCredit.play();
			
			RotateTransition rotateDescription = new RotateTransition();
			rotateDescription.setNode(descriptButton);
			rotateDescription.setDuration(Duration.millis(duration)); 
			rotateDescription.setByAngle(btnAngle);
			rotateDescription.setCycleCount(cycleCount);
			rotateDescription.setAutoReverse(true);
			rotateDescription.play();
			
			RotateTransition rotateTitle = new RotateTransition();
			rotateTitle.setNode(viewTitle);
			rotateTitle.setDuration(Duration.millis(duration));
			rotateTitle.setByAngle(-btnAngle);
			rotateTitle.setCycleCount(cycleCount);
			rotateTitle.setAutoReverse(true);
			rotateTitle.play();
			
			RotateTransition rotateBack = new RotateTransition();
			rotateBack.setNode(backButtonCredit);
			rotateBack.setDuration(Duration.millis(duration));
			rotateBack.setByAngle(-btnAngle);
			rotateBack.setCycleCount(cycleCount);
			rotateBack.setAutoReverse(true);
			rotateBack.play();
			
			RotateTransition rotateBackDescript = new RotateTransition();
			rotateBackDescript.setNode(backButtonDescript);
			rotateBackDescript.setDuration(Duration.millis(duration));
			rotateBackDescript.setByAngle(-btnAngle);
			rotateBackDescript.setCycleCount(cycleCount);
			rotateBackDescript.setAutoReverse(true);
			rotateBackDescript.play();
			
			//SCENE - Credits
			String creditTitleString = "CREDITS: ";
			String creditInformationString = "Xudong Miao\nAli Parsaee\nXinshou Li\nSarmad Manzar\nJoseph Lam";
			
			Label creditTitle = new Label(creditTitleString);
			creditTitle.setStyle("-fx-font: 50 cambria");
			Label creditInfo = new Label(creditInformationString);
			creditInfo.setStyle("-fx-font: 30 cambria");
			
			creditScreen.add(creditTitle, 0, 0);
			creditScreen.add(creditInfo, 0, 1);
			
			backButtonCredit.setPrefSize(btnWidthSelect, btnLengthSelect);
			backButtonCredit.setStyle("-fx-font: 25 tahoma; -fx-base: #b6e7c9;");
			backButtonCredit.setEffect(ref);
			creditScreen.add(backButtonCredit, 3, 6);
			
			//SCENE - Project description
			String descriptTitleString = "Project Description: ";
			String descriptString = "Play a game of Monopoly!\nCaught in the throes of boredom, you find yourself\n"
					+ "seeking some semblance of entertainment.\nHuzzah! And what do you find within your reach?\n"
					+ "A perfectly accessible, online version of Monopoly!\nHave at it, folks!";
			
			Label descriptTitle = new Label(descriptTitleString);
			descriptTitle.setStyle("-fx-font: 50 cambria");
			Label descriptInfo = new Label(descriptString);
			descriptInfo.setStyle("-fx-font: 30 cambria");
			
			descriptScreen.add(descriptTitle, 0, 0);
			descriptScreen.add(descriptInfo, 0, 1);
			
			backButtonDescript.setPrefSize(btnWidthSelect, btnLengthSelect);
			backButtonDescript.setStyle("-fx-font: 25 tahoma; -fx-base: #b6e7c9;");
			backButtonDescript.setEffect(ref);
			descriptScreen.add(backButtonDescript, 3, 6);
	    	
			//PLAYING MUSIC
			mPlayer.setAutoPlay(true);
	    	mPlayer.setCycleCount(cycleCount);
	    	
			//ACTION BUTTONS
			creditButton.setOnAction(new EventHandler<ActionEvent>() {
				 
			    @Override
			    public void handle(ActionEvent e) {
			    	grid.setScene(creditScene);
			    }
			});
			
			descriptButton.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent e) {
					grid.setScene(descriptScene);
				}
					
		    });
			
			backButtonCredit.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent e) {
					grid.setScene(startScene);
				}
					
		    });
			
			backButtonDescript.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent e) {
					grid.setScene(startScene);
				}
					
		    });

	infos.setPrefSize(btnWidth, btnHeight);
	buy.setPrefSize(btnWidth, btnHeight);
	endturn.setPrefSize(btnWidth, btnHeight);
	build.setPrefSize(btnWidth, btnHeight);
	random.setPrefSize(btnWidth, btnHeight);
	roll.setPrefSize(btnWidth, btnHeight);
	
	//ALL SCENES
	Scene mainScene = new Scene(borderPane,150,150);
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
		    	infoText = infoText + playersList.get(turn).getPlayerName()+ "\n"+ "Money: "+playersList.get(turn).getMoney() +"\n";
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
					    	gridPane.getChildren().remove(circs.get(turn));
					    	gridPane.add(circs.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
						}else {
							GUIcomputerUseRandom(propertiesList, playersList.get(turn), infoTextField);
							setColor();
					    	gridPane.getChildren().remove(circs.get(turn));
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
		    	grid.setScene(mainScene);
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
		gridPane.add(Ok, 0, 0);
		gridPane.add(LocationInput, 1, 0);
		
//		playersList.get(0).setMoney(200);	
		grid.setHeight(1000);
		grid.setWidth(1200);
		grid.setScene(startScene);
		grid.setTitle("Monopoly");
		grid.show();


	}


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

public static void AIturn() {
	if (playersList.get(turn).getPlayerNumber()==1||
		playersList.get(turn).getPlayerNumber()==2||
		playersList.get(turn).getPlayerNumber()==3) {
		infoText = infoText + playersList.get(turn).getPlayerName()+ "\n"+ "Money: "+playersList.get(turn).getMoney() +"\n";
    	infoText = infoText + "You have ended your turn! It's now player " + turn + "'s turn\n";
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

