package adventure;

import java.util.ArrayList;

public class Room8 implements Room {

	int left = 9;
	int right = 7;
	int up = -1;
	int down = 10;
	int id = 8;
	boolean item = true;
	
	public Room8(){
		System.out.println("\n----------You have entered the Comics Section----------\n");
	}
	
	public String look(/*adventurer.textfile*/ArrayList<String>Description) {
		if (item){
			return Description.get(36); //line # of description of Room
		}
		else{
			return Description.get(38);}
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
