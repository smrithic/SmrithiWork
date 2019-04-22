package apReview;

public class Magpie2 {
	boolean good = false;

	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("cat") >= 0 || statement.indexOf("dog") >= 0) {
			response = "Tell me more about your pets?";
		} else if (statement.indexOf("favorite") >= 0 && statement.indexOf("sport") >= 0
				|| statement.indexOf("favorite") >= 0 && statement.indexOf("activity") >= 0) {
			response = "Wow that so cool!!";
		}
		for (int i = 0; i < statement.length() - 1; i++) {
			if (statement.charAt(i) != ' ') {
				good = true;
			} else if (statement.charAt(i) == ' ') {
				good = false;
			}
			if (good == false) {
				response = "this sucks, you are dumb. enter something in";
			} else {
				response = getRandomResponse();
			}
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}
}
