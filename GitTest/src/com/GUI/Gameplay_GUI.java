package com.GUI;
import javafx.animation.RotateTransition;    
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
import java.net.URL;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.Function.*;
import com.Data.*;
import com.Images.*;
import com.Music.*;

/**
 * Class enables user to display all board information
 * into a interactive game 
 * via extension of the parent class Application.
 */
public class Gameplay_GUI extends Application {
	static ArrayList<Button> buttons = new ArrayList<Button>(); 
	static ArrayList<String> ognames = new ArrayList<String>();
	static private int btnWidth = 100; 
	static private int btnHeight = 70; 
	static private int imgWidth = 80; 
	static private int imgHeight = 50; 
	static private int picSizeHeight =30;
	static private int picSizeWidth=30;
	static private int infoWidth = 300; 
	static private int infoHeight = 500; 
	static private String infoText = "";
	static ArrayList<Player> playersList = InitialList.playersList(); 
	static ArrayList<Property> propertiesList = InitialList.propertiesList(); 
	static ArrayList<Label> playerLabel = new ArrayList<Label>(); 
	static private int turn = 0; 

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
	static Text PlayerTurnPic = new Text();
	private int cycleCountEnd = 1000;

	URL url = this.getClass().getClassLoader().getResource("com/Music/bensound-energy.mp3");
	Media music = new Media(url.toExternalForm());
	MediaPlayer mPlayer = new MediaPlayer(music);
	
	URL urlEnd = this.getClass().getClassLoader().getResource("com/Music/bensound-hey.mp3");
	Media musicEnd = new Media(urlEnd.toExternalForm());
	MediaPlayer mPlayerEnd = new MediaPlayer(musicEnd);
	
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
	static Label Label1 = new Label();
	static Label Label2 = new Label();
	static Label Label3 = new Label();
	static Label Label4 = new Label();
	public boolean ii = false;
	
	/**
	 * Method sets the turn value for assigning to
	 * a player. Player values will be 0, 1, 2, 3.
	 * @param a the turn value 
	 */
	public static void setTurn(int a) {
		if(a >= 0 && a <= 3) {
			turn = a;
		}
	}
	
	/** 
	 * Method gets the turn value of the player.
	 * @return the turn value
	 */
	public static int getTurn() {
		return turn;
	}
	
	/**
	 * Method displays the current player's turn in the GUI,
	 * utilizing visual effects to set the colors of the player turn
	 * message in the top-right corner.
	 * @param turn the integer value belonging to the player
	 */
	public static void turnPic(int turn) {
		int a = turn % 4 + 1;	
		PlayerTurnPic.setText("PLAYER " + a + "'s TURN");
		PlayerTurnPic.setStyle("-fx-font: 20 cambria;");
		
		if (turn == 1) {
			PlayerTurnPic.setFill(Color.RED);
		} else if (turn == 2) {
			PlayerTurnPic.setFill(Color.GREEN);
		} else if (turn == 3) {
			PlayerTurnPic.setFill(Color.YELLOW);
		} else {
			PlayerTurnPic.setFill(Color.BLUE);
		}
	}
	
	/**
	 * Sets up the window necessary for the program to
	 * run the game.
	 */
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
		Image bg1 = new Image("com/Images/bg1.jpg");
		Image Go = new Image("com/Images/Go.png");
		Image Canada = new Image("com/Images/Canada.png");
		Image Brazil = new Image("com/Images/Brazil.png");
		Image Russia = new Image("com/Images/Russia.png");
		Image Mexico = new Image("com/Images/Mexico.png");
		Image Chance = new Image("com/Images/Chance.png");
		Image Egypt = new Image("com/Images/Egypt .png");
		Image Turkey = new Image("com/Images/Turkey.png");
		Image Germany = new Image("com/Images/Germany.png");
		Image UK = new Image("com/Images/Uk.png");
		Image Jail = new Image("com/Images/Jail.png");
		Image Italy = new Image("com/Images/Italy.png");
		Image SouthAfrica = new Image("com/Images/South Africa.png");
		Image SouthKorea = new Image("com/Images/SouthKorea.png");
		Image Columbia = new Image("com/Images/Columbia.png");
		Image Treasure = new Image("com/Images/Treasure.jpg");
		Image China = new Image("com/Images/China.png");
		Image India = new Image("com/Images/India.png");
		Image US = new Image("com/Images/US.png");
		Image Japan = new Image("com/Images/Japan.png");

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

