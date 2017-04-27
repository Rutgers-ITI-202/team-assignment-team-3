package adventure;

import java.util.ArrayList;

public class Room {
		
	static ArrayList <Room> roomList = new ArrayList<Room>();
	
	public Room (Boolean x, Boolean y, String z){
		Boolean location = x;
		Boolean item = y;
		String itemName = z;
	}
	
	class addRooms {{
		Room YA = new Room(false, true, "Identification Card");
		roomList.add(YA);
		Room Storage = new Room(false, true, "Batteries");
		roomList.add(Storage);
		Room Archives = new Room(false, true, "Map");
		roomList.add(Archives);
		Room Elevator = new Room(false, false, "");
		roomList.add(Elevator);
		Room Lobby = new Room(false, false, "");
		roomList.add(Lobby);
		Room Children = new Room(false, true, "Wallet");
		roomList.add(Children);
		Room Bathroom = new Room(false, true, "Flashlight");
		roomList.add(Bathroom);
		Room Office = new Room(false, true, "Key");
		roomList.add(Office);
		Room Comic = new Room(false, true, "Book");
		roomList.add(Comic);
		Room Media = new Room(false, true, "Master Key");
		roomList.add(Media);
		Room Hidden_Dungeon = new Room(false, true, "Baby Robotic Dragon");
		roomList.add(Hidden_Dungeon);
	}}
}