package adventure;

/**@author Brandon Cheng, Lauren Richardson, Edwin Zheng
 * @version 3.0
 * @since 04/28/2017
 */

import java.util.ArrayList;

public class Room8 implements Room {

	int left = 9;
	int right = 7;
	int up = -1;
	int down = 10;
	int id = 8;
	boolean item = true;
	
	public Room8(){
		/**@return entry statement**/
		System.out.println("\n----------You have entered the Comics Section----------\n");
	}
	
	public String look(/*adventurer.textfile*/ArrayList<String>Description) {
		/**@param Description stored in arraylist
		 * @return specific line of description about room
		 */
		if (item){
			return Description.get(36); //line # of description of Room
		}
		else{
			return Description.get(38);}
	}

	public int pickup() {
		/**@return id number of room minus 1 to account for the fact that the array list of items starts at 0**/
		item = false; //gets item and returns index of arraylist adventurer.getbag.set(Room1.pickup(), true)
		return getId() - 1;
	}
	public int getId() {
		/**@return id number of room**/
		return id;
	}
	public int getLeft() {
		/**@return id of connecting room (if one exists in this 'location')**/
		return left;
	}

	public int getRight() {
		/**@return id of connecting room (if one exists in this 'location')**/
		return right;
	}

	public int getUp() {
		/**@return id of connecting room (if one exists in this 'location')**/
		return up;
	}

	public int getDown() {
		/**@return id of connecting room (if one exists in this 'location')**/
		return down;
	}
	
}
