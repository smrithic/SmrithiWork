package interfaces;

public class Cat implements Animal {
	private String name = "Robert";
	private int age = 3;
	private boolean friendly = false;

	public void act() {
		age += 9;
		if (friendly == true) {
			friendly = false;
		}
		if (friendly == false) {
			friendly = true;
		}
	}
	public String toString() {
		return "Cat name: " + name + " age: " + age + " friendly: " + friendly;
	}
	
	public boolean returnFriendly() {
		return friendly;
	}

}
