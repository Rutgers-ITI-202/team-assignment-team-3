/*
This class:
�	Contains the main method used to start the game.
�	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/
java.import.io
import java.scanner

package adventure;

public class TextAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner mainscan = new Scanner(System.in);
		
		System.out.println("Hello, welcome to our game! Would you like to play?: ");
		String response = mainscan.next();
		
		if (response.equalsIgnoreCase("Yes")){
			AdventureModel.go;
			}
		else {
			System.out.println("Ok bye");
		}
		Adventurer student = new Adventurer();
	}

}
