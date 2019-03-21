package interfaces;

import java.util.ArrayList;

public class StudentTeacherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Construct a teacher and student object and reference it with their respective
		// object variables
		Teacher adult = new Teacher();
		Student kid = new Student();

		// give the teacher a name
		adult.setName("Jeff Davis");

		// pay the teacher
		adult.payMe();

		// give the student a name
		kid.setName("Bob Mills");

		// have the student be out sick for three days
		kid.outSick();
		kid.outSick();
		kid.outSick();

		// Using the person interface, display the name and age of the teacher and
		// student
		Person someone = adult;
		System.out.println("The name of the teacher is: " + someone.getName());
		System.out.println("The age of the teacher is: " + someone.getAge());

		someone = kid;
		System.out.println("The name of the student is: " + someone.getName());
		System.out.println("The name of the teacher is: " + someone.getName());

		Teacher adult2 = new Teacher();
		Student kid2 = new Student();
		ArrayList<Person> peep = new ArrayList<Person>();
		peep.add(kid);
		peep.add(kid2);
		peep.add(adult);
		peep.add(adult2);

		for (Person p : peep) {
			System.out.println(p.getName());
		}
		// displaying the ages of the people that have aname containing more than 10
		// printable characters
		for (Person p : peep) {
			if (p.getName().length() > 10) {
				System.out.println(p.getAge());
			}
		}
		// make students out sick using the interface and display the names
		for (Person p : peep) {
			if (someone instanceof Student) {
				Student bob = (Student) someone;
				bob.outSick();

			}
		}
		for (Person p : peep) {
			System.out.println(p.getName());
		}

		// pay each teacher and display names of students in array list
		for (Person p : peep) {
			if (someone instanceof Teacher) {
				Teacher john = (Teacher) someone;
				john.payMe();
			}
		}
		for (Person p : peep) {
			if (someone instanceof Student) {
				System.out.println(p.getName());
			}
		}

	}

}
