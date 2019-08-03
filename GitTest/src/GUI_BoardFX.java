import javafx.application.Application;  
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Grid extends Application {
	private int btnWidth = 80;
	private int btnHeight = 80;
	private int infoWidth = 250;
	private int infoHeight = 350;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Monopoly Board");
		
		//set up board layout
		GridPane board = new GridPane();
		board.setAlignment(Pos.CENTER);
		board.setHgap(10);
		board.setVgap(10);
		
		//add padding (top, right, bottom, left)
		board.setPadding(new Insets(25, 25, 25, 25));
		
		//Adding titles and info boxes of board
		Text boardTitle = new Text("Monopoly");
		boardTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//		board.add(boardTitle, 0, 5, 2, 2);
		
		Label info = new Label("Information");
		board.add(info, 5, 0);
		
		TextField infoTextField = new TextField();
		infoTextField.setPrefSize(infoWidth, infoHeight);
		board.add(infoTextField, 5, 1);
		
		//property buttons and text
		Button go = new Button("GO");
		Button prop1 = new Button("Property 1");
		Button prop2 = new Button("Property 2");
		Button prop3 = new Button("Property 3");
		Button prop4 = new Button("Property 4");
		Button rand1 = new Button("Random");
		
		//setting button size
		go.setPrefSize(btnWidth, btnHeight);
		prop1.setPrefSize(btnWidth, btnHeight);
		prop2.setPrefSize(btnWidth, btnHeight);
		prop3.setPrefSize(btnWidth, btnHeight);
		prop4.setPrefSize(btnWidth, btnHeight);
		rand1.setPrefSize(btnWidth, btnHeight);
		
		//right column
//		Button prop6 = new Button("Property 6");
//		Button prop7 = new Button("Property 7");
//		Button prop8 = new Button("Property 8");
//		Button prop9 = new Button("Property 9");
//		Button jail = new Button("Jail");
		
		HBox horizontalButton = new HBox(0);
		horizontalButton.setAlignment(Pos.CENTER);
		horizontalButton.getChildren().addAll(go, prop1, prop2, prop3, prop4, rand1);
		board.add(horizontalButton, 0, 0);
		
		//bottom row
		Button jail = new Button("Jail");
		Button prop11 = new Button("Property 11");
		Button prop12 = new Button("Property 12");
		Button prop13 = new Button("Property 13");
		Button prop14 = new Button("Property 14");
		Button rand2 = new Button("Random");
		
		jail.setPrefSize(btnWidth, btnHeight);
		prop11.setPrefSize(btnWidth, btnHeight);
		prop12.setPrefSize(btnWidth, btnHeight);
		prop13.setPrefSize(btnWidth, btnHeight);
		prop14.setPrefSize(btnWidth, btnHeight);
		rand2.setPrefSize(btnWidth, btnHeight);
		
		HBox horiButton2 = new HBox(0);
		horiButton2.setAlignment(Pos.CENTER);
		horiButton2.getChildren().addAll(jail, prop11, prop12, prop13, prop14, rand2);
		board.add(horiButton2, 0, 6);
		
//		VBox verticalButton = new VBox(0);
//		verticalButton.setAlignment(Pos.CENTER);
//		verticalButton.getChildren().addAll(prop6, prop7, prop8, prop9, jail);
//		board.add(verticalButton, 0, 0, 18, 18);

		
		//handling events 
		final Text printMessage = new Text();
		board.add(printMessage, 1, 6);
		go.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
//		    	printMessage.setFill(Color.FIREBRICK);
//		        printMessage.setText("Go button was pressed. Hurray!");
		        infoTextField.setText("Go button was pressed! Hurray!");
		        
		    }
		});
		
		//display board
		Scene boardScene = new Scene(board, 1000, 1000);
		primaryStage.setScene(boardScene);
		primaryStage.show();
		
	}

}
