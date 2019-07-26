//event handler is the code that responds to event
import java.awt.FlowLayout;
import java.awt.event.ActionListener; //waits for user to input something
import java.awt.event.ActionEvent; 
import javax.swing.JFrame; //gives window features
import javax.swing.JTextField; //you can type text on window
import javax.swing.JPasswordField; //same thing but covers text up in asterisks
import javax.swing.JOptionPane;


public class GUI_EventHandle extends JFrame{ //extending lets us use the window
	
	private JTextField item1; //our first text item
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField; //our password item
	
	/**
	 * Sets up the window.
	 */
	public GUI_EventHandle() { //this is going to be the window
		super("The Title"); //adds title
		setLayout(new FlowLayout()); //gives layout to window
		
		item1 = new JTextField(10); //new text field that is length 10
		add(item1); //adds item to window
		
		item2 = new JTextField("Enter text here: "); //acts as prompt
		add(item2);
		
		item3 = new JTextField("Uneditable", 20);
		item3.setEditable(false); //this makes it so that the text field CAN'T be edited.
		
		passwordField = new JPasswordField("Mypass"); //shows up as asterisks on screen
		add(passwordField);
		
		theHandler handler = new theHandler(); //BUILDS ACTION LISTENER OBJECT
		item1.addActionListener(handler); //gives functionality, like press Enter, it does something now
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	
	//create inner class that will inherit all outer class stuff
	private class theHandler implements ActionListener { //this class handles listener; called automatic when something happens
		
		public void actionPerformed(ActionEvent event) { //this handles events, method executes automatically whenever event occurs (press enter)
			String string = ""; //this string outputs final
			
			//if touch text box 1, then change string in field 1 to whatever you typed in
			//%s changes string variable
			
			if(event.getSource() == item1) {//if stuff happens at the source, if click happens at item1 field 
				string = String.format("Field 1: %s", event.getActionCommand()); 
			} else if (event.getSource() == item2) {
				string = String.format("Field 2: %s", event.getActionCommand());
			} else if (event.getSource() == item3) {
				string = String.format("Field 3: %s", event.getActionCommand());
			} else if (event.getSource() == passwordField) {
				string = String.format("Password field is: %s",event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string); //makes BLANK window (position, message)
			
		}
		
	}
	
	
	
}