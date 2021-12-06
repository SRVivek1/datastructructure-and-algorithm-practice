/**
 * 
 */
package viveksingh.dsa.bitwise.operator;

/**
 * @author vivek
 *
 */
public class LeftSiftOperatorPerformanceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 11;
		final int b = 2;
		int loop = 1000000000;

		multiplicationOperstor(a, b, loop);

		bitwiseLeftShoftOperator(a, b, loop);
	}

	/**
	 * Using bitwise right shift operator.
	 * 
	 * @param a
	 * @param b
	 * @param loop
	 */
	@SuppressWarnings("unused")
	private static void bitwiseLeftShoftOperator(int a, final int b, int loop) {
		System.out.println("Using left shift bitwise operator");
		System.out.println("============================================");
		long start = System.currentTimeMillis();

		for (int i = 0; i < loop; i++) {
			for (int j = i; j < loop; j++) {
				long c = a << 1;
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("Execution time : " + (end - start) + "\n");

	}

	/**
	 * Using division operator.
	 * 
	 * @param a
	 * @param b
	 * @param loop
	 */
	@SuppressWarnings("unused")
	private static void multiplicationOperstor(int a, final int b, int loop) {
		System.out.println("Using multiplication operator");
		System.out.println("============================================");
		long start = System.currentTimeMillis();

		for (int i = 0; i < loop; i++) {
			for (int j = i; j < loop; j++) {
				long c = a * b;
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("Execution time : " + (end - start) + "\n");

	}
}

/*
 * Result: 
 * --------------------------------------------
 * 
 * Using multiplication operator 
 * ============================================
 * Execution time : 6
 * 
 * 
 * Using left shift bitwise operator
 * ============================================ 
 * Execution time : 12
 * 
 * 
 */