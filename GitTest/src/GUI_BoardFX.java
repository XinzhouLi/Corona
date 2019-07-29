import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//https://gamedevelopment.tutsplus.com/tutorials/introduction-to-javafx-for-game-development--cms-23835 accessed July 28, 2019
public class GUI_BoardFX extends Application{
	
//	public static void main (String[] args) {
//		launch(args);
//	}
	
	//https://www.youtube.com/watch?v=B18NkOdulHM accessed July 28, 2019
	public void start(Stage theStage) {
		
		try {
			
		//stage > scene > container > node
		Label go = new Label("Go");
		Label prop1 = new Label ("Prop1");
		Label prop2 = new Label("Prop2");
		Label prop3 = new Label("Prop3");
		Label prop4 = new Label("Prop4");
		
		Label rand1 = new Label("Random");
		Label prop6 = new Label("Prop6");
		Label prop7 = new Label("Prop7");
		Label prop8 = new Label("Prop8");
		Label prop9 = new Label("Prop9");
		
		Label jail = new Label("Jail");
		
		Label prop11 = new Label("Prop11");
		Label prop12 = new Label("Prop12");
		Label prop13 = new Label("Prop13");
		Label prop14 = new Label("Prop14");
		
		Label rand2 = new Label("Random");

		Label prop16 = new Label("Prop16");
		Label prop17 = new Label("Prop17");
		Label prop18 = new Label("Prop18");
		Label prop19 = new Label("Prop19");


		
		go.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop1.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop2.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop3.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop4.setStyle("-fx-border-color: black; -fx-font-size: 30");
		rand1.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop6.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop7.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop8.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop9.setStyle("-fx-border-color: black; -fx-font-size: 30");
		jail.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop11.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop12.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop13.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop14.setStyle("-fx-border-color: black; -fx-font-size: 30");
		rand2.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop16.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop17.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop18.setStyle("-fx-border-color: black; -fx-font-size: 30");
		prop19.setStyle("-fx-border-color: black; -fx-font-size: 30");
		
		//top row
		grid.add(go,  0, 0, 1, 1);
		grid.add(prop1, 1, 0, 1, 1);
		grid.add(prop2, 2, 0, 1, 1);
		grid.add(prop3, 3, 0, 1, 1);
		grid.add(prop4,  4, 0, 1, 1);
		grid.add(rand1,  5, 0, 1, 1);

		//right column 
		grid.add(prop6,  5, 1, 1, 1);
		grid.add(prop7,  5, 2, 1, 1);
		grid.add(prop8,  5, 3, 1, 1);
		grid.add(prop9,  5, 4, 1, 1);
		grid.add(jail,  5, 5, 1, 1);
		
		//bottom row
		grid.add(prop11,  4, 5, 1, 1);
		grid.add(prop12,  3, 5, 1, 1);
		grid.add(prop13,  2, 5, 1, 1);
		grid.add(prop14,  1, 5, 1, 1);
		
		//left column
		grid.add(rand2,  0, 5, 1, 1);
		grid.add(prop16,  0, 4, 1, 1);
		grid.add(prop17,  0, 3, 1, 1);
		grid.add(prop18,  0, 2, 1, 1);
		grid.add(prop19,  0, 1, 1, 1);

		
//		grid.addRow(0, go, property1);
//		grid.setHgap(10);
		
		
		theStage.setScene(scene);
		theStage.show();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	GridPane grid = new GridPane();
	Scene scene = new Scene(grid, 700, 600);
	
	
	
}
