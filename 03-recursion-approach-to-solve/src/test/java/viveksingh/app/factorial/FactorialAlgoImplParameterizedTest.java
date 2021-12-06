package viveksingh.app.factorial;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Unit test for simple FactorialAlgoImpl.
 */
@RunWith(Parameterized.class)
public class FactorialAlgoImplParameterizedTest {

	private FactorialAlgoImpl factorialAlgoImpl;

	private int input;

	private long result;

	/**
	 * @param input
	 * @param result
	 */
	public FactorialAlgoImplParameterizedTest(int input, long result) {
		super();
		this.input = input;
		this.result = result;
	}

	@Before
	public void setup() {
		factorialAlgoImpl = new FactorialAlgoImpl();
	}

	@After
	public void teardown() {
		factorialAlgoImpl = null;
	}

	@Parameters
	public static Collection<Integer[]> prepareTestData() {
		return Arrays.asList(new Integer[][] { { 0, 1 }, { 5, 120 } });
	}

	@Test
	public void testFactorial() {

		assertEquals(factorialAlgoImpl.factorial(input), result);

	}
}
