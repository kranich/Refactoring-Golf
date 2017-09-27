package refactoringgolf.warmup.end;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Example1ExtractLocalVariableTest {

	@Test
	public void testCalculateFinalPrice() throws Exception {
		Example1ExtractLocalVariable underTest = new Example1ExtractLocalVariable();

		double result = underTest.calculateFinalPrice(4.99, 1.00);

		assertThat(result, is((4.99 - 1.00) * 1.19 + 2.00));
	}

}
