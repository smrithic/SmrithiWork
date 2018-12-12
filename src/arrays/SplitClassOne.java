package arrays;

import java.util.Scanner;

public class SplitClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sentence = input.nextLine() + " ";
		
//splitting the sentence
		String[] letters = sentence.split(" ");
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i].charAt(0));
		}
	}

}
