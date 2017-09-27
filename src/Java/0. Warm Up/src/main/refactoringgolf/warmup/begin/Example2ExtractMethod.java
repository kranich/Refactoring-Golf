package refactoringgolf.warmup.begin;

public class Example3ExtractMethod {

	private int quantity;
	private double itemPrice;

	public Example3ExtractMethod(int quantity, double itemPrice) {
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}

	public double getPrice() {
		double basePrice = quantity * itemPrice;
		double discountFactor;
		if (basePrice > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}

}
