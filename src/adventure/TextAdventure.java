<<<<<<< HEAD
/*
This class:
�	Contains the main method used to start the game.
�	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

package adventure;

import java.util.Scanner;

/* @author Edwin, Lauren, and Brandon
 * @since 02/24/17
 * */

public class TextAdventure {
	
	private static Scanner myScanner;
	private static AdventureModel model = new AdventureModel();
	
	/* Asks user if they would like to play, if so begins game */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myScanner = new Scanner(System.in);
		System.out.println("Welcome To 'Library Escape'!");
		System.out.println("\nAvailable Commands: \n1. = Start Game \n2. = Exit Game");
		boolean condition = false;
		
		while(condition == false){
			try{
				String input = myScanner.nextLine();
				int num = Integer.parseInt(input);
				if(num == 1){
					condition = true;
					model.beginning();
					while(condition == true){
						model.command();
					}
				}

				else if(num == 2){
					System.exit(0);
					condition = true;
				}
				
				else if(num!=2 && num!=1){
					condition = false;
					System.out.println("Sorry, that was an invalid input");
				}
			}
			
			catch(Exception e){
				System.out.println("Sorry, that was an invalid input");
				condition = false;
			}
		}
	}
}
=======
/*
This class:
�	Contains the main method used to start the game.
�	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

package adventure;

import java.util.Scanner;

/* @author Edwin, Lauren, and Brandon
 * @since 02/24/17
 * */

public class TextAdventure {
	
	private static Scanner myScanner;
	private static AdventureModel student = new AdventureModel();
	
	/* Asks user if they would like to play, if so begins game */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myScanner = new Scanner(System.in);
		System.out.println("Welcome To 'Library Escape'!");
		System.out.println("\nAvailable Commands: \n1. = Start Game \n2. = Exit Game");
		
		while(condition == false){
			try{
				String input = myScanner.nextLine();
				int num = Integer.parseInt(input);
				if(num == 1){
					condition = true;
					student.beginning();
					while(condition == true){
						student.commands();
					}
				}

				else if(num == 2){
					student.end();
					condition = true;
				}
				
				else if(num!=2 && num!=1){
					condition = false;
					System.out.println("Sorry, that was an invalid input");
				}
			}
			
			catch(Exception e){
				System.out.println("Sorry, that was an invalid input");
				condition = false;
			}
		}
	}
}
>>>>>>> master
