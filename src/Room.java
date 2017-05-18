import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {
	 
	private String roomType; //This declares the variable roomType as a string.
	private  List<Bed> beds = new ArrayList<Bed>(); //This declares beds as a list of type Bed. 
	private String version = ""; //This declares the variable version as type string.
	private boolean isVacant = true; //This declares the variable isVacant and initialises it to true. 
	
	
	public boolean checkIfVacant() { // This is the get method for isVacant which returns the boolean value.
		return isVacant;
	}

	public void setVacant(boolean isVacant) { //This is the set method for isVacant which sets the boolean value.
		this.isVacant = isVacant;
	}
	
	public String getType() { //This is the get method for roomType which returns the string value.
		return roomType;
	}

	public void setType(String type) { //This is the set method for roomType which sets the string value.
		this.roomType = type;
	}

	public List<Bed> getBeds() { //This is the get method for the list beds and returns the whole list.
		return beds;
	}

	public void addBed(String type, int n){ //This method adds a bed to the list bed based on a string and integer value.
		for(int i=0; i<n;i++){ //This loops n times, creating and adding a new object of type bed to the list each time.
		beds.add(new Bed(type));
		}
	}
	
	public int getNoSingleBeds(){ //This returns the number of single beds in the list bed by looping through the list and checking each value. 
		int n = 0;
		for(Bed b: beds){
			if(b.getType() == "Single"){
				n++;
			}
		}
		return n;
	}
	
	public int getNoDoubleBeds(){ //This returns the number of double beds in the list bed by looping through the list and checking each value.
		int n = 0;
		for(Bed b: beds){
			if(b.getType() == "Double"){
				n++;
			}
		}
		return n;
	}
	
	public String getVersion() { // This is the get method for version which return the value of version
		return version;
	}

	public void setVersion(int version) { //This is the set method for version.
		if(roomType == "Single"){ // This uses an if statement to set the version dependent on the type of room.
			this.version = "one single bed";
		}
		else if(roomType == "Double"){
			if(version ==1){
				this.version = "one double bed";
			}
			else if(version == 2){
				this.version = "two single beds";
			}
		}
		else if(roomType == "Family"){
			if(version == 1){
				this.version = "one double bed and two single beds";
			}
			else if(version == 2){
				this.version = "two double beds";
			}
		}
		
	}

	
	public int getCapacity(){ //This method returns the capacity of the room.
		int capacity = 0;
				for(Bed b:beds){ // A for loop iterates through the list beds and gets the capacity for each bed.
					capacity += b.getCapacity();
				}
		return capacity;
	}
	
	public void configureBeds(String type, int version){ // This method configures the beds for the room.
		
		if(type =="Single"){ //An if statement checks the type and version of the room and adds the appropriate beds using the addBed method.
			addBed("Single",1);
		}
		else if(type == "Double"){
			if (version == 1){
				addBed("Double",1);
			}
			else if( version == 2){
				addBed("Single",2);
			}
		}
		else if(type == "Family"){
			if(version == 1){
				addBed("Double",1);
			addBed("Single",2);
			}
			else if(version == 2){
			addBed("Double",2);
			}
		}
	}
	
	public Room(String type, int version, boolean vacancy){ //This is the main constructor for the object Room.
		setType(type); 
		configureBeds(type, version);
		setVersion(version);
		setVacant(vacancy);
	}
	
}
