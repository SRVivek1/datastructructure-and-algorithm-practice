/**
 * 
 */
package viveksingh.dsa.bitwise.operator;

/**
 * @author vivek
 *
 */
public class LeftShiftOperatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 10;
		
		// Shift by 1 place
		leftshift(input, 1);
		
		
		// shift by 2 places
		leftshift(input, 2);
		
		leftshift(1000, 1);
	}

	private static void leftshift(int input, int shift) {
		
		System.out.println("*************Start : leftshift(..) by - " + shift);

		String msg = "input << " + shift + ": ";
		String msg_bin = "input << " + shift + " (Binary) : ";
		
		System.out.println("Input : " + input);
		System.out.println("Input (Binary) : " + Integer.toBinaryString(input));

		// Right shift operations #1
		
		int result = input << shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		// Right shift operations #2
		result = result << shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		// Right shift operations #3
		result = result << shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		// Right shift operations #4
		result = result << shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		// Right shift operations #5
		result = result << shift;
		System.out.println(msg + result);
		System.out.println(msg_bin + Integer.toBinaryString(result));

		System.out.println("*************End : leftshift(..) by - " + shift);
	
		
	}

}


/**
 * Result
 * --------------
 * 
 * 
		*************Start : leftshift(..) by - 1
		Input : 10
		Input (Binary) : 1010
		input << 1: 20
		input << 1 (Binary) : 10100
		input << 1: 40
		input << 1 (Binary) : 101000
		input << 1: 80
		input << 1 (Binary) : 1010000
		input << 1: 160
		input << 1 (Binary) : 10100000
		input << 1: 320
		input << 1 (Binary) : 101000000
		*************End : leftshift(..) by - 1
		*************Start : leftshift(..) by - 2
		Input : 10
		Input (Binary) : 1010
		input << 2: 40
		input << 2 (Binary) : 101000
		input << 2: 160
		input << 2 (Binary) : 10100000
		input << 2: 640
		input << 2 (Binary) : 1010000000
		input << 2: 2560
		input << 2 (Binary) : 101000000000
		input << 2: 10240
		input << 2 (Binary) : 10100000000000
		*************End : leftshift(..) by - 2
		*************Start : leftshift(..) by - 1
		Input : 1000
		Input (Binary) : 1111101000
		input << 1: 2000
		input << 1 (Binary) : 11111010000
		input << 1: 4000
		input << 1 (Binary) : 111110100000
		input << 1: 8000
		input << 1 (Binary) : 1111101000000
		input << 1: 16000
		input << 1 (Binary) : 11111010000000
		input << 1: 32000
		input << 1 (Binary) : 111110100000000
 		*************End : leftshift(..) by - 1
 * 
*/