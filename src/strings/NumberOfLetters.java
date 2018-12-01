package strings;
import java.util.Scanner;
public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter a sentence");
String sentence = input.nextLine();
int vowel = 0;
int consonant = 0;
int punct = 0;
for(int i = 0; i < sentence.length(); i++) {
	char letter = sentence.charAt(i);
	if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
		vowel++;
	}
	else {
		if(letter >= 'a' && letter <= 'z') {
			consonant++;
		}
		else {
			if(letter == '!' || letter == '.' || letter == ',' || letter == '?') {
				punct++;
			}
		}
	}
}
System.out.println("Number of vowels: " + vowel);
System.out.println("Number of consonants: " + consonant);
System.out.println("Number of punctuation marks: " + punct);
	}

}
