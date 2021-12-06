package viveksingh.app.fibonacci;

/**
 * Fibonacci algo. implementation.
 *
 */
public class FibonacciRecursionAlgoImpl {

	/**
	 * Find and return the fibonacci value on provided index.
	 * 
	 * @param index
	 * @return
	 */
	public long findFibonacciValue(int index) {

		// Negative index not supported
		if (index < 1) {
			throw new RuntimeException("Invalid Fibonacci series index number.");
		}

		// First 2 index of Fibonacci is reserved for 0 & 1.
		if (index <= 2) {
			return index - 1;
		}

		// Calculate the value
		return (findFibonacciValue(index - 1) + findFibonacciValue(index - 2));
	}
}
