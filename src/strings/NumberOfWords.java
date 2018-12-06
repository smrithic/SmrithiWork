package strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int startIdx = 0;
		int nextSpaceIdx = 0;
		boolean complete = false;
		boolean repeat = true;
		int wordCount = 0;
		do {
			startIdx = 0;
			nextSpaceIdx = 0;
			complete = false;
			wordCount = 0;
			System.out.println("Please enter a sentence");
			String sentence = input.nextLine();
			
			do {
				nextSpaceIdx = sentence.indexOf(" ", startIdx);
				if (nextSpaceIdx == -1) {
					if (!sentence.substring(startIdx).isEmpty()) {
						System.out.println(sentence.substring(startIdx));
						wordCount++;
					}
					complete = true;
				} else {
					if (!sentence.substring(startIdx, nextSpaceIdx).isEmpty()) {
						System.out.println(sentence.substring(startIdx, nextSpaceIdx));
						wordCount++;
						//System.out.println(sentence.substring(startIdx, nextSpaceIdx).matches("^[a-zA-Z]*$"));
					}
				}
				startIdx = nextSpaceIdx + 1;
				
			} while (!complete);
			System.out.println("Number of words: " + wordCount);
			System.out.println("Do you want to enter another sentence? Y/N");
			repeat = (input.nextLine().trim().equalsIgnoreCase("N") ? false : true);
		} while (repeat);
	}
}