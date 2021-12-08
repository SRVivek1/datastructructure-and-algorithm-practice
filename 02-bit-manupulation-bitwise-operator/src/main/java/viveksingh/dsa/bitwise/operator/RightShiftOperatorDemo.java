/**
 * 
 */
package viveksingh.dsa.bitwise.operator;

/**
 * @author vivek
 *
 */
public class RightShiftOperatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 10;
		
		// Shift by 1 place
		rightshift(input, 1);
		
		
		// shift by 2 places
		rightshift(input, 2);
		
		rightshift(1000, 1);
	}

	private static void rightshift(int input, int shift) {

		
		System.out.println("*************Start : rightshift(..) by - " + shift);

		String msg = "input >> " + shift + ": ";
		String msg_bin = "input >> " + shift + " (Binary) : ";
		
		System.out.println("Input : " + input);
		System.out.println("Input (Binary) : " + Integer.toBinaryString(input));

		// Right shift operations #1
		
		int result = input >> shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		// Right shift operations #2
		result = result >> shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		// Right shift operations #3
		result = result >> shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		// Right shift operations #4
		result = result >> shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		// Right shift operations #5
		result = result >> shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		System.out.println("*************End : rightshift(..) by - " + shift);
	
	}
}

/**
 * Result
 * ------------
		*************Start : rightshift(..) by - 1
		Input : 10
		Input (Binary) : 1010
		input >> 1: 5
		input >> 1 (Binary) : 101
		input >> 1: 2
		input >> 1 (Binary) : 10
		input >> 1: 1
		input >> 1 (Binary) : 1
		input >> 1: 0
		input >> 1 (Binary) : 0
		input >> 1: 0
		input >> 1 (Binary) : 0
		*************End : rightshift(..) by - 1
		*************Start : rightshift(..) by - 2
		Input : 10
		Input (Binary) : 1010
		input >> 2: 2
		input >> 2 (Binary) : 10
		input >> 2: 0
		input >> 2 (Binary) : 0
		input >> 2: 0
		input >> 2 (Binary) : 0
		input >> 2: 0
		input >> 2 (Binary) : 0
		input >> 2: 0
		input >> 2 (Binary) : 0
		*************End : rightshift(..) by - 2
		*************Start : rightshift(..) by - 1
		Input : 1000
		Input (Binary) : 1111101000
		input >> 1: 500
		input >> 1 (Binary) : 111110100
		input >> 1: 250
		input >> 1 (Binary) : 11111010
		input >> 1: 125
		input >> 1 (Binary) : 1111101
		input >> 1: 62
		input >> 1 (Binary) : 111110
		input >> 1: 31
		input >> 1 (Binary) : 11111
		*************End : rightshift(..) by - 1

 * 
*/