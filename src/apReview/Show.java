package apReview;

public class Show {

	private final int SEATS_PER_ROW = 3;
	private final int NUM_ROWS = 2;
	private int[][] seats = new int[NUM_ROWS][SEATS_PER_ROW];
	boolean aisle;

	// row by row for loop for 2d array
	public boolean isAisleSeat(int row, int seatNumber) {
		return seatNumber ==0 || seatNumber == SEATS_PER_ROW-1;
	}

	public boolean twoTogether() {
		for (int r = 0; r < seats.length; r++) {
			for (int c = 0; c < seats[0].length - 1; c++) {
				//could have just done a single if statement with an && in between instead of nested if statements
				if (seats[r][c] == 0) {
					if (seats[r][c + 1] == 0) {
						seats[r][c] = 1;
						seats[r][c + 1] = 1;
						return true;
					}
				}
			}
		}
		return false;
	}

	public int findAdjacent(int row, int seatsNeeded) {
		int count = 1;
		for (int i = 0; i < seats[0].length; i++) {
			if (seats[row][i] == 0) {
				if (seats[row][i + 1] == 0) {
					count++;
				}
			}
			if (count == seatsNeeded) {
				return 1;
			}
		}
		return 0;
	}
}
