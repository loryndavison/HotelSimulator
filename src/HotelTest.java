
public class HotelTest {

	public static void main(String[] args)
	{
		Hotel newHotel = new Hotel("Mermaid Inn"); //This creates a new hotel and sets the name to "Mermaid Inn" 
		newHotel.addRoom("Single",3,0,true); //This adds three vacant single rooms to the hotel.
		newHotel.addRoom("Double",2,1,true); //This adds two double vacant double rooms of version 1 to the hotel.
		newHotel.addRoom("Family",1,1,false);//This adds one occupied family room of version 1 to the hotel.
		
		HotelReport report = new HotelReport(newHotel); //This creates a new hotel report about newHotel.
	}
}
