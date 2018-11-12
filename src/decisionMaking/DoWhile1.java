package decisionMaking;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter a number");
		int number = input.nextInt();
		
		int highest = number;
		int lowest = number;
		
		do {
			System.out.println("Please enter a number");
			number = input.nextInt();
			
			if (number < lowest) 
			{
				lowest = number;
			} 
			
			else 
			{
				
				if (number > highest) 
				{
					highest = number;
				} 
			}
			System.out.println(highest - lowest);
		} while (Math.abs(number - 9999) < 0.001);

		input.close();
	}

}
