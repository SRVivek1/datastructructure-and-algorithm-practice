/**
 * 
 */
package viveksingh.interview.duplicates;

import viveksingh.interview.utils.Utils;

/**
 * Ref: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * @author vivek
 *
 */
public class RemoveDuplicatesFromSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 2, 2, 2, 3, 3, 4, 5, 5 };

		Utils.printData("Input : ", nums);
		int r = removeDuplicates_self(nums);
		Utils.printData("Result : ", nums);
		System.out.println("Counter : " + r + "\n");

		nums = new int[] { 1, 1, 2, 2, 2, 3, 3, 4, 5, 5 };
		Utils.printData("Input : ", nums);
		r = removeDuplicates_ytube(nums);
		Utils.printData("Result : ", nums);
		System.out.println("Counter : " + r + "\n");

		nums = new int[] { 1, 2, 3, 4, 5 };
		Utils.printData("Input : ", nums);
		r = removeDuplicates_self(nums);
		Utils.printData("Result : ", nums);
		System.out.println("Counter : " + r + "\n");

		nums = new int[] { 1, 1, 1, 1, 1, 1, };
		Utils.printData("Input : ", nums);
		r = removeDuplicates_self(nums);
		Utils.printData("Result : ", nums);

	}

	/**
	 * Remove duplicates from given array.
	 * 
	 * @param nums
	 * @return
	 */
	public static int removeDuplicates_self(int[] nums) {

		System.out.println("Method start: removeDuplicates_self");
		int c = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[c] = nums[i];
				c++;
			}
		}

		System.out.println("Counter : " + c);
		return c;
	}

	/**
	 * Remove duplicates from given array.
	 * 
	 * @param nums
	 * @return
	 */
	public static int removeDuplicates_ytube(int[] nums) {

		System.out.println("Method start: removeDuplicates_ytube");

		int c = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[c] = nums[i + 1];
				c++;
			}
		}
		System.out.println("Counter : " + c);
		return c;
	}
}

/**
 * @formatter:off
 * 
 * Results
 * ---------
 * 
	 	Input : [1, 1, 2, 2, 2, 3, 3, 4, 5, 5, ]
		Method start: removeDuplicates_self
		Counter : 5
		Result : [1, 2, 3, 4, 5, 3, 3, 4, 5, 5, ]
		Counter : 5
		
		Input : [1, 1, 2, 2, 2, 3, 3, 4, 5, 5, ]
		Method start: removeDuplicates_ytube
		Counter : 5
		Result : [1, 2, 3, 4, 5, 3, 3, 4, 5, 5, ]
		Counter : 5
		
		Input : [1, 2, 3, 4, 5, ]
		Method start: removeDuplicates_self
		Counter : 5
		Result : [1, 2, 3, 4, 5, ]
		Counter : 5
		
		Input : [1, 1, 1, 1, 1, 1, ]
		Method start: removeDuplicates_self
		Counter : 1
		Result : [1, 1, 1, 1, 1, 1, ]

 * 
 * 
 * 
 * @formatter:on
 */