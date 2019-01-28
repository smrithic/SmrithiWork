package designingClasses;

import java.util.ArrayList;

public class Student {
	private String name;
	private double sum;
	private int counter;
	private ArrayList<Integer> scores = new ArrayList<Integer>();

	public Student() {
		name = "Bob Smith";
	}
	
	public void addaScore(int testscore) {
		scores.add(testscore);
		sum += testscore;
		counter++;
	}
	
	public double averageScore() {
		double average = 0;
		average = (sum/counter) * 100;
		return average;
	}
	
}
