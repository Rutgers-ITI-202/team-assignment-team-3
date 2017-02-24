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

public class AdventureModel {
	private static Scanner myScanner;
	private static Adventurer student = new Adventurer();

	public void beginning(){
		System.out.println(" \nYou open your eyes, still half asleep. Confused, you try and recall what happened... "
				+ "\nSlowly you begin to remember...It was Friday evening and you have a big exam on "
				+ "\nMonday to study for. In order to concentrate, you went to the local library. "
				+ "\nBut after so many hours of studying at the library, you accidently fell asleep."
				+ "\n\nHere are the commands you can use: 'Look', 'Pickup[item]', 'Drop[item]', and 'Open Bag'"
				+ "\nNote: Do not include '[]' in your command, the '[]' are only there to indicate item names!");
	}
	
	public static void noplay(){
		System.out.println("\nMaybe you'll want to play next time...");
	}
	
	public static void look(){
		if(student.Bookbag.contains("book") && student.Bookbag.contains("id")){
			System.out.println("\nYou look around the room and see that you have taken all the items that you can fit into your bag.");
		}
		else if(!student.Bookbag.contains("book") && !student.Bookbag.contains("id")){
			System.out.println("You look around the room and see bookselves and empty tables. You look down and on the"
				+ "\ntable you were sleeping on, you see your [ID] card and a [book]. On your back you feel a heavy"
				+ "\nsensation. You look back and see the old bookbag you've been using for the last 5 years.");
		}
		else if(!student.Bookbag.contains("id")){
			System.out.println("\nYou look around the room and see the bookselves and empty tables. Other than the [ID] card "
					+ "\non the desk next to you, there is nothing of interest here. Maybe you should pickup the [ID] card!");
		}
		else{
			System.out.println("\nYou look around the room and see the bookselves and empty tables. Other than the [book]"
						+ "\n on the desk next to you, there is nothing of interest here. Maybe you should pickup the book!");
		}
	}

	public static void end(){
		System.out.println("Your progress will be lost. Bye~");
		System.exit(0);
	}
	public static void noitem(){
		System.out.println("Error, you can't throw away what's not in your bookbag!");
	}
	public static void alreadyhave(){
		System.out.println("Error, you can't pick up something that's already in your bookbag!");
	}
	public void command(){
		String input = "";
		myScanner = new Scanner(System.in);
		input = myScanner.nextLine();
		if(input.equalsIgnoreCase("look")){
			look();
		}
		else if(input.equalsIgnoreCase("pickup book")){
			if(student.Bookbag.contains("book")){
				alreadyhave();
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
			if(student.Bookbag.contains("book")){
				 student.removeItem("book");
					System.out.println("You threw away your [book]!");	
			}
			else{
				noitem();
			}
		}
		
		else if(input.equalsIgnoreCase("pickup id")){
			if(student.Bookbag.contains("id")){
				alreadyhave();
			}
			else{
			System.out.println("This is your student [ID] card, you should probably keep it on you just to be safe!");
			student.addItem("id");
			System.out.println("\nThe [ID] card has been placed in your bookbag!");
			}
		}
		else if(input.equalsIgnoreCase("drop id")){
			if(student.Bookbag.contains("id")){
			student.removeItem("id");
			System.out.println("You threw away your [ID].");
			}
			else{
				noitem();
			}
		}
		else if(input.equalsIgnoreCase("open bag")){
			System.out.println("You opened your bag and you saw :" + student.Bookbag);
		}
		else if(input.equalsIgnoreCase("exit")){
			end();
		}
		else{
			System.out.println("invalid command, please try again!");
			command();
		}
	}
}