/*
An adventurer has:
�	A location (some room).
�	An inventory (the things being carried).  When the player executes the �take thing� command, 
	the item should be added to the inventory.
An adventurer can:
�	Move from room to room.
�	Carry a number of objects.
�	Pick up, drop, look at, and use various objects.
*/

package adventure;

/**@author Brandon Cheng, Lauren Richardson, Edwin Zheng
 * @version 3.0
 * @since 04/28/2017
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Adventurer extends AdventureModel{
	private boolean Inventory[] = new boolean[10];
	private static ArrayList<String> textfile = new ArrayList<String>();
	Scanner input = new Scanner(System.in);
	/**
	*Set number of max inventory space.
	*Creates the ArrayList that stores all the text from my Description file.
	*/
	public void Inventoryprint(){
		if (Inventory[0]) //per room
			System.out.println("0: Batteries");
		if (Inventory[1])
			System.out.println("1: Textbook 'Java Essentials'");
		if (Inventory[2])
			System.out.println("2: Map"); 
		if (Inventory[3])
			System.out.println("3: Textbook 'Headfirst Java'");
		if (Inventory[4])
			System.out.println("4: Textbook 'Object-Oriented Design'");
		if (Inventory[5])
			System.out.println("5: Flashlight");
		if (Inventory[6])
			System.out.println("6: Key");
		if (Inventory[7])
			System.out.println("7: Sketchy Book");
		if (Inventory[8])
			System.out.println("8: Master Key");
		if (Inventory[9])
			System.out.println("9: Bloody Textbook");
	/**
	*This just prints out the items in your Inventory. So when you want to open bag, this is the method it calls.
	*/
	}
	
	public Adventurer(){
		for(boolean i:Inventory)
			i = false;
		
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
	/**
	*Sets all the boolean items in your inventory to false (becomes true when you pick them up)
	*Loop to import all the Description text to the ArrayList we made above.
	*Catches for weird errors.
	*/
	}
	
	public boolean[] getInventory() {
		return Inventory;
		/**
		*@returns Inventory to see if you have the item
		*/
	}
	
	public void setInventory(boolean inventory[]) {
		Inventory = inventory;
		/**
		*@param Inventory
		*/
	}
	
	public ArrayList<String> getTextfile() {
		return textfile;
		/**
		*@returns textfile
		*/
	}
	
	public void setTextfile(ArrayList<String> t) {
		textfile = t;
		/**
		*@param ArrayList textfile
		*/
	}
	
	public void drop() {
		Inventoryprint();
		System.out.println("Please enter the number of item in your inventory that you would like to drop:");
		int k = input.nextInt();
		if (k < 0 || k >= 11) {
			System.out.println("You entered a bad value boo, try again");
			drop();
			return;
		}
		if (Inventory[k]) {
			Inventory[k] = false;
		}
		/**
		*Asks for what item you want to drop. Catches bad input and sets item to false (no longer shows)
		*/
	}
}
