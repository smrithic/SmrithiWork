package strings;
import java.util.Scanner;
public class ClassActivity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter your social security number(with hyphens & no spaces)");
String social = input.nextLine();
System.out.println("The last four digits are " + social.substring(7));
System.out.println("The middle two digits are " + social.substring(4, 6));
System.out.println("The first three numbers are " + social.substring(0,3));



	}

}
