package decisionMaking;

import java.util.Scanner;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
double experience;
double height;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
System.out.println("How many years of experience do you have?");
experience = input.nextDouble();
System.out.println("What is your height?");
height = input.nextDouble();

if(age >= 50 && Math.abs(experience - 10.5)< 0.0000000001 && height < 70) {
	System.out.println("You get a promotion!");
}
	else {
		System.out.println("You do not get a promotion.");
	}
if (age >= 50 && Math.abs(experience - 10.5)< 0.0000000001 && height > 80 ) {
	System.out.println("You get a promotion!");
}
else {
	System.out.println("You do not get a promotion.");
}
if (age < 50 && (height >= 70 || height <= 80)){
	System.out.println("You get a promotion!");
}
else {
	System.out.println("You do not get a promotion.");
}
System.out.println("Have a good day");
	}

}
