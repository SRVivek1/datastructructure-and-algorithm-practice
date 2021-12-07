/**
 * 
 */
package viveksingh.interview.rotate;

import viveksingh.interview.utils.Utils;

/**
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * 
 * Ref: https://www.geeksforgeeks.org/array-rotation/
 * 
 * Ref: https://leetcode.com/problems/rotate-array/
 * 
 * 
 * @author vivek
 *
 */
public class RotateArrayElementsFromKthIndexClockwise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Input array
		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };

		// Exec-1: Rotation required
		int k = 3;

		Utils.printData("Input : ", nums1);
		System.out.println("Rotations : " + k);
		reverseKtimesClockwise(nums1, k);

		// Print result
		Utils.printData("Result : ", nums1);

		// Exec-2: Rotation required
		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7 };
		k = 11;

		Utils.printData("Input : ", nums2);
		System.out.println("Rotations : " + k);
		reverseKtimesClockwise(nums2, k);

		// Print result
		Utils.printData("Result : ", nums2);

	}

	/**
	 * Reverse the array elements k times.
	 * 
	 * @param nums1
	 * @param k
	 */
	private static void reverseKtimesClockwise(int[] nums1, int k) {

		// No of rations exactly needed
		// Note: If we rotate an array of length 'n' for 'n'times it will result in same
		// order of elements
		// to overcome the unnecessary rotations, we can find the effective no. of
		// element count need to be rotated.
		int r = k % nums1.length;
		System.out.println(String.format("%s - effective roations required", r));

		// Rotate left part of array
		reverse(nums1, 0, (nums1.length - r - 1));
		reverse(nums1, (nums1.length - r), (nums1.length - 1));
		reverse(nums1, 0, (nums1.length - 1));
	}

	/**
	 * Reverse the elements of array for given indexes.
	 * 
	 * @param nums1
	 * @param i
	 * @param j
	 */
	private static void reverse(int[] nums1, int i, int j) {

		while (i < j) {
			int temp = nums1[i];
			nums1[i] = nums1[j];
			nums1[j] = temp;
			i++;
			j--;
		}
	}

}
