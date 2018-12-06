package strings;

public class Essay {

	private String name = "";
	private String essay = "Hello World";
	int numChar = 0;
	boolean letter = true;
	int words = 0;

	public Essay() {

	}

	public void Name(String xName) {
		name = xName;
	}

	public int NumChar() {
		numChar = name.length();
		return numChar;
	}

	public boolean Letter() {
		if (name.contains("X") == true) {
			return true;
		}
		return false;
	}

	public String UpperCase() {
		int space = name.indexOf(" ");
		String lastName = name.substring(space);
		String Caps = lastName.toUpperCase();
		return Caps;
	}

	public int Essay() {
		int words = 1;
		for (int i = 0; i < essay.length(); i++) {
			if(essay.charAt(i) == ' ') {
				words++;
			}
		}
		return words;
	}

}
