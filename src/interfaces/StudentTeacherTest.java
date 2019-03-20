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
		Person peep1 = adult;
		System.out.println("The name of the teacher is: " + peep1.getName());
		System.out.println("The age of the teacher is: " + peep1.getAge());

		peep1 = kid;
		System.out.println("The name of the student is: " + peep1.getName());
		System.out.println("The name of the teacher is: " + peep1.getName());
		
		Teacher adult2 = new Teacher();
		Student kid2 = new Student();
		ArrayList<Person>peep = new ArrayList<Person>();
		peep.add(kid);
		peep.add(kid2);
		peep.add(adult);
		peep.add(adult2);
		
		for(Person p: peep) {
			System.out.println(p.getName());
		}

	}

}
