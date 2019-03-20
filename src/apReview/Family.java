package apReview;

import java.util.ArrayList;

public class Family {
	private ArrayList<Person> adult;
	private ArrayList<Person> child;

	public Family(ArrayList<Person> xadult, ArrayList<Person> xchild) {
		adult = xadult;
		child = xchild;
	}

	public void add(Person bob) {
		if (bob.getAge() >= 18) {
			adult.add(bob);
		} else {
			if (bob.getAge() > 0 && bob.getAge() < 18) {
				child.add(bob);
			}
		}
	}

	public Boolean isinfam(Person joe) {
		if (joe.getAge() >= 18) {
			for (Person a : adult) {
				if(a.matches(joe)) {
					return true;
				}
				return false;
			}
		}
		if (joe.getAge() > 0 && joe.getAge() < 18) {
			for (Person c : child) {
				if(c.matches(joe)) {
					return true;
				}
				return false;
			}
		}
		return false;
	}
}
