package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class InClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name = input.nextLine();
		
		ArrayList<String> people = new ArrayList<String>();
		people.add("Bob");
		people.add("Jane");
		people.add(1, "Billy");
		people.add(name);
		
		System.out.println(people);
	}

}
