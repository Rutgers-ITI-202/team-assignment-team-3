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

/* @author Edwin, Lauren, and Brandon
 * @since 02/24/17
 * */

public class AdventureModel {
	private static Scanner myScanner;
	private static Adventurer student = new Adventurer();

	/* intro of game, describes situation of player and different commands they can enter */
	
	public void beginning(){
		System.out.println("\nYou open your eyes, still half asleep. Confused, you try and recall what happened... "
				+ "\nSlowly you begin to remember...It was Friday evening and you have a big exam on "
				+ "\nMonday to study for. In order to concentrate, you went to the local library. "
				+ "\nBut after so many hours of studying, you accidently fell asleep!"
				+ "\n\nCommands: Look = '1', Go = '2', Backpack = '3', Take = '4', Drop = '5', End = '6'. "
				+ "\nYou may enter 5 at any time to quit the game.");
	}
	
	public static void noplay() {
		System.out.println("\nYour progress will be lost, bye.");
	}
	
	/* catches if player tries to input a command that doesn't make sense */
	
	public static void noitem(){
		System.out.println("Error, you can't throw away what's not in your bookbag!");
	}
	
	/* Player adds and discards items to their inventory */
	
	public void command(){
		myScanner = new Scanner(System.in);
		int input = myScanner.nextInt();
		switch (input) {
		
			case '1' :
				System.out.println(Room.look(student.getRoom()));
				break;
				
			case '2' :
				if (student.getRoom() == "storage" || student.getRoom() == "bathroom" || student.getRoom() == "media") {
					System.out.print("Enter '1' to go to " + Room.leftRoom()); }
				else {
					System.out.print("Enter '1' to go to" + Room.leftRoom() + ".\nEnter '2' to go to " + Room.rightRoom());
				if (student.getRoom() == "elevator") {
					System.out.println(".\nEnter '3' to go to " Room.topRoom());}
				}
				break;
				
			case '3' :
				System.out.println("Your backback currently contains " + student.Backpack);
				break;
			
			case '4' :
				String item = Room.roomItem(student.getRoom());
				student.addItem(item);
				System.out.println("You added " + item + " to your backpack!");
				break;
				
			case '5' :
				System.out.println("Your backpack currently contains " + student.Backpack);
				for (int i=0; i<6; i++) {
					System.out.println(x);
					student.Backpack.add(i, item);
				}
				
				int deleteInput = myScanner.nextInt();
				student.removeItem(deleteInput);
				break;
				
			case '6' :
				System.out.println("Your progress will be lost. Bye~");
				System.exit(0);
				break;
				
			default:
				System.out.println("Please enter one of the listed commands.");
		}
		
		
			
		else{
			System.out.println("'Introduction of Object Oriented Programming 101'. *sigh* Just looking at this book"
					+ "\nis starting to give you a headache. You should probably take that book with you since you'll"
					+ "\nneed it to pass your exams.");
			student.addItem("book");
			System.out.println("\nThe [book] has been added to your bookbag!");
			}
		}
		else if(input.equalsIgnoreCase("drop book")){
			if(student.Backpack.contains("book")){
				 student.removeItem("book");
					System.out.println("You threw away your [book]!");	
			}
			else{
				noitem();
			}
	}
	/*room.look();
	
	interface Lookable {
		public String look() 
	}
	
	public class Item implements Lookable {
		private String description;
		public String look(){
			return description;
		}*/
}