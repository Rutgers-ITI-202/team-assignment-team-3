package adventure;
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
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class AdventureModel {
	private Room currentroom;
	private Scanner myScanner = new Scanner(System.in);
	private static Adventurer student = new Adventurer();
	
	public ArrayList<String> getTextfiles() {
		return student.getTextfile();
	}
	public void beginning(){
		int num = 0;
		while(num<=8){
			System.out.println(student.getTextfile().get(num));
			num++;
		}
		currentroom = new Room2();
		command();
	}
	
	public void end(){
		System.out.println(student.getTextfile().get(10));
		System.exit(0);
	}
	
	public void map(){
		if(student.getInventory()[2]){
			for(int i = 61; i <= 65; i++){
				System.out.println(student.getTextfile().get(i));
			}
		}
		else{
			System.out.println(student.getTextfile().get(67));
		}
	}
	
	public void command(){
		while(true){
			System.out.println(student.getTextfile().get(76));
			String input = myScanner.nextLine();
			switch(input.toLowerCase()){
				case "look":
					System.out.println(currentroom.look(student.getTextfile()));
					break;
					
				case "pick up":
					student.getInventory()[currentroom.pickup()] = true; //surround with try/catch - google exception outofbounds error
					break;
			
				case "drop":
					//surround with try/catch
					student.drop();
					break;
			
				case "open bag":
					student.Inventoryprint();
					break;
			
				case "end":
					end();
					break;
			
				case "move right":
					Room i = currentroom.move(2);
					if (i != null)
						currentroom = i;
					else 
						System.out.println("You cannot move in this direction, try again.");
					break;
			
				case "move left":
					i = currentroom.move(1);
					if (i != null)
						currentroom = i;
					else 
						System.out.println("You cannot move in this direction, try again.");
					break;
			
				case "move up":
					i = currentroom.move(3);
					if (i != null)
						currentroom = i;
					else 
						System.out.println("You cannot move in this direction, try again.");
					break;
			
				case "move down":
					i = currentroom.move(4);
					if (i != null)
						currentroom = i;
					else 
						System.out.println("You cannot move in this direction, try again.");
					break;
			
				case "Map":
					map();
					break;
			
				default:
					System.out.println("Error: Bad input");
					break;
			}
		}
	}
}
