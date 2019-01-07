package arrayLists;

import java.util.ArrayList;

import objectOrientedProgramming.Friend;


public class InClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Friend>people = new ArrayList<Friend>();
		people.add(new Friend("bob", 35));
		people.add(0, new Friend("jane", 4));
		people.add(0, new Friend("billy", 75));

	}

}
