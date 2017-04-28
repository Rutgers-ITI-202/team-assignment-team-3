package adventure;

import java.util.ArrayList;

public class Room7 implements Room {

	int left = 8;
	int right = -1;
	int up = -1;
	int down = 4;
	int id = 7;
	boolean item = true;
	
	public Room7(){
		System.out.println("\n----------You have entered the Librarian's Office----------\n");
	}
	
	public String look(/*adventurer.textfile*/ArrayList<String>Description) {
		if (item)
			return Description.get(32); //line # of description of Room
		else 
			return Description.get(34);
	}

	public int pickup() {
		item = false; //gets item and returns index of arraylist adventurer.getbag.set(Room1.pickup(), true)
		return getId() - 1;
	}
	public int getId() {
		return id;
	}
	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}

	public int getUp() {
		return up;
	}

	public int getDown() {
		return down;
	}
}
