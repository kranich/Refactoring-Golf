package refactoringgolf.warmup.end;

public class Example3ExtractMethod {

	private int quantity;
	private double itemPrice;

	public Example3ExtractMethod(int quantity, double itemPrice) {
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}

	public double getPrice() {
		return basePrice() * discountFactor();
	}

	private double discountFactor() {
		if (basePrice() > 1000) {
			return 0.95;
		} else {
			return 0.98;
		}
	}

	private double basePrice() {
		return quantity * itemPrice;
	}

}
