package mathOperators;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("how old are you?");
		age = input.nextInt();
		age = 18 - age;
		System.out.println("You can vote in " + age + " years.");
		input.close();
	}

}
