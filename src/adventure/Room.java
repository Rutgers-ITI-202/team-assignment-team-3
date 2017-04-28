package adventure;

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
		// TODO Auto-generated method stub
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
	
	//make array of 11 items, put item in index of room
	default Room getRoom(int x){
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
			case 11:
				return new Room11();
			default:
				System.out.println("No such room.");
				return null;
		}
	}
}
