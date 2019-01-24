package arrays;

import java.util.Scanner;

public class ClassActivityFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String [] people = new String[20];

		for (int i = 0; i <= 20; i++) {
			System.out.println("Please enter a name");
			people[i] = input.nextLine();
		}
		System.out.println("Please enter a letter");
		String letter = input.nextLine();
		for (int i = 0; i <people.length; i++) {
			if(people[i].charAt(people[i].length()-1) == letter.charAt(0)) {
				System.out.println(people[i]);
			}
		}
	}

}
