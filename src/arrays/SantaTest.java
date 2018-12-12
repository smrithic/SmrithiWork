package arrays;

import java.util.Scanner;

public class SantaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int SANTAS = 2;
		SantaClass[] red = new SantaClass[SANTAS];
		int[] santas = new int[SANTAS];

		for (int i = 0; i < santas.length; i++) {

			System.out.println("Please enter the Mall Santa's name");
			String name = input.nextLine();
			System.out.println("Enter their age");
			int age = input.nextInt();
			System.out.println("Enter true or false if they have a criminal record");
			boolean record = input.nextBoolean();
			red[i] = new SantaClass(name, age, record);
			input.nextLine();

		}
		for (int i = 0; i < SANTAS; i++) {
			if (red[i].MallSanta() == true) {
				System.out.println("The employable santas include: " + red[i].getName());

			}
		}
	}

}
