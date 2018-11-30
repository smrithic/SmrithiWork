package strings;
import java.util.Scanner;
public class ClassActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter a sentence");
String sentence = input.nextLine();
int letter = (sentence.indexOf('A'));
System.out.println("The letter A comes in at " + letter) ;
	}

}
