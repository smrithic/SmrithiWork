package apReview;

import java.util.ArrayList;

public class Neighborhood {
	ArrayList<Family> families = new ArrayList<Family>();

	public void add(Family newFamily) {
		families.add(newFamily);
	}

	public boolean isinNeighborhood(Person person) {
		for(Family f: families) {
			if(f.isinfam(person)) {
				return true;
			}
		}
		return false;
	}
}
