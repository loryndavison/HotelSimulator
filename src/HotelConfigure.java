import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class HotelConfigure {

	public static void main(String[] args){
		HotelConfigure configureHotel = new HotelConfigure(); //This creates an instance of HotelConfigure called configureHotel
		
		Scanner reader = new Scanner(System.in); //This creates a scanner called reader.
		
		System.out.println("Please enter the name of the new Hotel."); //This prints a statement asking the user to enter the hotel name.
		
			String name = reader.nextLine(); //This reads the input from the user and saves it in a string called name
			Hotel newHotel = new Hotel(name); //This creates an instance of Hotel called newHotel.
			configureHotel.configureRooms(newHotel); //This calls to the configure rooms method within this class
			reader.close(); //This closes the reader.
			HotelReport report = new HotelReport(newHotel); //This creates an new HotelReport called report about newHotel
		
		

	}
	
	
	
	public void configureRooms(Hotel h){
		Scanner reader = new Scanner(System.in); //This creates a scanner called reader.
	
		
		//The following is enclosed by a try statement with conditions that throw to the catch statement when true.
			do{ 
				try{
					
					String[] roomTypes = h.getRoomTypes(); //This gets the options of room type and stores them in an array called roomTypes
					
					for(String type: roomTypes){ //This loop runs for each element in the array roomTypes
						//The following asks the user how many rooms of the type currently selected they want in the hotel.
						System.out.println("How many " + type + " rooms do you want in the hotel?" ); 
						int n = Integer.parseInt(reader.nextLine());
					
						if (n < 0){ //This checks that the input is valid and if not throws to the IllegalArgumentException
							throw new IllegalArgumentException("Value must be greater than or equal to 0.");
						}
					
					//The following if statement checks what type the room is and then asks what version of the room the user would like to use.
					// It also asks how many are in use and then adds the rooms to the hotel.
						if (type == "Double" && n > 0){
							
							System.out.println("For the double rooms, do you want:\n 1. one double bed \n 2. two single beds");
							int version = Integer.parseInt(reader.nextLine());
							
							if (version < 1 || version >2){ //This checks that the input is valid and if not throws to the IllegalArgumentException
								throw new IllegalArgumentException("Value must be either 1 or 2");
							}
					
							System.out.println("How many of these rooms are currently in use?");
							int occupiedRooms = Integer.parseInt(reader.nextLine());
							
							if (occupiedRooms > n || occupiedRooms < 0 ){//This checks that the input is valid and if not throws to the IllegalArgumentException
								throw new IllegalArgumentException("Value must be less than or equal to number of rooms of that type");
							}
							int vacantRooms = n - occupiedRooms;
						
							h.addRoom(type,occupiedRooms,version,false);
							h.addRoom(type,vacantRooms,version,true);
						
						}
						else if(type =="Family" && n > 0){
							System.out.println("For the family rooms, do you want:\n 1. one double bed and 2 single beds\n 2. two double beds");
							int version = Integer.parseInt(reader.nextLine());
						
							if (version < 1 || version >2){//This checks that the input is valid and if not throws to the IllegalArgumentException
							throw new IllegalArgumentException("Value must be either 1 or 2");
							}
						
							System.out.println("How many of these rooms are currently in use?");
							int occupiedRooms = Integer.parseInt(reader.nextLine());
							
							if (occupiedRooms > n || occupiedRooms < 0 ){//This checks that the input is valid and if not throws to the IllegalArgumentException
								throw new IllegalArgumentException("Value must be less than or equal to number of rooms of that type");
							}
						
							int vacantRooms = n - occupiedRooms;
							
							h.addRoom(type,occupiedRooms,version,false);
							h.addRoom(type,vacantRooms,version,true);
						
						}
						else if(n>0){
							System.out.println("How many of these rooms are currently in use?");
							int occupiedRooms = Integer.parseInt(reader.nextLine());
							
							if (occupiedRooms > n|| occupiedRooms < 0 ){//This checks that the input is valid and if not throws to the IllegalArgumentException
								throw new IllegalArgumentException("Value must be less than or equal to number of rooms of that type");
							}
							int vacantRooms = n - occupiedRooms;
							h.addRoom(type,occupiedRooms,0,false);
							h.addRoom(type,vacantRooms,0,true);
						}
					}
					
					break;
					
					}catch(IllegalArgumentException iae){ //This is the catch that prints that there is an error and asks the user to begin again with valid input. 
						System.out.println("\nError\n");
						System.out.println("\nPlease start again and enter only valid numeric input.\n");
					
					}
				
				
				}while (true);
			}
			
			

		}
	

		
		
		
	


				
		
	
	
	

	


