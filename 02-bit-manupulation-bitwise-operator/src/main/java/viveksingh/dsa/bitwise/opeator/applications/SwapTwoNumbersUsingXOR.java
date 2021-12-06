/**
 * 
 */
package viveksingh.dsa.bitwise.opeator.applications;

import viveksingh.dsa.utils.ArrayUtils;

/**
 * @author vivek
 *
 */
public class SwapTwoNumbersUsingXOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] t1 = { 20, 10 };
		int[] t2 = { 50, 20 };
		int[] t3 = { 10, 50 };

		System.out.println("Using arithematic operators :");
		System.out.println("=========================================");
		swapNumbersWithoutUsing3rdVariable(t1);
		swapNumbersWithoutUsing3rdVariable(t2);
		swapNumbersWithoutUsing3rdVariable(t3);

		System.out.println("Using bitwise operators :");
		System.out.println("=========================================");
		swapNumbersUsingXOROperator(t1);
		swapNumbersUsingXOROperator(t2);
		swapNumbersUsingXOROperator(t3);
	}

	/**
	 * Swap numbers using XOR bitwise operator without extra space.
	 * 
	 * @param test
	 */
	private static void swapNumbersUsingXOROperator(int[] test) {

		ArrayUtils.printArray(test, "Input array : ");
		test[0] = Math.abs(test[0] ^ test[1]);
		test[1] = Math.abs(test[0] ^ test[1]);
		test[0] = Math.abs(test[0] ^ test[1]);

		ArrayUtils.printArray(test, "Result Array : ");
		System.out.println("\n=========================================");
		
	}

	/**
	 * Swap numbers using arithmetic operators without extra space.
	 * 
	 * @param test
	 */
	private static void swapNumbersWithoutUsing3rdVariable(int[] test) {

		ArrayUtils.printArray(test, "Input array : ");
		test[0] = Math.abs(test[0] + test[1]);
		test[1] = Math.abs(test[0] - test[1]);
		test[0] = Math.abs(test[0] - test[1]);

		ArrayUtils.printArray(test, "Result Array : ");
		System.out.println("\n=========================================");
	}
}


/*
 * Result 
 * ------------------------
 * 
 * Using arithematic operators : 
 * ========================================= 
 * Input array : [20, 10, ] Result Array : [10, 20, ]
 * 
 * ========================================= 
 * Input array : [50, 20, ] 
 * Result Array : [20, 50, ]
 * 
 * ========================================= 
 * Input array : [10, 50, ] 
 * Result Array : [50, 10, ]
 * 
 * ========================================= 
 * 
 * Using bitwise operators :
 * ========================================= 
 * Input array : [10, 20, ] 
 * Result Array : [20, 10, ]
 * 
 * ========================================= 
 * Input array : [20, 50, ]
 * Result Array : [50, 20, ]
 * 
 * ========================================= 
 * Input array : [50, 10, ]
 * Result Array : [10, 50, ]
 * 
 * =========================================
 */