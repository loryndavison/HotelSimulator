
public class Bed {
	
	private String bedType; //This declares the private variable bedType as a string. 
	private int capacity; //This declares the private variable capacity as an integer. 
	
	public int getCapacity() { //This is the get method used to return the value of capacity.
		return capacity; 
	}

	public void setCapacity() { //This is the set method for the capacity. 
		if(bedType == "Single"){
			this.capacity = 1; //If the bed is single then the value of capacity is set to 1.
		}
		else if(bedType == "Double"){ 
			this.capacity = 2; //If the bed is double then the value of the capacity is set to 2.
		}
	}

	public String getType() { //This is the get method used to return the value of bedType.
		return bedType;
	}

	public void setType(String type) { 
		this.bedType = type; // This is the set method for the bedType.
	}
	
	public Bed(String t){ //This is the constructor for the Bed object, it takes a string input and sets bedType and capacity. 
		setType(t);
		setCapacity();
		
	}

}
