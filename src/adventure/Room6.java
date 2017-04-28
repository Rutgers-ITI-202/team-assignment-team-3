package adventure;

import java.util.ArrayList;

public class Room6 implements Room {

	int left = -1;
	int right = 5;
	int up = -1;
	int down = -1;
	int id = 6;
	boolean item = true;
	
	public Room6(){
		System.out.println("\n----------You have entered the Bathroom----------\n");
	}
	
	public String look(/*adventurer.textfile*/ArrayList<String>Description) {
		if (item)
			return Description.get(24); //line # of description of Room
		else 
			return Description.get(26);
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

