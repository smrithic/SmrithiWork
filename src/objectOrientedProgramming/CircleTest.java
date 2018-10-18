package objectOrientedProgramming;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle bob = new Circle();
bob.changeRadius(3.5);
bob.getCircumference();
bob.getArea();
System.out.println(bob.getArea());
System.out.println(bob.getCircumference());
Circle ball = new Circle(7.5, 3.5, 19.8);
	}

}
