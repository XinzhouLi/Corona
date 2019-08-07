import java.util.ArrayList;

public class InitialList {
	public static ArrayList<Player> playersList() {
		System.out.println("Initializing...please enter your name.");
		Player p0 = new Player(0);
	    Player c1 = new Player(1);
	    Player p1=createCP.createComputerPlayer(c1,2);
	    Player c2 = new Player(2);
	    Player p2=createCP.createComputerPlayer(c2,1);
	    Player c3 = new Player(3);
	    Player p3=createCP.createComputerPlayer(c3,2);

	    ArrayList<Player> playerList =new ArrayList<Player>();
	    playerList.add(p0);
	    playerList.add(p1);
	    playerList.add(p2);
	    playerList.add(p3);
		return playerList;	
	}
	
	
	//Use for test
	public static ArrayList<Player> playersList(String test) {

		Player p0 = new Player(1);
		Player p1 = new Player(2);
		Player c2 = new Player(3);
		Player c3 = new Player(4);

		ArrayList<Player> playerList =new ArrayList<Player>();
		playerList.add(p0);
		playerList.add(p1);
		playerList.add(c2);
		playerList.add(c3);
		return playerList;	
	}
	
	
	public static ArrayList<Property> propertiesList() {
		Property b0 = new Property(0,"Start", 0, 0);
		Property b1 = new Property(1,"Canada", 150, 150);
		Property b2 = new Property(2,"Brazil", 150, 150);
		Property b3 = new Property(3,"Russia", 150, 150);
		Property b4 = new Property(4, "Mexico", 150, 150);
		Property b5 = new Property(5,"Random", 0, 0);
		Property b6 = new Property(6,"Egypt", 200 , 200);
		Property b7 = new Property(7,"Turkey", 200, 200);
		Property b8 = new Property(8,"Germany", 200, 200);
		Property b9 = new Property(9,"United Kingdom", 200, 200);
		Property b10 = new Property(10,"Jail", 0, 0);
		Property b11 = new Property(11,"Italy", 250, 250);
		Property b12 = new Property(12,"South Africa", 250, 250);
		Property b13 = new Property(13,"South Korea", 250, 250);
		Property b14 = new Property(14,"Colombia", 250, 250);
		Property b15 = new Property(15,"Radom", 0, 0);
		Property b16 = new Property(16,"China", 300, 300);
		Property b17 = new Property(17,"India", 300, 300);
		Property b18 = new Property(18,"United States", 300, 300);
		Property b19 = new Property(19,"Japan", 300, 300);
		ArrayList<Property> propertiesList = new ArrayList<Property>();
		propertiesList.add(b0);
		propertiesList.add(b1);
		propertiesList.add(b2);
		propertiesList.add(b3);
		propertiesList.add(b4);
		propertiesList.add(b5);
		propertiesList.add(b6);
		propertiesList.add(b7);
		propertiesList.add(b8);
		propertiesList.add(b9);
		propertiesList.add(b10);
		propertiesList.add(b11);
		propertiesList.add(b12);
		propertiesList.add(b13);
		propertiesList.add(b14);
		propertiesList.add(b15);
		propertiesList.add(b16);
		propertiesList.add(b17);
		propertiesList.add(b18);
		propertiesList.add(b19);
		return propertiesList;
	}

}
