package mapstuffformonopoly;
import java.util.Random;
import java.util.ArrayList;
public class monopolyMap {
    private int locationValue;
    private int propertyCardValue;
    private ArrayList<Property> Propertylist = new ArrayList<Property>();

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
    public void pickRandomCard1(Player a) {
    	System.out.println("you picked random card 1: Schalorship\n you win $50");
    	a.setMoney(a.getMoney() + 50);
    }
    public void pickRandomCard2(Player a) {
    	System.out.println("you picked random card 2: Fees\n you lose $50");
    	loseMoney(a,50);
    	}
    /**
     * Methods pick a random card that will bestow a random effect on the player.
     * @param a Of type Player that holds info on player's card effect.
     */
    public void randomCard(Player a) {
        Random randCardVal = new Random();
   	    int cardValue = randCardVal.nextInt(2);
   	    if (cardValue == 0) {
            pickRandomCard1(a);
        }
   	    if(cardValue == 1) {
            pickRandomCard2(a);
        }
    }

    /**
     * Method will hold information on the different properties one can purchase and sell. 
     * @param a Of type Player that holds info on properties under their name.  
     * 
     */
    public void propertyCardEffects(Player a) {
        if (propertyCardValue == 0) {
            a.addProperty("House");
        } else if (propertyCardValue == 1) {
            a.addProperty("Hotel");
        } else {
            a.addProperty("Hospital");
        }

    }

	public void propertyCardBuy(Player a, Property b) {
		b.setWho(a.PlayerName);
		a.setMoney(a.getMoney() - b.getCost());
		a.addProperty(b.PropertyName);
		
	}
	public void propertyCardSell(Property a, Player b) {
		b.getProperties().remove(a);
		a.setWho("");
		b.setMoney(b.getMoney() + a.getCost());
	}
	public void Transfer(Player a, Player c, int k) {
		a.setMoney(a.getMoney() + k);
		c.setMoney(c.getMoney() - k);
	}


    /**
     * Method will check if player has money to continue playing.
     * If not, give option to sell. 
     * If no properties, sell. 
     * @param a
     * @param amountLost
     * @return playerMoney, which indicates current amount of player money.
     */
    public int loseMoney(Player a, int amountLost) {
        int playerMoney = a.getMoney();
        if (playerMoney >= 0) {
            playerMoney -= amountLost;
        }
        return playerMoney;
    }
  

    /**
     * Method will determine that a player is sitting atop a Jail space 
     * and either fine or bankrupt player. 
     * @param a Of type Player and holds info on player's current money.
     */
    public void Jail (Player a) {
        int locationValue = 0;
        int finePayment = 50;

        if (a.getMoney() >= finePayment) {
            a.loseMoney(finePayment);
        } else {
            a.winCondition();
        }
    }

  
    



  


