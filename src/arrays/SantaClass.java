package arrays;

public class SantaClass {
	private String name;
	private int age;
	private boolean record;
	boolean employable;

	public SantaClass() {
		String name = "bob";
		int age = 5;
		boolean record = true;
	}

	public SantaClass(String xname, int xage, boolean xrecord) {
		name = xname;
		age = xage;
		record = xrecord;
	}

	public String getName() {
		return name;
	}

	public boolean MallSanta() {
		if (age >= 50 && age <= 70) {
			if (record == false) {
				return employable == true;
			}
		}
		return false;
	}

}
