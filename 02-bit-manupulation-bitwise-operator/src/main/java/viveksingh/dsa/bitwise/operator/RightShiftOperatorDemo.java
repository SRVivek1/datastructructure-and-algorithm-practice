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
		System.out.println("Input : " + input);
		System.out.println("Input (Binary) : " + Integer.toBinaryString(input));

		// Right shift operations #1
		int result = input >> 1;
		System.out.println("input >> 1 : " + result);
		System.out.println("input >> 1 (Binary) : " + Integer.toBinaryString(result));

		// Right shift operations #2
		result = result >> 1;
		System.out.println("input >> 1 : " + result);
		System.out.println("input >> 1 (Binary) : " + Integer.toBinaryString(result));
		
		// Right shift operations #3
		result = result >> 1;
		System.out.println("input >> 1 : " + result);
		System.out.println("input >> 1 (Binary) : " + Integer.toBinaryString(result));
		
		// Right shift operations #4
		result = result >> 1;
		System.out.println("input >> 1 : " + result);
		System.out.println("input >> 1 (Binary) : " + Integer.toBinaryString(result));
		
		// Right shift operations #5
		result = result >> 1;
		System.out.println("input >> 1 : " + result);
		System.out.println("input >> 1 (Binary) : " + Integer.toBinaryString(result));
	}

}
