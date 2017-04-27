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
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class AdventureModel {
	private static Adventurer student = new Adventurer();
	private static ArrayList<String> textfile = new ArrayList<String>();
	
	private static ArrayList<String> getStorage() {
		return textfile;
	}

	private static void setStorage(ArrayList<String> storage) {
		textfile = storage;
	}
	
	public void datadump(){
		File inputFile = new File("Descriptions.txt");
		try{
			int counter = 0;
			String input;
			Scanner in = new Scanner(inputFile);
			while (in.hasNextLine()){
				input = in.nextLine();
				getStorage().add(input);
				counter++;
			}
			in.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	public void beginning(){
		int num = 0;
		while(num<=8){
			System.out.println(textfile.get(num));
			num++;
		}
	}
	
	public void end(){
		System.out.println(textfile.get(10));
		System.exit(0);
	}
	
	public void look(){
		
	}
	
	public void pickup(){

	}
	
	public void drop(){

	}
	
	public void openbag(){

	}
	
	public void move(){

	}
	
	public void map(){

	}
}

