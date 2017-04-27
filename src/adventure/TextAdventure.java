/*
This class:
�	Contains the main method used to start the game.
�	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/
import java.util.Scanner;

public class TextAdventure {
	
	private static Scanner myScanner;
	private static AdventureModel JaimeLannister = new AdventureModel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condition = false;
		myScanner = new Scanner(System.in);
		System.out.println("Welcome To 'Library Escape'!");
		System.out.println("\nAvailable Commands: [Start Game] [Exit Game]");
		
		while(condition == false){
			try {
				String input = myScanner.nextLine();
				if(input.equalsIgnoreCase("Start Game")){
					condition = true;
					JaimeLannister.beginning();
				}

				else if(input.equalsIgnoreCase("Exit Game")){
					JaimeLannister.end();
					condition = true;
				}
				
				else {
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
<<<<<<< Updated upstream
=======
	public static void commands(){
		boolean condition = false;
		myScanner = new Scanner(System.in);
		System.out.println("Available Commands: \n1. = Look Around \n2. = Pick Up Item \n3. = Drop Item "
				+ "\n4. = Look Inside Bookbag \n5. = Exit Game");
		while(condition == false){
			try{
				String input = myScanner.nextLine();
				int num = Integer.parseInt(input);
				if(num == 1){
					condition = true;
					JaimeLannister.look();
				}
				else if(num == 2){
					JaimeLannister.pickup();
					condition = true;
				}
				else if(num == 3){
					JaimeLannister.drop();
					condition = true;
				}
				else if(num == 4){
					JaimeLannister.openbag();
					condition = true;
				}
				else if(num == 5){
					JaimeLannister.end();
					condition = true;
				}
				else{
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
>>>>>>> Stashed changes
}
