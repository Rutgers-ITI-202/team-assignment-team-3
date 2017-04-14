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

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AdventureModel {
	//private static Adventurer student = new Adventurer();
	
	public void beginning(){
		File inputFile = new File("Intro.txt");
		try{
			String input;
			Scanner in = new Scanner(inputFile);
			while (in.hasNextLine()){
				input = in.nextLine();
				System.out.println(input);
			}
			in.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public void end(){
		System.out.println("Any progress will be lost. Bye~");
		System.exit(0);
	}
	
	public void look(){
		
	}
	
	public void pickup(){
		
	}
	
	public void drop(){
		
	}
	
	public void openbag(){
		
	}
}

