import java.util.ArrayList;

public class Property {
    private int Cost = Constant.PROPERTY_PRICE; //cost of a property 
    private int Building = 0; // number of buildings a property has
    private int Owner = 5; // tests the number of the owner of the property, starts at 5 as it is none of the four players 
    private int rent = Constant.BUILDING_PRICE; // rent they have to pay when landing on property
    private int Position; // position of property
    private String Property_Name;

    /**
     * Method construcs a property's location on the board and its
     * name
     * @param position the position of the property 
     * @param propertyName the name of the property
     */
    public Property(int position, String propertyName) { 
		this.Position = position;
		this.Property_Name = propertyName;
	}

    /**
     * Gets the position of the property
     * @return the position 
     */
	public int getPosition() { 
		return Position;
	}

    /**
     * Sets the position of the property on the map
     * @param position the position of the property
     */
	public void setPosition(int position) { 
		Position = position;
	}

    /**
     * Sets the price of the property 
     * @param cost the cost amount 
     */
	public void setCost(int cost) {
    	this.Cost = cost;
    }

    /**
     * Sets the amount of rent for the property
     * @param rent the cost amount to rent
     */
    public void setRent(int rent) { 
    	this.rent = rent;
    }
    
    /**
     * Sets the name of the property
     * @param name the name of the property
     */
    public void setPropertyName(String name) {
    	Property_Name = name;
    }
    
    /**
     * Method gets cost.
     * @return the cost amount
     */
    public int getCost() { 
    	return Cost;
    }

    /**
     * Gets the rent amount of the property
     * @return the rent amount
     */
    public int getRent() {
    	return rent;
    }

    /**
     * Gets the number of buildings a property has 
     * @return the number of buildings
     */
	public int getBuilding() { 
		return Building;
	}
    /**
     * Sets the number of buildings a property has
     * @param building the number of buildings
     */
	public void setBuilding(int building) { 
		Building = building;
	}
    /**
     * Gets owner of the property
     * @return the owner 
     */
	public int getOwner() { 
		return Owner;
	}
    /**
     * Sets owner of the property
     * @param Owner the plyer who owns the property
     */
	public void setOwner(int owner) { 
		this.Owner = owner;
	}
    
    /**
     * Gets name of the property
     * @return the name of the property
     */
	public String getPropertyName() {
		return Property_Name;
	}

}
