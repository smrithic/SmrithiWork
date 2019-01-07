package objectOrientedProgramming;

public class Friend {
	private String name;
	private int age;
	
	public Friend() 
	{
		name = "";
		age = 0;
		
	}
	public Friend (String n, int a) {
		name = n;
		age = a;
	}
	public void sayMessage()
	{
		System.out.println("You are a great friend");
	}
	
}
