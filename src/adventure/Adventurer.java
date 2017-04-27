/*
An adventurer has:
�	A location (some room).
�	An inventory (the things being carried).  When the player executes the �take thing� command, 
	the item should be added to the inventory.

An adventurer can:
�	Move from room to room.
�	Carry a number of objects.
�	Pick up, drop, look at, and use various objects.
*/

package adventure;

import java.util.Arrays;

public class Adventurer extends AdventureModel{
	private String Inventory[] = new String[8];
	private Room rooms[] = new Room[11];
	private static String location;
	
	private String[] getInventory() {
		return Inventory;
	}
	private void setInventory(String inventory[]) {
		Inventory = inventory;
	}

	private Room[] getRooms() {
		return rooms;
	}
	private void setRooms(Room rooms[]) {
		this.rooms = rooms;
	} 
	
	public static String currentRoom() {
		return location;
	}
	
	public void changeRoom(String x) {
		location = x;
	}
}
