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
	
	Adventurer Adventurer = new Adventurer;	
	Object Rock = new Object;
	Room Room1 = new Room;
	
	Scanner scanner = new Scanner(System.in);
	
	String go() {
		System.out.println("Please enter a command: ");
	
		boolean condition = true;
	
	
		while(condition == true) {
			String input = scanner.next();
				switch (input) {
			
				case "Look":
					Room.description(String x);
				
				case "Take":
					Adventurer.addItem(String x);
				
				case "Use":
				
			
				default:
					System.out.println("Input not valid, please try again.");
			}}	

}

}
