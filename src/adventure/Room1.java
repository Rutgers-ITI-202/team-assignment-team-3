package adventure;

import java.util.ArrayList;

public class Room1 implements Room{
	int left = -1;
	int right = 2;
	int up = -1;
	int down = -1;
	int id = 1;
	boolean item = true;
	
	public Room1(){
		System.out.println("\n----------You have entered the Storage Room----------");
	}
	
	public String look(/*adventurer.textfile*/ArrayList<String>Description) {
		if (item)
			return Description.get(13); //line # of description of Room
		else 
			return Description.get(1);
	}

	public int pickup() {
		item = false; //gets item and returns index of arraylist adventurer.getbag.set(Room1.pickup(), true)
		return getId();
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
