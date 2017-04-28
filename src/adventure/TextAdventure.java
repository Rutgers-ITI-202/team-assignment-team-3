/*
This class:
	Contains the main method used to start the game.
	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

package adventure;

/**@author Brandon Cheng, Lauren Richardson, Edwin Zheng
 * @version 3.0
 * @since 04/28/2017
 */
import java.util.InputMismatchException;

import java.util.Scanner;

public class TextAdventure {
	
	private static Scanner myScanner;
	private static AdventureModel JaimeLannister = new AdventureModel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condition = false;
		myScanner = new Scanner(System.in);
		int num = 52;
		while(num<=57){
			System.out.println(JaimeLannister.getTextfiles().get(num));
			num++;
		}
		
		
		while(condition == false){
			try{
				String input = myScanner.nextLine();
				if(input.equalsIgnoreCase("Start")){
					condition = true;
					JaimeLannister.beginning();
				}

				else if(input.equalsIgnoreCase("Exit")){
					JaimeLannister.end();
					condition = true;
				}
				
				else{
					condition = false;
					System.out.println("Sorry, that was an invalid input");
				}
			}
		
			catch(InputMismatchException e) {
				System.out.println("Invalid input");
				condition = false;
			}
			
			catch(Exception e){
				System.out.println("Sorry, an error occured");
				condition = false;
			}
		}
	}
}
