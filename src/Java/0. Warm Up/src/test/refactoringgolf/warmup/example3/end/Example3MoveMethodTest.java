package refactoringgolf.warmup.example3.end;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static refactoringgolf.warmup.example3.end.PaymentMethod.CASH;
import static refactoringgolf.warmup.example3.end.PaymentMethod.PAYPAL;

import org.junit.Test;

import refactoringgolf.warmup.example3.end.Example3MoveMethod;

public class Example3MoveMethodTest {

	@Test
	public void testGetPrice_ForCashPayment() throws Exception {
		Example3MoveMethod underTest = new Example3MoveMethod(CASH);

		double result = underTest.getPrice(1000.0);

		assertThat(result, is(1000.0));
	}

	@Test
	public void testGetPrice_ForPayPalPayment() throws Exception {
		Example3MoveMethod underTest = new Example3MoveMethod(PAYPAL);

		double result = underTest.getPrice(1000.0);

		assertThat(result, is(1050.0));
	}

}
