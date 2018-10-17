package objectOrientedProgramming;

public class WageTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee bob = new Employee();
		bob.setWage(8.90);
		System.out.println(bob.getWage());
		bob.setExperience(7);
		System.out.println(bob.getExperience());
		bob.setRaise();
		System.out.println(bob.getRaise());
	}

}
