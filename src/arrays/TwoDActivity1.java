package arrays;

import java.util.Scanner;

public class TwoDActivity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int rows = 2;
		int columns = 2;
		String [][] names = new String [rows][columns];
		
		for (rows = 0; rows < names.length; rows++) {
			for(columns = 0; columns < names[0].length; columns++ ) {
				System.out.println("Please enter the names");
				names[rows][columns] = input.nextLine();
			}
		}
		for (rows = 0; rows < names.length; rows++) {
			for(columns = 0; columns < names[0].length; columns++ ) {
				System.out.println(names[rows][columns]);
			}
		}
		for (rows = 0; rows < names.length; rows++) {
			for(columns = 0; columns < names[0].length; columns++ ) {
				int space = names[rows][columns].indexOf(" ");
				System.out.println("The last name is " + names[rows][columns].substring(space + 1));
			}
		}
	}

}
