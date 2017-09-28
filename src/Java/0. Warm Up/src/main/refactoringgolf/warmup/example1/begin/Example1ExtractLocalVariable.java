package refactoringgolf.warmup.example1.begin;

public class Example1ExtractLocalVariable {

	public double calculateFinalPrice(double basePrice, double discount) {
		// add tax 19 % tax + 2 EUR shipping fee
		return basePrice - discount + (basePrice - discount) * 0.19 + 2.00;
	}

}
