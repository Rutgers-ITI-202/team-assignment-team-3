package adventure;

public class Room {
		public static String name = Room.setName();
		public String roomDescription;
		public static String item;
		public arrayList connectingRooms
		
		public static String returnName() {
			return name;
		}
	
	public static String roomItem(String x){
		item = x.item;
		return item;
	}
	
	public static String roomLook(String x) {
		
	}
	
	public class Room1 extends Room {
		String name = "Storage Closet";
		roomDescription = "You look around an empty room. There are not windows or doors, you are trapped here forever.";
		connectingRooms = ;
		Item batteries = true;
	}
	
	public class Room2 extends Room {
		String name = "Young Adults Section";
		public String setName(){
			return name;
		}
		
	}
	
	public class Room3 extends Room {
		String name = "Archives";
	}
	
	public class Room4 extends Room {
		String name = "Elevator";
	}
	
	public class Room5 extends Room {
		String name = "Lobby";
	}
	
	public class Room6 extends Room {
		
	}
	
// put descriptions into text files so that it is easier to change them

