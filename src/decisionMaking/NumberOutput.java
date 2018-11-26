package decisionMaking;

public class NumberOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 1; i <= 5; i++) {
	int counter = 0;
	for (int j = 5; j >= i; j--) {
		System.out.print(i + counter);
		counter++;
	}
	System.out.print(i + "\n");
}
	}

}
