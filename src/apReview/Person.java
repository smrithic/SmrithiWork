package apReview;

public class Person {
	private String name;
	private int age;

	public Person(String myName, int myAge) {
		name = myName;
		age = myAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean matches(Person p) {
		if(age == p.getAge() && name.equals(p.getName())) {
			return true;
		}
		return false;
	}
	
}
