package arrayLists;

import objectOrientedProgramming.Friend;
import java.util.ArrayList;

public class InClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> people = new ArrayList<Friend>();
		people.add(new Friend("bob", 35));
		people.add(0, new Friend("jane", 4));
		people.add(0, new Friend("billy", 75));
		for (int i = 0; i < people.size(); i++) {
			Friend buddy = people.get(i);
			System.out.println(buddy.getName());
		}
	}

}
