package searching;

import java.util.Random;
import objectOrientedProgramming.Circle;
import objectOrientedProgramming.Rectangle;

import java.util.ArrayList;

public class CircleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		ArrayList<Circle> shapes = new ArrayList<Circle>();
		int min = 0;
		int max = 10;
		int randomNum = 0;
		int counter = 0;
		for (int i = 0; i < 100; i++) {
			randomNum = min + generator.nextInt(max - min + 1);
			shapes.add(new Circle(randomNum));
		}
		
		randomNum = min + generator.nextInt(max - min + 1);
		double areaMatch = shapes.get(0).area();
		for(Circle oneHoop: shapes) {
			if(Math.abs(oneHoop.area() - areaMatch) <= 0.0001) {
				counter++;
			}
		}
		System.out.println("How many circle objects have the same area as the first circle object? " + counter + " objects");

	}

}
