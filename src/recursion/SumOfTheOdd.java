package recursion;

public class SumOfTheOdd {
	public int sumOdd (int num)
	{
		if(num > 0 && num % 2 != 0) {
			return(num + sumOdd(num-2));
		}
		return 0;
	}
}
