/*
An adventurer has:
�	A location (some room).
�	An inventory (the things being carried).  When the player executes the �take thing� command, the item should be added to the inventory.

An adventurer can:
�	Move from room to room.
�	Carry a number of objects.
�	Pick up, drop, look at, and use various objects.
*/

package adventure;

import java.util.ArrayList;

/* @author Edwin, Lauren, and Brandon
 * @since 02/24/17
 * */

public class Adventurer {
	
/*Player inventory*/
	
	public  static ArrayList<String> Bookbag = new ArrayList<String>();
		public void addItem (String t){
			Bookbag.add(t);
			}
		public void removeItem (String t){
			Bookbag.remove(t);
			}

}
