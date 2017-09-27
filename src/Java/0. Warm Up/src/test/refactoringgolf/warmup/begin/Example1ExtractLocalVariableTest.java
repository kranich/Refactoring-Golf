package refactoringgolf.warmup.begin;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import refactoringgolf.warmup.begin.Example1ExtractLocalVariable;

public class Example1ExtractLocalVariableTest {

	@Test
	public void testCalculateFinalPrice() throws Exception {

		Example1ExtractLocalVariable underTest = new Example1ExtractLocalVariable();

		assertThat(underTest.calculateFinalPrice(4.99, 1.00), is((4.99 - 1.00) * 1.19 + 2.00));

	}

}