		grid.setTitle("Monopoly Board"); 
		grid.setMaximized(true);
		Image player1 = new Image("com/GUI/Player1Token.jpg");
		Image player2 = new Image("com/GUI/Player2Token.png");
		Image player3 = new Image("com/GUI/Player3Token.png");
		Image player4 = new Image("com/GUI/Player4Token.jpg");
		ImageView plyr1 = new ImageView(player1);
		ImageView plyr2 = new ImageView(player2);
		ImageView plyr3 = new ImageView(player3);
		ImageView plyr4 = new ImageView(player4);
		plyr1.setFitHeight(picSizeHeight);
		plyr1.setFitWidth(picSizeWidth);
		plyr2.setFitHeight(picSizeHeight);
		plyr2.setFitWidth(picSizeWidth);
		plyr3.setFitHeight(picSizeHeight);
		plyr3.setFitWidth(picSizeWidth);
		plyr4.setFitHeight(picSizeHeight);
		plyr4.setFitWidth(picSizeWidth);
		Label1.setGraphic(plyr1);
		Label2.setGraphic(plyr2);
		Label3.setGraphic(plyr3);
		Label4.setGraphic(plyr4);

		playerLabel.add(Label1);
		playerLabel.add(Label2);
		playerLabel.add(Label3);
		playerLabel.add(Label4);

		BorderPane borderPane = new BorderPane();
		GridPane gridPane = new GridPane();
		borderPane.setCenter(gridPane);
		gridPane.setAlignment(Pos.CENTER);
	
		gridPane.setHgap(10);
		gridPane.setVgap(10);
	
		AnchorPane anchorPane = new AnchorPane();
		Label info = new Label("Information");
		borderPane.setRight(info);
		Label infoTextField = new Label();
		infoTextField.setAlignment(Pos.BOTTOM_LEFT);
		infoTextField.setWrapText(true);
		infoTextField.setStyle("-fx-background-color: white;");
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
		 
	//END SCREEN
		GridPane endScreen = new GridPane();
		endScreen.setAlignment(Pos.CENTER);
		endScreen.setVgap(20);
		
		//BACKGROUND
		String styleEnd = "-fx-background-color: rgba(100, 125, 255, 0.5);";
		endScreen.setStyle(styleEnd);
		
		//labels
		Text winText = new Text(com.Function.Services.findWinner(playersList, propertiesList) + " won, congratulations!");
		winText.setCache(true);
		winText.setFill(Color.LIGHTCORAL);
		winText.setFont(Font.font(null, FontWeight.BOLD, 50));
		
		Reflection reflect = new Reflection();
		reflect.setFraction(0.7f);
		winText.setEffect(reflect);
		endScreen.add(winText, 0, 0);

		//TITLE - Start Scene
		Label monopolyTitle = new Label("");
		Image monoTitleImage = new Image("com/Images/MonopolyTitle.png");
		ImageView titleView = new ImageView(monoTitleImage);
		monopolyTitle.setGraphic(titleView);
		screen.add(monopolyTitle, 0, 0);
		
		//BACKGROUNDS 	
		String styleStart = "-fx-background-color: rgba(100, 255, 255, 0.5);";
		screen.setStyle(styleStart);
		
		String styleCredit = "-fx-background-color: rgba(100, 55, 255, 0.5);";
		creditScreen.setStyle(styleCredit);
		
