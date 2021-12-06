package viveksingh.app.factorial;

/**
 * Factorial Algo. Implementation
 *
 */
public class FactorialAlgoImpl {

	/**
	 * Find Factorial for the provided number.
	 * 
	 * @param number
	 * @return
	 */
	public long factorial(int number) {
		
		// Factorial of 0 is 1
		if (number == 0) {
			return 1;
		}

		// Else - n * (n-1) * .....
		return (number * factorial(number - 1));
	}
}
