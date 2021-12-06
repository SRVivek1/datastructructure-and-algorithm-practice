/**
 * 
 */
package viveksingh.dsa.bitwise.operator;

/**
 * @author vivek
 *
 */
public class RightSiftOperatorPerformanceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 11;
		int b = 2;
		int loop = 1000000000;

		divisionOperstor(a, b, loop);

		bitwiseRightShoftOperator(a, b, loop);
	}

	/**
	 * Using bitwise right shift operator.
	 * 
	 * @param a
	 * @param b
	 * @param loop
	 */
	@SuppressWarnings("unused")
	private static void bitwiseRightShoftOperator(int a, int b, int loop) {
		System.out.println("Using right shift bitwise operator");
		System.out.println("============================================");
		long start = System.currentTimeMillis();

		for (int i = 0; i < loop; i++) {
			for (int j = i; j < loop; j++) {
				int c = a >> 1;
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
	private static void divisionOperstor(int a, int b, int loop) {
		System.out.println("Using Division operator");
		System.out.println("=============================");
		long start = System.currentTimeMillis();

		for (int i = 0; i < loop; i++) {
			for (int j = i; j < loop; j++) {
				int c = a / b;
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("Execution time : " + (end - start) + "\n");

	}
}


/*
 * Result: 
 * -------------------------------------------------- 
 * Using Division operator 
 * ============================= 
 * Execution time : 1339
 * 
 * 
 * Using right shift bitwise operator
 * ============================================ 
 * Execution time : 17
 * 
 */