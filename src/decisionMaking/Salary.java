package decisionMaking;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your salary?");
		salary = input.nextInt();
		if (salary == 20000) {
			System.out.println("You are a worker!");
		} else {
			if (salary > 20000 && salary < 40000) {
				System.out.println("You are a manager!");
			} else {
				if (salary > 40000 && salary < 100000) {
					System.out.println("You are a CEO!");
				} else {
					if (salary > 100000) {
						System.out.println("You are the owner!");
					}
				}
			}
		}

		System.out.println("Have a great day!");
	}

}
