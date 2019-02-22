package recursion;

public class ReverseOrder {
	public int reverse(int num) {
		if (num < 1) {
			return 0;
		}
		if (num > 1) {
			int temp = num % 10;
			num = (num - temp) / 10;
			System.out.print(temp);
			return reverse(num);
		}
		return 1;
	}
}
