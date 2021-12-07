/**
 * 
 */
package viveksingh.interview.merge;

/**
 * @author vivek
 *
 */
/**
* Merge two sorted arrays.
*/
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

import viveksingh.interview.utils.Utils;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] sortedArr1 = { 1, 3, 4, 31, 40 };
		int[] sortedArr2 = { 4, 6, 30, 36, 43 };

		// Approach - 1
		int[] result = mergeSortedArrayBruteForce(sortedArr1, sortedArr2);

		Utils.printData(sortedArr1, "Input 1 : ");
		Utils.printData(sortedArr2, "Input 2 : ");
		Utils.printData(result, "Result  : ");
		System.out.println();

		// Approach - 2 - same length input
		result = mergeSortedArray_using_two_pointers(sortedArr1, sortedArr2);

		Utils.printData(sortedArr1, "Input 1 : ");
		Utils.printData(sortedArr2, "Input 2 : ");
		Utils.printData(result, "Result  : ");
		System.out.println();
		
		// Approach 2 - variable length input
		int[] arr1 = { 1, 3, 4, 31};
		int[] arr2 = {4, 6, 30};
		result = mergeSortedArray_using_two_pointers(arr1, arr2);

		Utils.printData(arr1, "Input 1 : ");
		Utils.printData(arr2, "Input 2 : ");
		Utils.printData(result, "Result  : ");
		System.out.println();

		// Approach 2 - variable length input
		result = mergeSortedArray_using_two_pointers(arr2, arr1);

		Utils.printData(arr2, "Input 1 : ");
		Utils.printData(arr1, "Input 2 : ");
		Utils.printData(result, "Result  : ");
		System.out.println();

		
		// Approach - 3 using SortedSet
		result = mergeSortedArray_using_sorted_set(sortedArr1, sortedArr2);

		Utils.printData(sortedArr1, "Input 1 : ");
		Utils.printData(sortedArr2, "Input 2 : ");
		Utils.printData(result, "Result  : ");
		System.out.println();
	}

	/** Use sorted set to merge the arrays. */
	public static int[] mergeSortedArray_using_sorted_set(int[] arr1, int[] arr2) {

		System.out.println("Method : mergeSortedArray_using_sorted_set");

		// validate input
		if (arr1 == null || arr2 == null) {
			return null;
		}

		if (arr1.length < 1) {
			return arr2;
		}

		if (arr2.length < 1) {
			return arr1;
		}

		// add data in sorted set one by one
		SortedSet<Integer> mergedData = new TreeSet<>();
		int counter = arr1.length > arr2.length ? arr1.length : arr2.length;
		//counter = Math.max(arr1.length, arr2.length);

		for (int i = 0; i < counter; i++) {
			if (i < arr1.length) {
				mergedData.add(arr1[i]);
			}

			if (i < arr2.length) {
				mergedData.add(arr2[i]);
			}
		}

		return mergedData.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Use two pointers to compare data of both arrays and keep adding smallest
	 * elements.
	 */
	public static int[] mergeSortedArray_using_two_pointers(int[] arr1, int[] arr2) {

		System.out.println("Method : mergeSortedArray_using_two_pointers");

		// validate input
		if (arr1 == null || arr2 == null) {
			return null;
		}

		if (arr1.length < 1) {
			return arr2;
		}

		if (arr2.length < 1) {
			return arr1;
		}

		int[] mergedArray = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		int x = arr1[i];
		int y = arr2[j];

		// Loop until all the elements in both loops are iterated.
		while (i < arr1.length || j < arr2.length) {

			// if there's any element left in arr1
			// (j >= arr2.length || x <= y) -> 
			if (i < arr1.length && (j >= arr2.length || x <= y) ) {
				mergedArray[k++] = x;
				i++;
				if (i < arr1.length) {
					x = arr1[i];
				}

			} else if (j < arr2.length) {
				mergedArray[k++] = y;
				j++;
				if (j < arr2.length) {
					y = arr2[j];
				}
			}
		}

		return mergedArray;
	}

	/** Brute force approach. */
	public static int[] mergeSortedArrayBruteForce(int[] arr1, int[] arr2) {

		System.out.println("Method : mergeSortedArrayBruteForce");

		// validate input
		if (arr1 == null || arr2 == null) {
			return null;
		}

		if (arr1.length < 1) {
			return arr2;
		}

		if (arr2.length < 1) {
			return arr1;
		}

		// Copy both arrays in a new array
		int[] mergedArray = new int[arr1.length + arr2.length];

		int index = 0;
		for (; index < arr1.length; index++) {
			mergedArray[index] = arr1[index];
		}

		for (int i = 0; i < arr2.length; i++) {
			mergedArray[index++] = arr2[i];
		}

		// sort new array
		Arrays.sort(mergedArray);

		return mergedArray;
	}
}
