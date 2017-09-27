package refactoringgolf.warmup.end.example3;

public enum PaymentMethod {

	PAYPAL(0.05), CASH(0.0);

	private double fee;

	private PaymentMethod(double fee) {
		this.fee = fee;
	}

	public double getFee(double amount) {
		return amount * fee;
	}

}
