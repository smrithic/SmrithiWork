package objectOrientedProgramming;

public class Greeter {
	private int age = 0;

	public Greeter() {
		age = -999;
	}
	public Greeter(int xage) {
		xage = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int xAge) {
		age = xAge;
	}

	public void sayHello() {
		System.out.println("hello");
	}

	public void sayMessage() {
		// TODO Auto-generated method stub

	}
}
