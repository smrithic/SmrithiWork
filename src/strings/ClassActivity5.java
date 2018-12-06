package strings;

import java.util.Scanner;

public class ClassActivity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int difference = 1;
boolean correct=false;
do{
	System.out.println("Please enter your password");
	String password = input.nextLine();
	System.out.println("Please verify your password");
	String verify = input.nextLine();
	difference = password.compareTo(verify);
	if(difference==0)
	{
		correct = true;
	}
}
while(correct!=true);
	}

}
