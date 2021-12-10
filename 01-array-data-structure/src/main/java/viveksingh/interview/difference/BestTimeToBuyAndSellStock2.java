/**
 * 
 */
package viveksingh.interview.difference;

import viveksingh.interview.utils.Utils;

/**
 * Ref:
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
 * 
 * @author vivek
 *
 */
public class BestTimeToBuyAndSellStock2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };

		Utils.printData("Stock prices : ", prices);
		int p = calculateMaxProfit(prices);
		System.out.println("Max profile : " + p + "\n");

		prices = new int[] { 1, 2, 3, 4, 5 };
		Utils.printData("Stock prices : ", prices);
		p = calculateMaxProfit(prices);
		System.out.println("Max profile : " + p + "\n");

		prices = new int[] { 7, 6, 4, 3, 1 };
		Utils.printData("Stock prices : ", prices);
		p = calculateMaxProfit(prices);
		System.out.println("Max profile : " + p + "\n");
	}

	/**
	 * Calculate max profit.
	 * 
	 * @param prices
	 * @return
	 */
	private static int calculateMaxProfit(int[] prices) {
		int p = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				p += prices[i] - prices[i - 1];
			}
		}

		return p;
	}
}
/**
*	@formatter:off
*
*	Results
*	-----------------
*
		Stock prices : [7, 1, 5, 3, 6, 4, ]
		Max profile : 7
		
		Stock prices : [1, 2, 3, 4, 5, ]
		Max profile : 4
		
		Stock prices : [7, 6, 4, 3, 1, ]
		Max profile : 0

*
*
*	@formatter:on
*/