package strings;

import java.util.Scanner;

public class ClassActivity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two names");
		String name1 = input.nextLine();
		String name2 = input.nextLine();
		int compare = name1.compareTo(name2);
		System.out.println(name1.compareTo(name2));
		if (compare > 0) {
			System.out.println("The first name - " + name1 + " - comes first");
		} else {
			if (compare < 0) {
				System.out.println("The second name - " + name2 + " - comes first");
			}
			else {
				System.out.println("They are equal");
			}
		}

	}

}
