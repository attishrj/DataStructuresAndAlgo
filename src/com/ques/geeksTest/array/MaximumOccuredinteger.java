package com.ques.geeksTest.array;

import java.util.HashMap;

public class MaximumOccuredinteger {

	/**
	 * For example consider the following ranges. L[] = {2, 1, 3}, R[] = {5, 3,
	 * 9) Ranges represented by above arrays are. [2, 5] = {2, 3, 4, 5} [1, 3] =
	 * {1, 2, 3} [3, 9] = {3, 4, 5, 6, 7, 8, 9} The maximum occurred integer in
	 * these ranges is 3.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int L[] = { 2, 1, 3 };
		int R[] = { 5, 3, 9 };
		int res = maxoccured(L, R);
		System.out.println(res);
	}

	private static int maxoccured(int[] l, int[] r) {
	
		int k = 0;
		int size = 0;
		int count=1;
		HashMap<Integer, Integer> map=new HashMap<>();
		// for(int i=0;i<length;i++)
	
		for (int i=0,j=0; i < l.length && j < r.length; i++, j++) {
			size += l[i] > r[j] ? Math.subtractExact(l[i], r[i])+1 : Math.subtractExact(r[i], l[i])+1;
		}
		int res[] = new int[size];
		for (int i = 0; i < 3; i++) {
			for (int j = l[i]; j <= r[i]; j++) {
				  res[k]=j;
						  k++;
			}
		}
		int max = 0;
		for (int i = 0; i < res.length; i++) {
			if (!map.containsKey(res[i])) {
				
				map.putIfAbsent(res[i], 1);
			}
			else{
				map.put(res[i], map.get(res[i])+1);
			}

		}
		
		return max;
	}
   
}
