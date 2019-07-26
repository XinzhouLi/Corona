import javax.swing.JFrame;


public class GUI_Apple {

	public static void main(String[] args) {
		
		GUI_Tuna bucky = new GUI_Tuna();
		//decides how to close program: when click exit, program terminates
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		//set size on window
		bucky.setSize(275, 180);
		bucky.setVisible(true); //so you can see it!
		
	}

}