package arrays;

import java.util.Scanner;

public class SplitClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sentence = input.nextLine() + " ";
		System.out.println("Please enter a key word");
		String word = input.nextLine();
		int counter = 0;
		
		//Displaying the key word instances
		String [] key = sentence.split(" ");
		for (int i = 0; i < key.length; i++) {
			if(key[i].contains(word)) {
				counter++;
			}
		}
		System.out.println("The number of times " + word + " appears is " + counter);
	}

}
