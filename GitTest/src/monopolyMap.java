package mapstuffformonopoly;
import java.util.Random;
import java.util.ArrayList;
public class monopolymap {
	 ArrayList<Property> Propertylist = new ArrayList<Property>();
	

    /**
     * Method will acquire player's location value and decide if they are 
     * standing on a random, jail, start, or normal board space.  
     * @param a Of type Player that holds info on player's current location.
     */
    public int typeOfLocation(Player a) {
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
    

    /**
     * Method will hold information on the different properties one can purchase and sell. 
     * @param a Of type Player that holds info on 
     * @return
     */
    public void propertyCardEffects(Player a) {
        if (propertyCardValue == 0) {
            a.addProperty()
        } else if (propertyCardValue == 1) {

        } else {

        }

    }

	public void propertyCardbuy(Player a, Property b) {
		b.setWho(a.PlayerName);
		a.setMoney(a.getMoney() - b.getCost());
		a.addProperty(b.PropertyName);
		
	}
	public void propertyCardsell(Property a, Player b) {
		b.getProperties().remove(a);
		a.setWho("");
		b.setMoney(b.getMoney() + a.getCost());
	}
	public void Transfer(Player a, Player c, int k) {
		a.setMoney(a.getMoney() + k);
		c.setMoney(c.getMoney() - k);
	}

	


    
    public void Jail (Player a) {
        int locationValue = 0;
        int finePayment = 50;
        if (a.getLocation() % 12 == 6) {
            locationValue = 1;
        } 

        if (locationValue == 1 && a.getMoney() >= finePayment) {
            a.loseMoney(finePayment);
        } else {
            a.winCondition();
        }
    }

    


