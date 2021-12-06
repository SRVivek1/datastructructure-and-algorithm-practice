package viveksingh.app.fibonacci;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Unit test for simple FibonacciAlgoImpl.
 */
@RunWith(Parameterized.class)
public class FibonacciRecursionAlgoImplTest {

	private FibonacciRecursionAlgoImpl fibonacciAlgoImpl;

	private int index;

	private long result;

	@Before
	public void setup() {
		fibonacciAlgoImpl = new FibonacciRecursionAlgoImpl();
	}

	@After
	public void teardown() {
		fibonacciAlgoImpl = null;
	}

	/**
	 * @param index
	 * @param result
	 */
	public FibonacciRecursionAlgoImplTest(int index, long result) {
		super();
		this.index = index;
		this.result = result;
	}

	@Parameters
	public static Collection<Integer[]> testData() {
		return Arrays.asList(new Integer[][] { { 4, 2 }, { 10, 34 } });
	}

	@Test
	public void testfindFibonacciValue() {
		assertEquals(result, fibonacciAlgoImpl.findFibonacciValue(index));
	}

}
