package strings;
import java.util.Scanner;
public class ClassActivity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter a sentence");
String sentence = input.nextLine();
for (int i = 0; i < sentence.length(); i++) {
	System.out.println(sentence.charAt(i));
	
}
	}

}
