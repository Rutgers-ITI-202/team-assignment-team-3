package adventure;

/**@author Brandon Cheng, Lauren Richardson, Edwin Zheng
 * @version 3.0
 * @since 04/28/2017
 */

import java.util.ArrayList;

public interface Room {

	public String look(/*adventurer.textfile*/ArrayList<String>Description);
	public int pickup();
	public int getId();
	public int getLeft();
	public int getRight();
	public int getUp();
	public int getDown();
	boolean access = true;
	
	default Room move(int direction) {
		/**@param direction from AdventureModel
		 * @return adjacent rooms to AdventureModel
		 */
		switch (direction){
			case 1:
				if (getLeft()!=-1){
					return getRoom(getLeft());
				}
				break;
			
			case 2:
				if (getRight()!=-1){
					return getRoom(getRight());
				}
				break;
		
			case 3:
				if (getUp()!=-1){
					return getRoom(getUp());
				}
				break;
		
			case 4:
				if (getDown()!=-1){
					return getRoom(getDown());
				}
				break;
		
			default:
				System.out.println("You cannot move in this direction");
				return null;
			}
		return null;
	}
	
	// array of 11 items, item in index of corresponding room
	default Room getRoom(int x){
		/**@param  index of room
		 * @return Room to move method
		 */
		switch (x){
			case 1:
				return new Room1();
			case 2:
				return new Room2();
			case 3:
				return new Room3();
			case 4:
				return new Room4();
			case 5:
				return new Room5();
			case 6:
				return new Room6();
			case 7:
				return new Room7();
			case 8:
				return new Room8();
			case 9:
				return new Room9();
			case 10:
				return new Room10();
			default:
				System.out.println("No such room.");
				return null;
		}
	}
}
