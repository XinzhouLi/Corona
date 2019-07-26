import javax.swing.JOptionPane;

public class GUI_JPane {
	
	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter first number"); //opens first window
		String sn = JOptionPane.showInputDialog("Enter second number"); //open second window
		
		int num1 = Integer.parseInt(fn); //parseInt changes num stored in fn to type int
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " + sum); //method takes position, prompt, what appears on title bar, message pop up
		
	}

}