/**
 * Reverse the provided string.
 */
package viveksingh.interview.reverse;

/**
 * @author vivek
 *
 */
public class ReverseStringByLetters {

	public static void main(String... args) {

		String input = "Hi this is Vivek Singh.";

		// Approach - 1 - Two arrays
		long start = System.currentTimeMillis();
		String result = reverseBruteForceSolution(input);
		long end = System.currentTimeMillis();
		System.out.println("Execution time (ms) : " + (end - start));

		System.out.println("Input  : " + input);
		System.out.println("Output : " + result);

		// Approach - 2 - one char array
		start = System.currentTimeMillis();
		result = reverseString_space_optimized(input);
		end = System.currentTimeMillis();
		System.out.println("Execution time (ms) : " + (end - start));

		System.out.println("Input  : " + input);
		System.out.println("Output : " + result);

		// Approach - 3 - StringBuilder/StringBuffer API
		start = System.currentTimeMillis();
		result = reverseString_StringBuilder_reverse_api(input);
		end = System.currentTimeMillis();
		System.out.println("Execution time (ms) : " + (end - start));

		System.out.println("Input  : " + input);
		System.out.println("Output : " + result);

		// Approach - 4 - BytesArray
		start = System.currentTimeMillis();
		result = reverseString_byte_array(input);
		end = System.currentTimeMillis();
		System.out.println("Execution time (ms) : " + (end - start));

		System.out.println("Input  : " + input);
		System.out.println("Output : " + result);

	}

	/**
	 * Converting String to byte array.
	 */
	public static String reverseString_byte_array(String input) {

		System.out.println("\nMethod : reverseString_byte_array");

		// validate input
		if (input == null || input.length() < 2) {
			return input;
		}

		byte[] dataByteArray = input.getBytes();
		byte[] temp = new byte[dataByteArray.length];

		for (int i = 0; i < dataByteArray.length; i++) {
			temp[i] = dataByteArray[dataByteArray.length - i - 1];
		}

		return new String(temp);
	}

	/**
	 * Using StringBuilder inbuilt reverse().
	 */
	public static String reverseString_StringBuilder_reverse_api(String input) {

		System.out.println("\nMethod : reverseString_StringBuilder_reverse_api");

		// validate input
		if (input == null || input.length() < 2) {
			return input;
		}

		// Use StringBuilder reverse method.
		return new StringBuilder(input).reverse().toString();

	}

	/**
	 * Optimized solution for O(1) space complexity.
	 */
	public static String reverseString_space_optimized(String input) {

		System.out.println("\nMethod : reverseString_space_optimized");

		// validate input
		if (input == null || input.length() < 2) {
			return input;
		}

		// Convert data to array
		char[] data = input.toCharArray();

		// Use a temp vairable to swap the data from reverse.
		int forwardIndex = 0;
		int reverseIndex = input.length() - 1; // last index

		while (forwardIndex < reverseIndex) {
			char temp = data[forwardIndex];
			data[forwardIndex] = data[reverseIndex];
			data[reverseIndex] = temp;
			forwardIndex++;
			reverseIndex--;
		}

		// return string copy of reversed array
		return new String(data);
	}

	/**
	 * Brute force solution.
	 */
	public static String reverseBruteForceSolution(String input) {

		System.out.println("method : reverseBruteForceSolution");

		// Check for valid input.
		if (input == null || input.length() < 2) {
			return input;
		}

		// Convert srting to array
		char[] data = input.toCharArray();

		// temp array to store reverse data
		char[] temp = new char[data.length];

		for (int i = data.length - 1, j = 0; i >= 0; i--) {
			temp[j++] = data[i];
		}

		// Convert reversed array in string and return.
		return new String(temp);
	}

}
