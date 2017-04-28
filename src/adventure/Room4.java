package adventure;

import java.util.ArrayList;

public class Room4 implements Room {

	int left = 5;
	int right = -1;
	int up = 7;
	int down = 3;
	int id = 4;
	boolean item = true;
	
	public Room4(){
		System.out.println("\n----------You have entered the Main Lobby----------");
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

