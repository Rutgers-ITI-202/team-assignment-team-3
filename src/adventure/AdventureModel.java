/*
This class:
�	Creates the Rooms, the Things, and the Adventurer.
�	Connects the Rooms with "paths" to other Rooms.
�	Places Things in the Rooms.
�	Places the Adventurer in some Room.
�	Accepts commands from the player, and executes them.
	o	As commands are entered, they should be copied to the main text area.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/

package adventure;

import java.scanner;

public class AdventureModel {

	System.out.println("Please enter a room: ");
	
	Scanner scanner = new Scanner(System.in);
	
	boolean condition = true;
	
	String room;
	
	while(condition == true) {
		String input = scanner.next();
			switch (input) {
			
			case "Room 1":
				room = "Room 1";
				//call room 1?
			
			default:
				System.out.println("Input not valid, please try again.");
			}	

}
	
}
