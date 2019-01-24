package arrayLists;

import objectOrientedProgramming.Friend;
import java.util.ArrayList;

public class InClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> people = new ArrayList<Friend>();
		people.add(new Friend("bob", 35));
		people.add(new Friend("jane", 4));
		people.add(new Friend("billy", 75));
		people.add(new Friend("john", 34));
		people.add(new Friend("dave", 13));
		
		Friend student = people.remove(0);
		people.set(3, student);
		Friend pal = people.remove(people.size()-1);
		people.set(0, pal);
		
		for (int i = 0; i < people.size(); i++) {
			Friend buddy = people.get(i);
			System.out.println(buddy.getName());
		}
	}

}
