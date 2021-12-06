package viveksingh.app.factorial;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple FactorialAlgoImpl.
 */
public class FactorialAlgoImplTest {

	private FactorialAlgoImpl factorialAlgoImpl;

	@Before
	public void setup() {
		factorialAlgoImpl = new FactorialAlgoImpl();
	}

	@After
	public void teardown() {
		factorialAlgoImpl = null;
	}

	@Test
	public void testFactorial_input_0() {

		final int input = 0;
		final int result = 1;
		
		assertEquals(factorialAlgoImpl.factorial(input), result);
		
	}
	
	@Test
	public void testFactorial_input_5() {

		final int input = 5;
		final int result = 120;
		
		assertEquals(factorialAlgoImpl.factorial(input), result);
		
	}
}
