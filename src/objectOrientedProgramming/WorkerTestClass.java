package objectOrientedProgramming;

public class WorkerTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Worker money = new Worker ();
Worker moneym = new Worker (5, 0.98);
money.getHours();
money.getRate();
money.getPayCheck();
money.changeRate(2.59);
System.out.println(money.getHours());
System.out.println(money.getRate());
System.out.println(money.getPayCheck());
	}

}
