package refactoringgolf.warmup.example3.end;

public class Example3MoveMethod {

	private PaymentMethod paymentMethod;

	public Example3MoveMethod(PaymentMethod method) {
		paymentMethod = method;
	}

	public double getPrice(double amount) {
		return amount + paymentMethod.getFee(amount);
	}

}
