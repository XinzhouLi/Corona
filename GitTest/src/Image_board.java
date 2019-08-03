//package javafx11;

import java.io.File;
import java.util.List;

import javafx.application.Application;
//import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 
import javafx.scene.layout.Pane;
	 
public class Image_board extends Application{
	@Override
	public void start(Stage stage) {
		Image go_image = new Image(new File("go.png").toURI().toString());
		ImageView iv1 = new ImageView();
        iv1.setImage(go_image);
//        iv1.setFitWidth(100);
//        iv1.setPreserveRatio(true);
        iv1.setSmooth(true);
        iv1.setCache(true);
        
        Group root = new Group();
        Scene scene = new Scene(root);
        scene.setFill(Color.GREEN);
        HBox box = new HBox();
        box.getChildren().add(iv1);
        root.getChildren().add(box);

        stage.setTitle("ImageView");
        stage.setWidth(400);
        stage.setHeight(200);
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
	}
	public static void main(String[] args) {
        Application.launch(args);
    }
	 
}
