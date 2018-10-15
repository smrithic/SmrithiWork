package objectOrientedProgramming;

import java.util.Scanner;

public class SandboxTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandbox bob = new Sandbox();
		bob.SandV1();
		Scanner input = new Scanner(System.in);
		int length = 0;
		int width = 0;
		int height = 0;
		int volume = 0;
		int rate = 0;
		int hours = 0;
		System.out.println("What is the length of the sandbox?");
		length = input.nextInt();
		System.out.println("What is the width of the sandbox?");
		width = input.nextInt();
		System.out.println("What is the height of the sandbox?");
		height = input.nextInt();
		System.out.println("how much sand can you pass in cubic feet per hour?");
		rate = input.nextInt();
		volume = length * width * height;
		hours = volume / rate;
		bob.Sandprism(5, 6, 4, 10);

	}

}
