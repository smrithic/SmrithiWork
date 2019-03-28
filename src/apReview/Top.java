package apReview;

public class Top implements ClothingItem{
	
	String type = "t-shirt";
	double price = 60;
	
	public Top(String t, double p) {
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
