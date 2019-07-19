import java.util.ArrayList;

public class Property {
    int Cost;
    boolean Used = false;
    String Who = "Bank";
    int rent;
    

    public Property(int Cost, boolean Used, String Who, int rent) {
   	 setCost(Cost);
   	 setUsed(Used);
   	 setWho(Who);
   	 setRent(rent);
    }

     public Property(Property property){
   	  this.Cost = property.Cost;
   	  this.Used = property.Used;
   	  this.Who = property.Who;
   	  this.rent = property.rent;
    }

    public void setCost(int Cost) {
   	 this.Cost = Cost;
    }
    public void setUsed(boolean Used) {
   	 this.Used = Used;
    }

    public void setRent(int rent) {
   	 this.rent = rent;
    }

    public void setWho(String Who) {
   	 this.Who = Who;
    }

    public int getCost() {
   	 return Cost;
    }
    public boolean getUsed() {
   	 return Used;
    }
    public String getWho(String Who) {
   	 return Who;
    }

    public int getRent() {
   	 return rent;
    }

    
}
