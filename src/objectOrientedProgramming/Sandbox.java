package objectOrientedProgramming;

import java.util.Scanner;

public class Sandbox {

	public Sandbox() {

	}

	public void SandV1() {
		Scanner input = new Scanner(System.in);
		int length = 0;
		int width = 0;
		int depth = 0;
		int rate = 0;
		int volume = 0;
		int hours = 0;
		System.out.println("What is the length of the sandbox?");
		length = input.nextInt();
		System.out.println("What is the width of the sandbox?");
		width = input.nextInt();
		System.out.println("What is the depth of the sandbox?");
		depth = input.nextInt();
		System.out.println("How fast can you transport sand in cubic feet per hour?");
		rate = input.nextInt();
		volume = length * width * depth;
		hours = volume / rate;
		System.out.println("It will take " + hours + " hours to fill the sandbox");
	}

	public void Sandprism(double length, double width, double height, double rate) {
		double volume = width * height * length;
		double hours = volume / rate;
		System.out.println("It will take " + hours + " hours to fill the sandbox");
	}

	public double SandV3(double length, double width, double height, double rate) {
		double volume = width * height * length;
		double hours = volume / rate;
		System.out.println("It will take " + hours + " to fill the sand box");
		return hours;
	}
}
