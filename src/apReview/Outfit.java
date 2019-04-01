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
		double pprice = pants.getPrice();
		double sprice = shoes.getPrice();
		double tprice = top.getPrice();
		if (sprice + tprice >= 100 || sprice + pprice >= 100 || pprice + tprice >= 100) {
			return (0.75 * (sprice + tprice + pprice));
		}
		return (0.9 * (pprice + tprice + sprice));
	}
}
