package apReview;

import java.util.Scanner;

public class MagpieRunner5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Create a Magpie, give it user input, and print its replies.
		 */

		Magpie5 maggie = new Magpie5();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye")) {
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}

	}

}
