package adventure;

import java.util.ArrayList;

public class Room5 implements Room {

	int left = 6;
	int right = 4;
	int up = -1;
	int down = -1;
	int id = 5;
	boolean item = true;
	
	public Room5(){
		System.out.println("-------You have entered the Children's Section-------");
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

