package decisionMaking;

import java.util.Scanner;

public class LoopOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int multiple;
		System.out.println("Until what number should we do multiples of?");
		multiple = input.nextInt();
		while (count <= multiple) {
			System.out.println(count);
			count = count + 2;
		}

	}

}
