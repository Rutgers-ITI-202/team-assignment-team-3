package adventure;

import java.util.ArrayList;

public class Room4 implements Room {


	int left = -1;
	int right = -1;
	int up = -1;
	int down = -1;
	int id = 4;
	boolean item = true;
	
	public Room4(){
		id = 2; //adventurer.getbag().set(Room.getid(),true)
		right = 3;
		left = 1;
	}
	
	public String look(/*adventurer.textfile*/ArrayList<String>Description) {
		if (item)
			return Description.get(0); //line # of description of Room
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

