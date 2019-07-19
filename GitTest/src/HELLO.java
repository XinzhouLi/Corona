package mapstuffformonopoly;
import java.util.Random;
import java.util.ArrayList;
public class monopolymap {
	 ArrayList<Property> Propertylist = new ArrayList<Property>();
	
	
	public int typeoflocation(Player a) {
		int p=0;
		if(a.getLocation() % 12 == 6) {
			p = 1;
		}
		if(a.getLocation() % 12 == 4 || a.getLocation() % 12 == 8) {
			p = 2;
		}
		if(a.getLocation()  % 12 == 0) {
			p = 3;
		}
		return p;
	}
	public void pickrandomcard1(Player a) {
		System.out.println("you picked random card number 1: Scholarship\n you win $50");
		a.setMoney(a.getMoney() + 50);
		
	}
	public void pickrandomcard2(Player a) {
		System.out.println("you picked random card number 2: fees\n you lose $50);");
		a.setMoney(a.getMoney() + 50);
		
	}
	public void randomCard(Player a) {
		Random l= new Random();
		int r=l.nextInt(2);
		if (r==0){
			pickrandomcard1(a);
	}
		if(r==1) {
			pickrandomcard2(a);
		}

}
	
	public void propertyCardbuy(Player a, Property b) {
		b.setUsedness(true);
		b.setWho(a.PlayerName);
		a.setMoney(a.getMoney() - b.getCost());
		a.addProperty(b.PropertyName);
		
	}
	public void propertyCardsell(Property a, Player b) {
		b.getProperties().remove(a);
		a.setUsedness(false);
		a.setWho("Bak");
		b.setMoney(b.getMoney() + a.getCost());
	}
	public void Transfer(Player a, Player c, int k) {
		a.setMoney(a.getMoney() + k);
		c.setMoney(c.getMoney() - k);
	}

	
}