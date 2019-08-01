import javafx.application.Application;
//import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 
	 
public class Image_board extends Application{
	@Override
	public void start(Stage stage) {
		Image go_image = new Image("go.png");
		ImageView iv1 = new ImageView();
        iv1.setImage(go_image);
        
        Group root = new Group();
        Scene scene = new Scene(root);
        scene.setFill(Color.WHITE);
        HBox box = new HBox();
        box.getChildren().add(iv1);
        root.getChildren().add(box);

        stage.setTitle("ImageView");
        stage.setWidth(415);
        stage.setHeight(200);
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
	}
	public static void main(String[] args) {
        Application.launch(args);
    }
	 
}
