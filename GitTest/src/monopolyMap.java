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

    /**
     * Methods pick a random card that will bestow a random effect on the player.
     * @param a Of type Player that holds info on player's card effect.
     */
    public void randomCard(Player a) {
   	 Random randCardVal = new Random();
   	 int cardValue = randCardVal.nextInt(2);
   	 if (cardValue == 0){
   		 pickRandomCard1(a);
    }
   	 if(cardValue == 1) {
   		 pickRandomCard2(a);
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
        int locationValue = 0;
        if (a.getLocation() % 12 == 6) {
            locationValue = 1;
        }

        if (locationValue == 4) {
            
        }


