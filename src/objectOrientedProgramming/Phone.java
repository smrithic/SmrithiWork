package objectOrientedProgramming;

public class Phone {
private int phoneNumber;
private int speedDial;
private int lastNumber;
private final int EMERGENCY = 911;
private int numberCalls;
private double numberMinutes; 


	public Phone() {
		
	}
	public Phone(int newP, int newS, int newL, int newC, double newM) {
		phoneNumber = newP;
		speedDial = newS;
		lastNumber = newL;
		numberCalls = newC;
		numberMinutes = newM;
	}
	
	public int phoneNumber(int newP) {
		return phoneNumber;
	}
	public int speedDial(int newS) {
		return speedDial;
	}
	public int lastNumber(int newL) {
		return lastNumber;
	}
	public int numberCalls(int newC) {
		return numberCalls;
	}
	public double numberMinutes(double newM) {
		return numberMinutes;
	}
	public double makeCall(int newL, double newM) {
		return newM;
		
	}
	
	
}
