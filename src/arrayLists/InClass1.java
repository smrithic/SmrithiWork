package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class InClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name");
		String name = input.nextLine();

		ArrayList<String> people = new ArrayList<String>();
		people.add("Bob Smith");
		people.add("Jane Miller");
		people.add(0, "Billy Jones");
		people.add(name);
		people.remove(1);
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
	}

}
