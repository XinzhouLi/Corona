import java.awt.FlowLayout; //FlowLayout imports layout of windows 
import javax.swing.JFrame; //JFrame gives window features like minimize, maximize, etc. 
import javax.swing.JLabel; //JLabel gives text and outputs on screen
import java.awt.Font;

//https://stackoverflow.com/questions/2715118/how-to-change-the-size-of-the-font-of-a-jlabel-to-take-the-maximum-size for font
public class GUI_Map extends JFrame {
	//instance variables
	private JLabel cardItem;
	
	//constructor
	public GUI_Map () {
		super("Card Title"); //adds window title from JFrame
		setLayout(new FlowLayout()); //method imports from JFrame
		
		cardItem = new JLabel("[Insert card description based on card picked]");
		cardItem.setFont(new Font("Serif", Font.PLAIN, 26));
		
		//adding functionality to item1 
		cardItem.setToolTipText("This will show up when hovering mouse over.");
		
		//add item to window
		add(cardItem);
		
	}	
}