		String styleDescript = "-fx-background-color: rgba(100, 125, 255, 0.5);";
		descriptScreen.setStyle(styleDescript);
		
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
		rotateTitle.setNode(monopolyTitle);
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
		String descriptTitleString = "Instructions: ";
		String descriptString = "Play against 3 CPUs! You go first! Passing GO gets you $200. Here’s a few functions players can use...\n"
				+ "1. Roll: roll a 6-sided die and move according to the number rolled. Roll used once per turn. \n2. Buy: Buys unowned property the player is on (except GO, Jail, Chance, and Treasure) for the assigned cost.\n Buy used once per turn.\n"
				+ "3. Build: Pay $200 to build a house on property you own. Rent of the property increases by $150.\nBuild used once per turn\nRandom: Uses a random card that the player collects from landing on either Chance or Treasure space.\nRandom used once per turn.\n" +
				"5. End Turn: Player ends their turn." + "\nPlayer pays rent when landing on a property owned by another player.\n" + 
				"Player 1 is BLUE\nPlayer 2 is RED\nPlayer 3 is GREEN\nPlayer 4 is YELLOW\n Win by being the player with\n" +
				"the most money. The game ends as soon as some player\nloses all their money, at which point the other 3 players sell all their properties\nand the player with the highest net worth ends up being the winner.";
		
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
		
