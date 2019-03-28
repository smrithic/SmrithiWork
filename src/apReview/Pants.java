package apReview;

public class Pants implements ClothingItem{
	String type = "sneakers";
	double price = 40;

	public Pants(String t, double p) {
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
