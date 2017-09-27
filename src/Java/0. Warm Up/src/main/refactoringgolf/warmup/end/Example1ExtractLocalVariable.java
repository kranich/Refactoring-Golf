package refactoringgolf.warmup.end;

public class Example1ExtractLocalVariable {

	public double calculateFinalPrice(double basePrice, double discount) {
		double discountedPrice = basePrice - discount;
		double tax = discountedPrice * 0.19;
		double shippingFee = 2.00;

		return discountedPrice + tax + shippingFee;
	}

}
