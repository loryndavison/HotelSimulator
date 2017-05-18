
public class HotelReport{

	public HotelReport(Hotel h){ //This is the constructor for HotelReport
		report(h);
	}
	
public void report(Hotel h){

	//The following statements print out the report to the console about the hotel.
	
	System.out.println(String.format( "Name:\t%s\nTotal Rooms:\t%d\n", h.getName(), h.getNoRooms()));
	
	System.out.print(String.format("Single Rooms:\t%d\n",h.getNoSingleRooms())); 
	System.out.println("Single rooms contain one single bed.\n");
	
	System.out.print(String.format("Double Rooms:\t%d\n",h.getNoDoubleRooms()));
	
	System.out.println("Double rooms contain " + h.getDoubleRoomVersion() + ".\n");
	
	System.out.print(String.format("Family Rooms:\t%d\n",h.getNoFamilyRooms()));
	System.out.println("Family rooms contain " + h.getFamilyRoomVersion() + ".\n");
	
	System.out.print("The maximum occupancy of the hotel is " + h.getMaxOccupancy());
	
	
	//The following if statement checks if the hotel has vacancies and then prints the appropriate statement to the console.
	if (h.checkHasVacancy() == true){
		System.out.println("\nThe hotel has vacancies.");
	}
	else if (h.checkHasVacancy() == false){
		System.out.println("\nThe hotel does not have any vacancies.");
	}
}
}
			
