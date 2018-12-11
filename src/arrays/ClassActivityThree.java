package arrays;
import java.util.Scanner;
public class ClassActivityThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String [] people = new String[5];

for (int i = 0; i < people.length; i++) {
	System.out.println("Please enter a name");
	people[i] = input.nextLine();
}
System.out.println("In reverse order:");
for(int j = people.length - 1; j >= 0; j--) {
	System.out.println(people [j]);
}


	}

}
