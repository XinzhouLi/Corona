import java.util.Random;
public class monopolyMap {
    public int typeoflocation(Player a) {
   	 int p=0;
   	 if(a.getLocation() % 12 == 6) {
   		 p = 1;
   	 }
   	 if(a.getLocation() % 12 == 4 || a.location % 12 == 8) {
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
   	 a.propertylist.add(getProp(a.getLocation()));
   	 
    }
    public int propertyCardsell(Property a, Player b) {
   	 b.propertylist.delete(a);
   	 a.getUsedness() = false;
   	 a.getWho() = "Bank";
   	 b.setMoney(b.getMoney() + a.getCost());
    }
    public void Transfer(Player a, Player c. int k) {
   	 a.setMoney(a.getMoney() + k)
   	 c.setMoney(c.getMoney() - k)
    }

    
    public void Jail (Player a) {
   	 int locationVal = 4; //
   	 if () {
   		 a.loseMoney();
   	 }

}
}
