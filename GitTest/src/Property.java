import java.util.ArrayList;

public class Property {
    private int Cost = Constant.PROPERTY_PRICE; //cost of a property(the amount they have to pay to buy that property)
    private int Building = 0; // number of buildings a property has
    private int Owner = 5; // tests the number of the owner of the property, starts at 5 as it is none of the four players 
    private int rent = Constant.BUILDING_PRICE; // rent they have to pay when landing on property
    private int Position; // position of property

    /**
     * says everything about a property including position
     */
    public Property(int position) { // says everything about a property including position
		super();
		Position = position;
	}

    /**
     * gives the postion of the property on the map 
     */
	public int getPosition() { 
		return Position;
	}

    /**
     * gives the postion of the property on the map
     */
	public void setPosition(int position) { 
		Position = position;
	}

    /**
     *  sets how much a property costs to buy
     */
	public
	public void setCost(int Cost) {
    	this.Cost = Cost;
    }

    /**
     *  sets rent of a property
     */
    public void setRent(int rent) { 
    	this.rent = rent;
    }

    /**
     *  gives the amount a property costs
     */
    public int getCost() { 
    	return Cost;
    }

    /**
     * gives the rent of a property
     */
    public int getRent() {
    	return rent;
    }
    /**
     * gets the number of buildings a property has
     */
    public
	public int getBuilding() { 
		return Building;
	}
    /**
     * sets the number of building on a property
     */
	public void setBuilding(int building) { 
		Building = building;
	}
    /**
     * gets owner of a property
     */
	public int getOwner() { 
		return Owner;
	}
    /**
     * sets owner of a property 
     */
	public void setOwner(int Owner) { 
		this.Owner = Owner;
	}


    
}
