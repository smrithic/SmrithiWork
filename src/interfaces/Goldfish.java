package interfaces;

public class Goldfish implements Fish {
	private double length = 35;
	private int age = 7;
	private String color = "Gold";
	
	public Goldfish(double l, int a, String c) {
		length = l;
		age = a;
		color = c;
	}
	
	public double getLength() {
		return length;
	}
	
	public String toString() {
		return "Fish: goldfish length: " + length + " age: " + age + " color: " + color;
	}
	
	public String getColor() {
		return color;
	}
}
