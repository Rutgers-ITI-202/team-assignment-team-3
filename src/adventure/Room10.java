package adventure;

/**@author Brandon Cheng, Lauren Richardson, Edwin Zheng
 * @version 3.0
 * @since 04/28/2017
 */

import java.util.ArrayList;

public class Room10 implements Room {

	int left = -1;
	int right = -1;
	int up = 8;
	int down = -1;
	int id = 10;
	boolean item = true;
	
	public Room10(){
		System.out.println("\n----------You have entered the Secret Dungeon!----------\n");
	}
	
	public String look(/*adventurer.textfile*/ArrayList<String>Description) {
		if (item)
			return Description.get(60); //line # of description of Room
		else 
			return Description.get(62);
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

