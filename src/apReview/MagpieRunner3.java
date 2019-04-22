package apReview;

import java.util.Scanner;

public class MagpieRunner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magpie3 maggie = new Magpie3();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye")) {
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
