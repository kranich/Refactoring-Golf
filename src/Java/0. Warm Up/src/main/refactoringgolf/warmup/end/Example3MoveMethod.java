package refactoringgolf.warmup.end;

import refactoringgolf.warmup.end.example3.PaymentMethod;

public class Example3MoveMethod {

	private PaymentMethod paymentMethod;

	public Example3MoveMethod(PaymentMethod method) {
		paymentMethod = method;
	}

	public double getPrice(double amount) {
		return amount + paymentMethod.getFee(amount);
	}

}
