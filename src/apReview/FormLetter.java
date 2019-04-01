package apReview;

import java.util.ArrayList;

public class FormLetter {
	private ArrayList<String> lines;
	private ArrayList<Customer> customers;
	private ArrayList<String> replacedlines;
	int pos;

	public ArrayList<String> makeCopy() {
		ArrayList<String> newLines = new ArrayList<String>();
		for (String line : lines) {
			newLines.add(line);
		}
		return newLines;
	}

	// part a
	public String replaceAll(String line, String sub, String repl) {
		do {
			pos = line.indexOf(sub);
			line = line.substring(0, pos) + repl + line.substring(pos + sub.length());
		} while (pos >= 0);
		return line;
	}

	// part b
	public void createPersonalizedLetters() {
		for (Customer c : customers) {
			for (String s : lines) {
				this.replaceAll(s, "&", c.getCity());
				this.replaceAll(s, "@", c.getName());
				this.replaceAll(s, "$", c.getState());
			}
		}
		for (String s : lines) {
			System.out.println(s);
		}
	}

}
