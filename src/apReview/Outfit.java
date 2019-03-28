package apReview;

public class Outfit implements ClothingItem {
	Shoes shoes;
	Pants pants;
	Top top;
	double price;

	public Outfit(Shoes s, Pants p, Top t) {
		shoes = s;
		pants = p;
		top = t;
	}

	ClothingItem outfit = new Outfit(shoes, pants, top);

	public String getDescription() {
		return shoes + "/" + pants + "/" + top + "/ outfit";
	}

	public double getPrice() {
		if(outfit.getPrice() > 100) {
			price = 0.75 * outfit.getPrice();
			return price;
		}
		else {
			price = 0.9 * outfit.getPrice();
			return price;
		}
	}
}
