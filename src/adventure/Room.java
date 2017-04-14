package adventure;

public class Room {
	boolean hasitem = true;
	
	public class YA extends Room{
		String IdentificationCard = "Name: Jamie Lannister \nDate of Birth: April 01, 1995"
				+ "\nEye Color: Oh My~ \nSex: Unknown";
		String Phone = "Model: iPhone 7 (dead batteries)";
	}
	public class Bathroom extends Room{
		String Flashlight = "Nicknamed: Lightsaber.(no batteries)";
	}
	public class Storage extends Room{
		String Batteries = "Flashlight Batteries. Use to turn on Flashlight (Lightsaber)";
	}
	public class Comic extends Room{
		String BabyRoboticDragon = "Dragons are cool, babies are dumb, if you see a puppy, you better run!";
		boolean Book = false;
	}
	public class Office extends Room{
		String Key = "The key to opening the Media Room!";
	}
	public class Media extends Room{
		String MasterKey = " You'll need this to swipe open the exit door in the Lobby";
	}
	public class Children extends Room{
		String Wallet = " You'll need this to pay for the Uber ride back to Campus";
	}
	public class Lobby extends Room{
		boolean Lock = true;
	}
	public class Archives extends Room{
		String Map = "Second Floor:   |Media Room|   <-->   |Comics Section|       <-->    |Librarian's Office|\n"
				+ "\nFirst Floor:    |Bathroom|     <-->   |Children's Section|   <-->    |Lobby| \n"
				+ "\nBasement:       |Storage|      <-->   |Young Adults Section| <-->    |Archives|";
	}
	public class Hidden_Dungeon extends Room{
		
	}
	public class HydraHeadquarters extends Room{
		
	}
}
	
// put descriptions into text files so that it is easier to change them

