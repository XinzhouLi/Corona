import java.util.Random;
public class monopolyMap {
    
    /**
     * Method will acquire player's location value and decide if they are 
     * standing on a random, jail, start, or normal board space.  
     * @param a Of type Player that holds info on player's current location.
     */
    public int typeOfLocation(Player a) {
   	 int locationValue = 0;
   	 if(a.getLocation() % 12 == 6) {
   		 locationValue = 1;
   	 }
   	 if(a.getLocation() % 12 == 4 || a.getLocation() % 12 == 8) {
   		 locationValue = 2;
   	 }
   	 if(a.getLocation()  % 12 == 0) {
   		 locationValue = 3;
   	 }
   	 return locationValue;
    }

    public void randomCard(Player a) {
   	 Random randCardVal = new Random();
   	 int cardValue = randCardVal.nextInt(2);
   	 if (cardValue == 0){
   		 pickRandomCard1(a);
    }
   	 if(cardValue == 1) {
   		 pickRandomCard2(a);
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
         

}
}
