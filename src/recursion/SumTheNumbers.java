package recursion;

public class SumTheNumbers {

	public int sumOne(int num) {
		if (num > 0) {
			return (num + sumOne(num - 1));
		}
		return 0;
	}
}
