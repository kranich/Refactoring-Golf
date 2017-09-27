package refactoringgolf.warmup.begin;

import refactoringgolf.warmup.begin.example3.PaymentMethod;

public class Example3MoveMethod {

	private PaymentMethod paymentMethod;

	public Example3MoveMethod(PaymentMethod method) {
		paymentMethod = method;
	}

	private double getPaymentMethodFee(double amount, PaymentMethod method) {
		double result;
		if (method.equals(PaymentMethod.PAYPAL)) {
			result = amount * 0.05;
		} else {
			result = 0.0;
		}
		return result;
	}

	public double getPrice(double amount) {
		return amount + getPaymentMethodFee(amount, paymentMethod);
	}

}
