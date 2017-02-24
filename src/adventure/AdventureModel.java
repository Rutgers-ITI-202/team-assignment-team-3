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
	private boolean book = false;
	private boolean bookbag = false;
	
	public void getbook(boolean book){
		this.book=!this.book;
	}
	public void getbookbag(boolean bookbag){
		this.bookbag=!this.bookbag;
	}

	public void beginning(){
		System.out.println(" \nYou open your eyes, still half asleep. Confused, you try and recall what happened... "
				+ "\nSlowly you begin to remember...It was Friday evening and you have a big exam on "
				+ "\nMonday to study for. In order to concentrate, you went to the local library. "
				+ "\nBut after so many hours of studying at the library, you accidently fell asleep."
				+ "\nCommands you can use: 'Look', 'Pickup[item]', Drop[item]");
	}
	
	public static void noplay(){
		System.out.println("Maybe you'll want to play next time...");
	}
	
	public static void look(){
		System.out.println("You look around the room and see bookselves and empty tables. You look down and on the"
				+ "\ntable you were sleeping on, you see your [id] card and a [book]. On your back you feel a heavy"
				+ "\n sensation. You look back and see the old bookbag you've been using for the last 5 years.");
	}
	
	public static void command(){
		String input = "";
		myScanner = new Scanner(System.in);
		input = myScanner.nextLine();
		if(input.equalsIgnoreCase("look")){
			look();
		}
		else if(input.equalsIgnoreCase("pickup book")){
			student.addItem("book");
		}
			
	}
}