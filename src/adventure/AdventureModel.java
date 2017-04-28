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

/**@author Brandon Cheng, Lauren Richardson, Edwin Zheng
 * @version 3.0
 * @since 04/28/2017
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class AdventureModel {
	private Room currentroom;
	private Scanner myScanner = new Scanner(System.in);
	private static Adventurer student = new Adventurer();
	/**
	*Creates construtor for rooms. Creates Scanner and the student that connects this class to Adventurer.
	*/
	public ArrayList<String> getTextfiles() {
		return student.getTextfile();
	/**
	*This gets the appropriate string descriptions from our text file which we imported in Adventurer
	*@returns string from textfile
	*/
	}
	
	public void beginning(){
		int num = 0;
		while(num<=8){
			System.out.println(student.getTextfile().get(num));
			num++;
		}
		currentroom = new Room2();
		command();
	/**
	* This just reads the first 9 lines of intro text from my textfile ArrayList which holds all the descriptions for this game
	* Then it sets currentroom to the starting point of the game (YA Section). Basically places player in a room
	*/
	}
	
	public void win(){
		System.out.println("Congratulations, you have successfully escaped the library!");
		if (student.getInventory()[1] && student.getInventory()[3] && student.getInventory()[4] && student.getInventory()[9])
			System.out.println("You were smart to collect all those textbooks, you aslo managed to get an A+ on your exam!");
		end();
	/**
	* This is the method that runs when you win the game. If you have 4 of the required items, it also prints that you pass your exam.
	*/
	}
	
	public void end(){
		System.out.println(student.getTextfile().get(10));
		System.exit(0);
		/**
		*This just prints the bye bye statement. Then kills the program.
		*/
	}
	
	public void map(){
		if(student.getInventory()[2]){
			for(int i = 44; i <= 48; i++){
				System.out.println(student.getTextfile().get(i));
			}
			System.out.println();
		}
		else{
			System.out.println(student.getTextfile().get(50)+ "\n");
		}
		/**
		*This prints out the map for the user so that the player doesn't get lost.
		*Also has an else statement that runs if you don't have the map.
		*/
	}
	
	public void command(){
		while(true){
			System.out.println(student.getTextfile().get(59)+ "\n");
			String input = myScanner.nextLine();
			/**
			*Just a loop that makes sure the player always have a command display for as long as they're playing.
			*Also takes in the user input
			*/
			switch(input.toLowerCase()){
				case "look":
					System.out.println(currentroom.look(student.getTextfile()) + "\n");
					break;
					/**
					*This just calls the appropriate room subclass to get the appropriate description lines
					*/
				case "pick up":
					if (student.getInventory()[currentroom.pickup()] == true)
						System.out.println("There is nothing in here to pick up."+ "\n");
					else
						System.out.println("Item added to inventory."+ "\n");
						student.getInventory()[currentroom.pickup()] = true; 
							if (currentroom.getId() == 8) {
								System.out.println(student.getTextfile().get(37)+ "\n");
							}//surround with try/catch - google exception outofbounds error
					break;
					/**
					*Checks for whether you already have item. If you don't have item,
					*It prints you took it. Room8 is special case so it prints something extra for it.
					*/
			
				case "drop":
					//surround with try/catch
					student.drop();
					break;
					/**
					*Calls drop method to remove item
					*/
			
				case "open bag":
					student.Inventoryprint();
					System.out.println();
					break;
					/**
					*Calls a method in Adventurer to print out the inventory
					*/
			
				case "end":
					end();
					break;
					/**
					*Calls a method in this class that kills the program.
					*/
			
				case "move right":
					Room i = currentroom.move(2);
					if (i != null)
						currentroom = i;
					else 
						System.out.println("You cannot move in this direction, try again.");
					break;
			
				case "move left":
					i = currentroom.move(1);
					if (i != null) {
						currentroom = i;
						if (i.getId()==9) {
							if (!student.getInventory()[6]) {
								System.out.println("You approach the door and turn the knob only to realize "
										+ "\nthat the door is locked! It looks like you will either need to learn how to"
										+ "\npick locks or find a key somewhere. You go back into the Comics Section.");
								i = currentroom.move(2);
								currentroom = i;
								}
						}
					}
					else {
						System.out.println("You cannot move in this direction, try again.");
					}
					break;
			
				case "move up":
					i = currentroom.move(3);
					if (i != null) {
						currentroom = i;
						if (i.getId()==7) {
							if (!student.getInventory()[0] || !student.getInventory()[5]) {
								System.out.println("You peek into the doorway only to be enveloped in total darkness, "
										+ "\nafter banging into what you think is a desk and stubbing your toe you "
										+ "\neventually give up and go back downstairs");
								i = currentroom.move(4);
								currentroom = i;
							}
						}
					}
					else {
						System.out.println("You cannot move in this direction, try again.");
					}
					break;
			
				case "move down":
					i = currentroom.move(4);
					if (i != null) {
						currentroom = i;
						if (i.getId()==4) {
							if (student.getInventory()[8]) {
								System.out.println("You rush to the front door and use the key, you are free!");
								win();	
								}
							}
						}
					else {
						System.out.println("You cannot move in this direction, try again.");
					}
					break;
			
				case "map":
					map();
					break;
					/**
					*Calls map method to either print error or map
					*/
			
				default:
					System.out.println("Error: Bad input");
					break;
					/**
					*Catches all the wrong command
					*/
			}
		}
	}
}
