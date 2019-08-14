package com.GUI;
import java.util.ArrayList; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.Data.*;

/**
 * Represents the visual information seen within Gameplay_GUI. Called within
 * Gameplay_GUI to give color to owned properties.
 */
public class GUI_Board {
	/**
	 * Method sets the background color of the property space
	 * to the appropriate color depending on who is owning
	 * the space. Checks if the property in the list of properties has been owned
	 * and colors the appropriate button.
	 * @param propertiesList the list of properties
	 * @param buttons the list of buttons representing property spaces
	 */
	public static void setColor(ArrayList<Property> propertiesList, ArrayList<Button> buttons) {
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

}

