package decisionMaking;

import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList primeNumbers = new ArrayList();
		System.out.println("Please enter a number");
		int number = input.nextInt();
		boolean not_complete = true;
		boolean primeNumber = true;
		for (int i = 1; i <= number; i++) {
			primeNumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					// i is a factor of the number
					primeNumber = false;
					break;
				}
			}
			if (primeNumber) {
				primeNumbers.add(Integer.valueOf(i));
			}
		}
		System.out.println(primeNumbers);
		int count = 1;
		int number_temp = number;
		do {
			for (int x=1; x < primeNumbers.size(); x++) {
				if (number_temp %  (Integer) primeNumbers.get(x) == 0) {
					number_temp = number_temp / (Integer) primeNumbers.get(x);
					System.out.println("factor "+count + " : "+ primeNumbers.get(x));
					count++;
					not_complete = (number_temp == 1) ? false : true;
					break;
				}
			}
		} while (not_complete);
		System.out.println("finishing!!!");
	}
}