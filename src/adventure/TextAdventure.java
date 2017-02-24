/*
This class:
�	Contains the main method used to start the game.
�	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

package adventure;

import java.util.Scanner;

public class textadventure {
	boolean condition = false;
	private static Scanner myScanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		myScanner = new Scanner(System.in);
		System.out.println("Welcome To 'Escape The Library!'");
		System.out.println("Type 'begin' to start the game! Or anything else to exit game...");
		input = myScanner.nextLine();
		adventuremodel student = new adventuremodel();
		if (input.equalsIgnoreCase("begin")){
			boolean condition = true;
			student.beginning();
			student.command();
		}
		else{
			boolean condition = false;
			student.noplay();
		}
	}

}
