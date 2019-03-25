package interfaces;

import java.util.Random;

public class Dog implements Animal {
	private String name = "Patches";
	private int age = 5;
	private boolean injured;
	double randomNum;
	Random generator = new Random();

	public void act() {
		injured = false;
		age += 7;
		randomNum = 1 + generator.nextInt(50);
		if (randomNum == 1) {
			injured = true;
		}
	}

	public String toString() {
		return "Dog name: " + name + " age: " + age + " injured: " + injured;
	}
	
	public void vet() {
		injured = false;
	}
}
