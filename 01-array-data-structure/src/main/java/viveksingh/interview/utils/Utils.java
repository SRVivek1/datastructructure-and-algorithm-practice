/**
 * 
 */
package viveksingh.interview.utils;

/**
 * @author vivek
 *
 */
public final class Utils {

	/**
	 * Print array content.
	 * 
	 * @param arr
	 * @param msg
	 */
	public static void printData(int[] arr, String msg) {
		printData(msg, arr);
	}

	/**
	 * Print array content.
	 * 
	 * @param msg
	 * @param arr
	 */
	public static void printData(String msg, int[] arr) {

		System.out.print(msg);

		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}
}
