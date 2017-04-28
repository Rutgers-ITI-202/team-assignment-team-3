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
	
	public static ArrayList<String> getTextfile() {
		return textfile;
	}
	public static void setTextfile(ArrayList<String> textfile) {
		AdventureModel.textfile = textfile;
	}
	
	public void datadump(){
		File inputFile = new File("Descriptions.txt");
		try{
			String input;
			Scanner in = new Scanner(inputFile);
			while (in.hasNextLine()){
				input = in.nextLine();
				textfile.add(input);
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
		command();
	}
	
	public void end(){
		System.out.println(textfile.get(10));
		System.exit(0);
	}
	
	public void drop(){
		String name = "";
		student.removeItem(name);
	}
	
	public void openbag(){
		student.open();
	}
	
	public void map(){
		if(student.Inventory.contains("map")){
			for(int i = 61; i <= 65; i++){
				System.out.println(getTextfile().get(i));
			}
		}
		else{
			System.out.println(getTextfile().get(67));
		}
	}
	
	public void command(){
		boolean condition = false;
		while(condition == false){
			System.out.println(getTextfile().get(76));
			
		}
	}
	
	public void look(){
		
	}
	
	public void pickup(){

	}
	
	public void move(){

	}
}
