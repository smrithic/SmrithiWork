package designingClasses;

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<Book> story = new ArrayList<Book>();

	public Library() {
		name = "North Library";
		String title = "Hello World";
		int numPages = 50;

		for (int i = 0; i < 10; i++) {
			story.add(new Book(title, numPages));
		}
	}

	public Library(String xname, ArrayList<Book> xstory) {
		name = xname;
		story = xstory;
	}

	public Book checkOut() {
		Book BookCO = story.remove(5);
		return BookCO;

	}

	public Book returnBook() {
		Book BookReturn = story.get(0);
		return BookReturn;
	}

	public void fire() {
		story.removeAll(story);
	}
}
