package adventure;

import java.util.ArrayList;

public class Room9 implements Room {

	int left = -1;
	int right = 8;
	int up = -1;
	int down = -1;
	int id = 9;
	boolean item = true;
	
	public Room9(){
		System.out.println("\n----------You have entered the Media Lab----------");
	}
	
	public String look(/*adventurer.textfile*/ArrayList<String>Description) {
		if (item)
			return Description.get(0); //line # of description of Room
		else 
			return Description.get(1);
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