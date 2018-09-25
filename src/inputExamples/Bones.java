package inputExamples;

import java.util.Scanner;

public class Bones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bones = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many bones have you broken?");
		bones = input.nextInt();
		System.out.println("I have broken " + bones + " bones");

	}

}
