import javax.swing.JFrame;

public class GUI_EventHandlerMain {
	
	public static void main (String[] args) {
		GUI_EventHandle bucky = new GUI_EventHandle();
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes on exit
		bucky.setSize(350, 100); //sets dimensions
		bucky.setVisible(true); //can see the good stuff
	}
		
}