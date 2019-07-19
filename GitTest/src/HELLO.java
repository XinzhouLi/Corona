package mapstuffformonopoly;
import java.util.Random;
public class monopolymap {
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
	
	public int propertyCardbuy(Player a) {
		getProp(a.getLocation()).getUsedness() = true;
		getProp(a.getLocation()).getWho() = a;
		a.setMoney(a.getMoney() - getProp(a.getLocation()).getCost());
		a.addProperty(getProp(a.getLocation()));
		
	}
	public void propertyCardsell(Property a, Player b) {
		b.getProperties().remove(a);
		a.setUsedness(false);
		a.setWho("Bank");
		b.setMoney(b.getMoney() + a.getCost());
	}
	public void Transfer(Player a, Player c, int k) {
		a.setMoney(a.getMoney() + k);
		c.setMoney(c.getMoney() - k);
	}

	

}