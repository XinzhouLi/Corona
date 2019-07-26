import java.awt.FlowLayout; //imports layout of windows
import javax.swing.JFrame; //JFrame gives window features like minimize, maximize, etc. 
import javax.swing.JLabel; //JLabel gives text and outputs on screen
//Works with GUI_Apple
public class GUI_Tuna extends JFrame { //tuna must inherit everything from JFrame
	//instance variables
	private JLabel item1;
	
	public GUI_Tuna() {
		super("The title bar"); //adds title from JFrame
		setLayout(new FlowLayout()); //method is imported from JFrame
		
		item1 = new JLabel("This is a sentence."); //make item1 a text JLabel TEXT ON THE SCREEN
		
		//adding functionality to item1 
		item1.setToolTipText("This will show up when hovering mouse over."); 
		
		//add the item to the window
		add(item1);
		
	}
}