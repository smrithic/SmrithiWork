package strings;

import java.util.Scanner;

public class ClassActivty4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sentence = input.nextLine();
		String lowerCase = sentence.toLowerCase();
		System.out.println("The sentence in lower case is " + lowerCase);
	}

}
