package apReview;

public class Shoes {
	String type = "sneakers";
	double price = 20;

	public Shoes(String t, double p) {
		type = t;
		price = p;
	}

	public String getDescription() {
		return type;
	}

	public double getPrice() {
		return price;
	}
}
