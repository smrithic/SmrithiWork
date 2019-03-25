package interfaces;

public class Trout implements Fish {
	private double length = 23;
	private int age = 4;
	private double numScales = 10;

	public Trout(double l, int a, double ns) {
		length = l;
		age = a;
		numScales = ns;
	}

	public double getLength() {
		return length;
	}

	public String toString() {
		return "Fish: trout " + " length: " + length + " age: " + age + " number of scales: " + numScales;
	}

	public int getAge() {
		return age;
	}
	
	public double getScales() {
		return numScales;
	}
}
