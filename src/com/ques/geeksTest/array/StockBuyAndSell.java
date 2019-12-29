package com.ques.geeksTest.array;

import java.util.ArrayList;
import java.util.List;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int stock[] = { 1, 5, 3, 8, 12 };
		int profit = maxprofit(stock);
		// System.out.println(profit);

		int daystock[] = { 100, 180, 260, 310, 40, 535, 695 };
		int st2[] = { 23, 13, 25, 29, 33, 19, 34, 45, 65, 67 };
		//findDays(st2);
		// findDays(daystock);
	}

	private static void findDays(int[] price) {

		List<Integer> list = new ArrayList<>();
		String str = "";
		int n = price.length;
		int minVal = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		int consecutiveDiff = price[1] - price[0];

		for (int i = 1; i < n; i++) {
			int current = price[i];
			int prev = price[i - 1];

			if ((current > prev)) {
				minVal = Math.min(minVal, i - 1);
				maxValue = Math.max(maxValue, i);

			} else {
				// list.add(minVal);
				str = str + minVal;
				// list.add(maxValue);
				str = str + maxValue;
				minVal = Integer.MAX_VALUE;
				maxValue = Integer.MIN_VALUE;
			}
		}
		list.add(minVal);
		list.add(maxValue);
		list.forEach(System.out::print);
	}

	
	private static int maxprofit(int[] stock) {
		int profitMax = 0;
		for (int i = 1; i < stock.length; i++) {
			int current = stock[i];
			int previous = stock[i - 1];
			if (current > previous) {
				profitMax += current - previous;
			}
		}
		return profitMax;
	}

}
