package adventure;

import adventure.Room.SuperRoom;

public class Room {
	
	class SuperRoom {
		Boolean location;
		Boolean item;
		String itemName;
		String itemDescription;
		String description;
		String altDescription;
		public String getName() {
			return itemName;
		}
	}
	
	class YA extends SuperRoom {{
		location = false;
		item = true;
		itemName = "Identification Card";
		itemDescription = "Name: Jamie Lannister \nDate of Birth: April 01, 1995"
				+ "\nEye Color: Oh My~ \nSex: Unknown";
		description = "";
		altDescription = "";
		String Phone = "Model: iPhone 7 (dead batteries)";
	}}
	
	class Storage extends SuperRoom {{
		location = false;
		item = true;
		itemName = "Batteries";
		itemDescription = "Flashlight Batteries. Use to turn on Flashlight (Lightsaber)";
		description = "";
		altDescription = "";
	}}
	
	public class Archives extends SuperRoom {{
		location = false;
		item = true;
		itemName = "Map";
		itemDescription = "Second Floor:   |Media Room|   <-->   |Comics Section|       <-->    |Librarian's Office|\n"
				+ "\nFirst Floor:    |Bathroom|     <-->   |Children's Section|   <-->    |Lobby| \n"
				+ "\nBasement:       |Storage|      <-->   |Young Adults Section| <-->    |Archives|";
		description = "";
		altDescription = "";
	}}
	
	public class Elevator extends SuperRoom {{
		location = false;
		item = false;
		description = "";
	}}
	
	public class Lobby extends SuperRoom {{
		location = false;
		description = "";
		boolean Lock = true;
	}}
	
	public class Children extends SuperRoom {{
		location = false;
		item = true;
		itemName = "Wallet";
		itemDescription = "You'll need this to pay for the Uber ride back to Campus";
		description = "";
		altDescription = "";
	}}
	
	public class Bathroom extends SuperRoom {{
		location = false;
		item = true;
		itemName = "Flashlight";
		itemDescription = "Nicknamed: Lightsaber.(no batteries)";
		description = "";
		altDescription = "";
	}}
	
	public class Office extends SuperRoom {{
		location = false;
		item = true;
		itemName = "Key";
		itemDescription = "The key to opening the Media Room!";
		description = "";
		altDescription = "";
	}}
	
	public class Comic extends SuperRoom {{
		location = false;
		item = true;
		itemName = "Book";
		itemDescription = "";
		description = "";
		altDescription = "";
	}}

	public class Media extends SuperRoom {{
		location = false;
		item = true;
		itemName = "MasterKey";
		itemDescription = " You'll need this to swipe open the exit door in the Lobby";
		description = "";
		altDescription = "";
	}}
	
	public class Hidden_Dungeon extends SuperRoom {{
		location = false;
		item = true;
		itemName = "BabyRoboticDragon";
		itemDescription = "Dragons are cool, babies are dumb, if you see a puppy, you better run!";
		description = "";
		altDescription = "";
	}}
	
	public class StormTrooperRoom extends SuperRoom {{
		location = false;
		item = true;
		itemName = "";
		itemDescription = "";
		description = "";
		altDescription = "";
	}}
}