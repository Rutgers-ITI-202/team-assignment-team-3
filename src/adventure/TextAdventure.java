/*
This class:
�	Contains the main method used to start the game.
�	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

package adventure;

import java.util.Scanner;

public class TextAdventure {
	boolean condition = false;
	private static Scanner myScanner;
	private static AdventureModel student = new AdventureModel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		myScanner = new Scanner(System.in);
		System.out.println("Welcome To 'Escape The Library!'");
		System.out.println("\nType 'begin' to start the game! Or anything else to exit game...");
		input = myScanner.nextLine();
		if (input.equalsIgnoreCase("begin")){
			boolean condition = true;
			student.beginning();
			while(condition == true){
			student.command();
			}
		}

		else{
			student.noplay();
		}
	}

}
