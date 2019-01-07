package arrayLists;

import java.util.ArrayList;

public class InClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> people = new ArrayList<String>();
		people.add("Bob");
		people.add("Jane");
		people.add(1, "Billy");
		System.out.println(people);
	}

}
