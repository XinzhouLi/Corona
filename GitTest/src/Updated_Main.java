import java.util.ArrayList;

public class Updated_Main {

	public static void main(String[] args) {
		System.out.println("Initializing...");
		Player p0 = new Player(1500, 0, 0);
		Player p1 = new Player(1500, 0, 1);
		Player p2 = new Player(1500, 0, 2);
		Player p3 = new Player(1500, 0, 3);
		ArrayList<Player> playerList =new ArrayList<Player>();
		playerList.add(p0);
		playerList.add(p1);
		playerList.add(p2);
		playerList.add(p3);
		
		Property b0 = new Property(0, 0, 0, "Go");
		Property b1 = new Property(1, 100, 100, "P1");
		Property b2 = new Property(2, 125, 125, "P2");
		Property b3 = new Property(3, 150, 150, "P3");
		Property b4 = new Property(4, 175, 175, "P4");
		Property b5 = new Property(5, 200, 200, "P5");
		Property b6 = new Property(6, 225, 225, "P6");
		Property b7 = new Property(7, 250, 250, "P7");
		Property b8 = new Property(8, 275, 275, "P8");
		Property b9 = new Property(9, 300, 300, "P9");
		Property b10 = new Property(10, 325, 325, "P10");
		Property b11 = new Property(11, 350, 350, "P11");
		
		ArrayList<Property> propertiesList = new ArrayList<Property>();
		System.out.println("i");
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
		
		ArrayList<Integer> propertyPosList = new ArrayList<>();
		for (int i=0 ; i<11;i++) {
			propertyPosList.add(0);
		}
		Services.startTurn(p0,p1,p2,p3,playerList,propertiesList,propertyPosList);
		Services.findWinner(p0,p1,p2,p3);

		
		}
				
				
			
	
}