		/**
		 * Method changes the scene to the Credit scene when
		 * the Credit Button is pressed.
		 * @param EventHandler<ActionEvent>() the class that handles the event and 
		 * produces an action that changes the scene
		 */
		creditButton.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		    	grid.setScene(creditScene);
		    }
		});
		
		/**
		 * Method changes the scene to description scene when the 
		 * Description button is pressed. 
		 * @param EventHandler<ActionEvent>() the class that handles the event and 
		 * produces an action that changes the scene
		 */
		descriptButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				grid.setScene(descriptScene);
			}
				
	    });
		
		/**
		 * Method sets scene back to the Start screen from
		 * the Credit Scene.
		 * @param EventHandler<ActionEvent>() the class that handles the event and 
		 * produces an action that changes the scene
		 */
		backButtonCredit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				grid.setScene(startScene);
			}
				
	    });
		
		/**
		 * Method sets scene back to the Start screen from
		 * the Description Scene.
		 * @param EventHandler<ActionEvent>() the class that handles the event and 
		 * produces an action that changes the scene
		 */
		backButtonDescript.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				grid.setScene(startScene);
			}
				
	    });

		buy.setPrefSize(btnWidth, btnHeight);
		endturn.setPrefSize(btnWidth, btnHeight);
		build.setPrefSize(btnWidth, btnHeight);
		random.setPrefSize(btnWidth, btnHeight);
		roll.setPrefSize(btnWidth, btnHeight);
		
		//ALL SCENES
		Scene mainScene = new Scene(borderPane,150,150);
		Scene endScene = new Scene(endScreen, 150, 150);
		BackgroundSize sizeforbg = new BackgroundSize(100,100,true,true,true,true);
		BackgroundImage bimg = new BackgroundImage(bg1, null, null, null, sizeforbg);
		gridPane.setBackground(new Background(bimg)); 

	
	/**
	 * Method lets a player click roll to change his location and provide text in infoTextField about what square the player has landed on.
	 * The player can click roll once, after which it is disabled.
	 * @param EventHandler<ActionEvent>() triggered with a mouseclick.
	 */
	roll.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent e) {
	    	roll.setDisable(true);
	    	
		    	int presentLocation = playersList.get(turn).getLocation();
		    	int newroll = Services.locationUpdate(playersList.get(turn));
		    	String newtext1 = Services.checkGo(presentLocation, playersList.get(turn));
		    	infoText=infoText+ " Congrats, rolled a " + newroll+"\n"  + newtext1;
		    	
		    	infoTextField.setText(infoText);
		    	playersList.get(turn).setLocation(playersList.get(turn).getLocation());
		    	infoText=infoText+ playersList.get(turn).getPlayerName()+ " is on "+propertiesList.get(playersList.get(turn).getLocation()).getPropertyName()+"\n" +
		    			"Cost/Rent: "+propertiesList.get(playersList.get(turn).getLocation()).getRent()+"\n";
		    	
		    	infoTextField.setText(infoText);
		    	if (playersList.get(turn).getLocation() == 10) {
					Services.payJail(playersList.get(turn));
					infoText = infoText+ playersList.get(turn).getPlayerName() + ", sorry, you're in Jail! Lose $50, you filthy thief!\n";
					infoTextField.setText(infoText);
				}else if (propertiesList.get(playersList.get(turn).getLocation()).getOwner() != playersList.get(turn).getPlayerNumber() && propertiesList.get(playersList.get(turn).getLocation()).getOwner() != 5) {
					Services.rent(playersList.get(turn), propertiesList, playersList);
					infoText = infoText +playersList.get(turn).getPlayerName()+" pays "+propertiesList.get(playersList.get(turn).getLocation()).getRent()+" to "+Services.searchPlayer(playersList.get(turn).getLocation(), propertiesList, playersList).getPlayerName()+"\n";
					infoTextField.setText(infoText);
				}
		    	gridPane.getChildren().remove(playerLabel.get(turn));
		    	gridPane.add(playerLabel.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
		    	endturn.setDisable(false);
		    }
		});

		/**
		 * Method allows a player to click buy to change the Property's owner to the player number.
		 * If a property is not eligible to buy (because it is GO, Jail or Random) or it is owned by another player,
		 * the button informs the player that buying the property is not possible.
		 * @param EventHandler<ActionEvent> disables the button after being clicked.
		 */
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
		    			infoText = infoText + playersList.get(turn).getPlayerName()+ " bought "+ propertiesList.get(playersList.get(turn).getLocation()).getPropertyName() +"\n";
		    			infoTextField.setText(infoText);
			        	Services.buyLand(playersList.get(turn), propertiesList);
			        	GUI_Board.setColor(propertiesList, buttons);
		    	}else {
		    		infoText = infoText + "You cannot buy this property.\n";
					infoTextField.setText(infoText);
				}
		    }
		});

		/**
		 * Method allows a player to proceed to another player's turn 
		 * After the player clicks end turn for the last Computer Player, the button is disabled until the player rolls
		 * The button enables buy, build, and random in order to allow the human player to proceed with his turn, and for the AI to have a turn
		 * @param EventHandler<ActionEvent>()  triggered with a mouseclick.
		 */
		endturn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	turnPic(turn + 1);
		    	GUI_Board.setColor(propertiesList, buttons);
		    	if(turn + 1 %4 == 0) {
		    		endturn.setDisable(true);
		    	}
		    	LocationInput.setDisable(true);
				Ok.setDisable(true);
		    	roll.setDisable(false);
		    	buy.setDisable(false);
		    	build.setDisable(false);
		    	random.setDisable(false);
		    	infoText="";
		    	int a = turn + 1;
		    	int newturn = a%4;
		    	turn = newturn;
				infoText = infoText + playersList.get(turn).getPlayerName()+ "\n"+ 
		    	"Money: "+playersList.get(turn).getMoney() +"\n";
		    	infoTextField.setText(infoText);
	        	GUI_Board.setColor(propertiesList, buttons);
	        	
		    	if (Services.winingCondiction(playersList) == false) {
			    	mPlayer.pause();
		    		mPlayerEnd.setAutoPlay(true);
					mPlayerEnd.setCycleCount(cycleCountEnd);
		    		grid.setScene(endScene);
				}
		    	AIturn();	
		    }
		});
		
		/**
		 * Method allows a human player to click on random if his location is on 5 or 15 (the two random card locations), which allows him to 
		 * proceed with possible actions from the random card (gaining/losing money, going to jail, taking properties).
		 * @param EventHandler<ActionEvent>()  triggered with a mouseclick.
		 */
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
					    	gridPane.getChildren().remove(playerLabel.get(turn));
					    	gridPane.add(playerLabel.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
						}else {
							GUIcomputerUseRandom(propertiesList, playersList.get(turn), infoTextField);
							setColor();
					    	gridPane.getChildren().remove(playerLabel.get(turn));
							gridPane.add(playerLabel.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
						}
	    }else {
	    	infoText = infoText + playersList.get(turn).getPlayerName()+" doesn't have chance to use random card."+"\n";
			random.setDisable(true);
			infoTextField.setText(infoText);
	    }
			}});
		
	   /**
		 * Method allows a player to buy a property.
		 * If the player's location is not on an eligible property to buy (GO, Random, Jail, other's owned property), the button will 
		 * not allow the player to buy the property.
		 * @param EventHandler<ActionEvent>() triggered with a mouseclick.
		 */
		build.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	
		    	build.setDisable(true);
				if (propertiesList.get(playersList.get(turn).getLocation()).getOwner() == playersList.get(turn).getPlayerNumber()) {
					infoText = infoText + playersList.get(turn).getPlayerName()+" builds a house on "+propertiesList.get(playersList.get(turn).getLocation()).getPropertyName()+"\n";
					infoTextField.setText(infoText);
			        Services.buildHouse(playersList.get(turn), propertiesList);
			        buy.setDisable(true);
				}else {
					infoText = infoText + "This property doesn't belong to you!\n";
					infoTextField.setText(infoText);
				}
		    }
		});
		
		/**
		 * Method starts the game, switches from beginning screen to main game scene
		 * @param EventHandler<ActionEvent>()  triggered with a mouseclick.
		 */
		startButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	GUI_Board.setColor(propertiesList, buttons);
		    	grid.setScene(mainScene);
				infoText = infoText + playersList.get(turn).getPlayerName()+ "\n"+ "Money: "+playersList.get(turn).getMoney() +"\n";
		    	infoTextField.setText(infoText);
		    	LocationInput.setDisable(true);
				Ok.setDisable(true);
		    }
		});
		
		/**
		 * Method allows the player to enter input for which property to take if he lands on Random and gets a steal property card
		 * @param EventHandler<ActionEvent>()  triggered with a mouseclick.
		 */
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
					gridPane.add(playerLabel.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
				}
				else if(Constant.CHOSENNUM==5) {

					UsingRandomCard.moveCardGUI(value ,playersList.get(turn));
					setColor();
					gridPane.add(playerLabel.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
				}
				else if(Constant.CHOSENNUM==6) {

					UsingRandomCard.useStealCard(propertiesList,playersList.get(turn),value);
					int money=playersList.get(turn).getMoney();
					playersList.get(turn).setMoney(money+200);
					gridPane.add(playerLabel.get(turn), change.changeX(playersList.get(turn).getLocation()), change.changeY(playersList.get(turn).getLocation()));
				}
			}

		});
		
		gridPane.add(Label1, change.changeX(playersList.get(0).getLocation()), change.changeY(playersList.get(0).getLocation()));
		gridPane.add(Label2, change.changeX(playersList.get(1).getLocation()), change.changeY(playersList.get(1).getLocation()));
		gridPane.add(Label3, change.changeX(playersList.get(2).getLocation()), change.changeY(playersList.get(2).getLocation()));
		gridPane.add(Label4, change.changeX(playersList.get(3).getLocation()), change.changeY(playersList.get(3).getLocation()));
		
		gridPane.setPadding(new Insets (25, 25, 25, 25));
		gridPane.add(PlayerTurnPic, 20, 0);
		gridPane.add(buy, 3, 4);
		gridPane.add(endturn, 3, 3);
		gridPane.add(build, 4, 4);
		gridPane.add(random, 4, 3);
		gridPane.add(roll, 3, 2);
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
		gridPane.add(Ok, 4, 5);
		gridPane.add(LocationInput, 3, 5);
		grid.setHeight(1000);
		grid.setWidth(1200);
		grid.setScene(startScene);
		grid.setTitle("Monopoly");
		grid.show();
	}

	/**
	 * The method prints the effects of the Random card to the
	 * GUI text box for player viewing. Does so by calling the UsingRandomCard class 
	 * methods to ensure that the right card information is printed.
	 * @param infoTextField the TextField box where all information is printed to. 
	 */
	public static void printStuff(Label infoTextField) {
		Constant.CHOSENNUM = UsingRandomCard.reciveCard();
		if (Constant.CHOSENNUM==1) {
			infoText+="Got a Jail card! You were sent to jail!";
			infoTextField.setText(infoText);
			System.out.println("Got a jail card! You were sent to jail!");
		} else if(Constant.CHOSENNUM==2) {
			infoText+=" Got a Steal Property card.";
			infoTextField.setText(infoText);
			System.out.println("Got a Steal Property card.");
		} else if(Constant.CHOSENNUM==3) {
			infoText+="No cards, but received $200!";
			infoTextField.setText(infoText);
			System.out.println("No cards, but received $200!");
		} else if(Constant.CHOSENNUM==4) {
			infoText+="No cards gotten, and lost $200!";
			infoTextField.setText(infoText);
			System.out.println("No cards gotten, and lost $200!");
		} else if(Constant.CHOSENNUM==5){
			infoText+="Got a Move card!";
			infoTextField.setText(infoText);
			System.out.println("Got a Move card!");
		} else {
			infoText+="Got $200 and a Steal Property card!";
			System.out.println("Got $200 and a Steal Property card!");
			infoTextField.setText(infoText);
			}	
	}
	
	/**
	 * Method iterates through the property list to check
	 * who owns the specific property. It then changes the colour of the button
	 * representing the property to reflect the ownership.
	 */
	public static void setColor() {
		for(Property a : propertiesList) {
			if(a.getOwner() == 0) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: SkyBlue");
			}
			if(a.getOwner() == 1) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: HotPink");
			}
			if(a.getOwner() == 2) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: YellowGreen");
			}
			if(a.getOwner() == 3) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: LightYellow");
			}
			if(a.getOwner() == 5) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: Tan");
			}
		}
	}
	
	/**
	 * Method will display the information related to when the computer player uses
	 * a random card. It will assess the luckNumber using the UsingRandomCard.receive()
	 * function and check if it is a certain number. If it is a certain number, it will
	 * call the methods in the UsingRandomCard class to affect the player.
	 * @param propertiesList the list of properties
	 * @param player the player
	 * @param infoTextField the text field
	 */
	public static void GUIcomputerUseRandom(ArrayList<Property> propertiesList, Player player,Label infoTextField) {
		int luckNumber=UsingRandomCard.reciveCard();
		if (luckNumber==1) {
			infoText+=player.getPlayerName()+", go to the jail";
			UsingRandomCard.jailCard(player);
		} else if(luckNumber==2) {
			infoText+="Get a Steal Property card";
			int propertyNumber=computerUseRandomCard.computerUseStealCard(propertiesList,player);
			Property chosenProperty=propertiesList.get(propertyNumber);
			infoText+=""+player.getPlayerName()+" gets the property "+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertiesList,player,propertyNumber);
		} else if(luckNumber==3) {
			infoText+=player.getPlayerName()+"No cards, but received $200!";
			UsingRandomCard.addMoney(player);
		} else if(luckNumber==4) {
			infoText+=player.getPlayerName()+"No cards, and lost $200!";
			UsingRandomCard.lostMoney(player);
		} else if(luckNumber==5){
			infoText+=player.getPlayerNumber()+"Received a Move card!";
			computerUseRandomCard.computerUseMoveCard(propertiesList,player);
		} else {
			infoText+=""+player.getPlayerName()+"Receive $200 and a Rob card!";
			int propertyNumber=computerUseRandomCard.computerUseStealCard(propertiesList,player);
			Property chosenProperty=propertiesList.get(propertyNumber);
			infoText+=""+player.getPlayerName()+" gets the property "+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertiesList,player,propertyNumber);
			UsingRandomCard.addMoney(player);
		}
		infoTextField.setText(infoText);
	}

	/**
	 * Method allows the computer player to simulate the 
	 * human player in their actions; handles their behaviour.
	 * It enables them to Roll, use Random when appropriate, and to Buy
	 * and Build. It searches the player list and gets the computer's location
	 * to decide these things.
	 */
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
			}else if (playersList.get(turn).getMoney()>=300&&
					propertiesList.get(playersList.get(turn).getLocation()).getOwner()==5&&
					propertiesList.get(playersList.get(turn).getLocation()).getPosition()!=0&&
					propertiesList.get(playersList.get(turn).getLocation()).getPosition()!=5&&
					propertiesList.get(playersList.get(turn).getLocation()).getPosition()!=10&&
					propertiesList.get(playersList.get(turn).getLocation()).getPosition()!=15) {
				buy.fire();
			}
			random.setDisable(true);
			buy.setDisable(true);
			build.setDisable(true);
			
		}
	
	}

	/**
	 * Main method that runs the GUI application
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

