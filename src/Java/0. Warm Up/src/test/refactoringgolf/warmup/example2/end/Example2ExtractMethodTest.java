package refactoringgolf.warmup.example2.end;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import refactoringgolf.warmup.example2.end.Example2ExtractMethod;

public class Example2ExtractMethodTest {

	@Test
	public void testGetPrice_BasePriceAbove1000() throws Exception {
		Example2ExtractMethod underTest = new Example2ExtractMethod(10, 200);

		double result = underTest.getPrice();

		assertThat(result, is(2000 * 0.95));
	}

	@Test
	public void testGetPrice_BasePriceIs1000() throws Exception {
		Example2ExtractMethod underTest = new Example2ExtractMethod(10, 100);

		double result = underTest.getPrice();

		assertThat(result, is(1000 * 0.98));
	}

	@Test
	public void testGetPrice_QuantityIsZero() throws Exception {
		Example2ExtractMethod underTest = new Example2ExtractMethod(0, 100);

		double result = underTest.getPrice();

		assertThat(result, is(0.00));
	}
}
