package designingClasses;

public class Book {
	private String title;
	private int numPages;

	public Book() {
		title = "Hello World";
		numPages = 100;
	}

	public Book(String xtitle, int xnumPages) {
		title = xtitle;
		numPages = xnumPages;
	}

	public String getTitle() {
		return title;
	}

	public int getPages() {
		return numPages;
	}
}
