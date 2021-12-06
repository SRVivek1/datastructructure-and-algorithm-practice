/**
 * 
 */
package viveksingh.dsa.bitwise.determine.odd.even;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vivek
 *
 */
public class FindOddEvenNumbersUsingBitwiseOperator {

	public static void main(String[] args) {

		int range = 10000;

		divisionOperator(range);

		bitwiseOperatorLastBitCheck(range);
	}

	/**
	 * Find all odd and even numbers in given range using bitwise operator.
	 * 
	 * @param range
	 */
	private static void bitwiseOperatorLastBitCheck(int range) {

		System.out.println("\nFind odd-even numbers using '&' operator : \n");

		List<Integer> oddNumbers = new ArrayList<>();
		List<Integer> evenNumbers = new ArrayList<>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < range; i++) {
			if ((i & 1) == 0) {
				// even number
				evenNumbers.add(Integer.valueOf(i));
			} else {
				// odd number
				oddNumbers.add(Integer.valueOf(i));
			}
		}
		long end = System.currentTimeMillis();

		System.out.println("Executing time : " + (end - start));
		System.out.println("Even numbers : " + evenNumbers);
		System.out.println("Odd numbers : " + oddNumbers);
	}

	/**
	 * Find all odd and even numbers in given range
	 * 
	 * @param range
	 */
	private static void divisionOperator(int range) {

		System.out.println("\nFind odd-even numbers using modulo operator : \n");

		List<Integer> oddNumbers = new ArrayList<>();
		List<Integer> evenNumbers = new ArrayList<>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < range; i++) {
			if (i % 2 == 0) {
				// even number
				evenNumbers.add(Integer.valueOf(i));
			} else {
				// odd number
				oddNumbers.add(Integer.valueOf(i));
			}
		}
		long end = System.currentTimeMillis();

		System.out.println("Executing time : " + (end - start));
		System.out.println("Even numbers : " + evenNumbers);
		System.out.println("Odd numbers : " + oddNumbers);
		System.out.println();
	}
}

/*
 * Result: ---------------------------
 * 
 * 
 * Find odd-even numbers using modulo operator :
 * 
 * Executing time : 5 
 * 
 * Even numbers : [0, 2, 4, 6, 8, 10, 12, 14, ......, 9986,
 * 9988, 9990, 9992, 9994, 9996, 9998] 
 * 
 * Odd numbers : [1, 3, 5, 7, 9, 11, 13, 15,
 * 17, ......, 9987, 9989, 9991, 9993, 9995, 9997, 9999]
 * 
 * 
 * Find odd-even numbers using '&' operator :
 * 
 * Executing time : 2 
 * 
 * Even numbers : [0, 2, 4, 6, 8, 10, 12, 14, ......, 9986,
 * 9988, 9990, 9992, 9994, 9996, 9998] 
 * 
 * Odd numbers : [1, 3, 5, 7, 9, 11, 13, 15,
 * 17, ....., 9987, 9989, 9991, 9993, 9995, 9997, 9999]
 * 
 */