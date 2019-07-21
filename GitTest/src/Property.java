import java.util.ArrayList;

public class Property {
    private int Cost = Constant.PROPERTY_PRICE;
    private int Building = 0;
    private int Ownner = 5;
    private int rent = Constant.BUILDING_PRICE;
    private int Position;

    public Property(int position) {
		super();
		Position = position;
	}


	public int getPosition() {
		return Position;
	}


	public void setPosition(int position) {
		Position = position;
	}


	public void setCost(int Cost) {
    	this.Cost = Cost;
    }


    public void setRent(int rent) {
    	this.rent = rent;
    }


    public int getCost() {
    	return Cost;
    }


    public int getRent() {
    	return rent;
    }

	public int getBuilding() {
		return Building;
	}

	public void setBuilding(int building) {
		Building = building;
	}

	public int getOwnner() {
		return Ownner;
	}

	public void setOwnner(int Ownner) {
		this.Ownner = Ownner;
	}


    
}
