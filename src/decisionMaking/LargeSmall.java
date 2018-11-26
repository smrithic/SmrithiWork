package decisionMaking;

import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double testScore = 0.0;
double test1;
double test2;
double test3;
while (testScore != 9999) {
	System.out.println("What are your three test scores?");
	test1 = input.nextDouble();
	test2 = input.nextDouble();
	test3 = input.nextDouble();
	if (test1 > test2 && test1 > test3) {
		System.out.println(test1);
	}
	else {
		if (test2 > test3 && test2 > test3) {
			System.out.println(test2);
		}
		else {
			if (test3 > test1 && test3 > test2) {
				System.out.println(test3);
			}
		}
	}
	if (test1 < test2 && test1 < test3) {
		System.out.println(test1);
	}
	else {
		if (test2 < test3 && test2 < test1) {
			System.out.println(test2);
	}
		else {
			if (test3 < test2 && test3 < test1) {
				System.out.println(test3);
		}
}

	}
}
input.close();
	}
}
