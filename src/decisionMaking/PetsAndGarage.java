package decisionMaking;
import java.util.Scanner;
public class PetsAndGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int pets;
int cars;
System.out.println("how many pets do you have?");
pets = input.nextInt();
System.out.println("how many cars do you have?");
cars = input.nextInt();
System.out.println(pets >= 5 || cars > 3);
	}

}
