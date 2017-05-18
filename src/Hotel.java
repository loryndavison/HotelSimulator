import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotel {

	private String name = ""; //This declares the private variable name as a string.
	private String[] roomTypes = {"Single", "Double", "Family"}; // This declare a private array called roomTypes and initialises the values.
	private List<Room> rooms = new ArrayList<Room>(); //This declares an array list of type Room 
	private boolean hasVacancy = true; // This declares a boolean called hasVacancy and initialise it true. 
	
	public List<Room> getRooms() { //This is the get method for rooms. it returns the list rooms.
		return rooms;
	}

	public String getName() { //This is the get method for the name of the hotel
		return name;
	}

	public void setName(String name) { //This is the set method for the name
		this.name = name;
	}
	
	
	public void addRoom(String r, int n, int version,boolean vacancy){ //This method adds rooms to the rooms list.
		for (int i=0; i<n ; i++){ //It loops n times and adds a new room on each iteration to the list.
		rooms.add(new Room(r, version,vacancy));
		}
	}
	
	public int getNoRooms(){ //This method returns the number of rooms in the hotel by checking the size of the list
		return rooms.size();
	}
	
	
	public String[] getRoomTypes() { //This is the get method for the roomTypes array.
		return roomTypes;
	}

	public int getNoSingleRooms(){ //This gets the number of single rooms in the hotel by looping through the list and counting.
		int n = 0;
		for(Room r: rooms){
			if(r.getType() == "Single"){
				n++;
			}
		}
		return n;
	}
	
	public int getNoDoubleRooms(){//This gets the number of double rooms in the hotel by looping through the list and counting.
		int n = 0;
		for(Room r: rooms){
			if(r.getType() == "Double"){
				n++;
			}
		}
		return n;
	}
	
	public int getNoFamilyRooms(){//This gets the number of family rooms in the hotel by looping through the list and counting.
		int n = 0;
		for(Room r: rooms){
			if(r.getType() == "Family"){
				n++;
			}
		}
		return n;
	}
	
	public String getDoubleRoomVersion(){ //This method returns the version of the double rooms.
		String version = "";
		for(Room r: rooms){
			if(r.getType() == "Double"){
				version = r.getVersion();
			}
		}
		return version;
	}
	
	public String getFamilyRoomVersion(){ //This method returns the version of the family rooms.
		String version = "";
		for(Room r: rooms){
			if(r.getType() == "Family"){
				version = r.getVersion();
			}
		}
		return version;
	}
	
	public int getMaxOccupancy(){ //This method returns the maximum occupancy of the hotel by looping through the list of rooms and adding the capacities of each together.
		int occupancy = 0;
		
		for(Room r:rooms){
			occupancy += r.getCapacity();
		}
		return occupancy;
	}
	
	public boolean checkHasVacancy() { //This is the get method for hasVacancy. 
		setHasVacancy(); // This calls the set method for the vacancy to update it before giving an output. 
		return hasVacancy;
	}

	public void setHasVacancy() { //This is the set method for hasVacancy, it loops through the list of rooms and checks the vacancy of each.
		for(Room r: rooms){
			if (r.checkIfVacant() == true){
				this.hasVacancy = true;
			}
		}
	}
	
	public Hotel(String name){ //This is the main constructor for Hotel
		setName(name);
	}

	
}
