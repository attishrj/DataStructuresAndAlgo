package com.ques.geeksTest.array.prefixSum;

/**
 * For example consider the following ranges.
L[] = {2, 1, 3}, R[] = {5, 3, 9)
Ranges represented by above arrays are.
[2, 5] = {2, 3, 4, 5}
[1, 3] = {1, 2, 3}
[3, 9] = {3, 4, 5, 6, 7, 8, 9}
The maximum occurred integer in these ranges is 3.

*/
public class MaxAppearingInRange {
	public static void main(String[] args) {
		
		int L[]={2, 1, 3};
		int  R[] = {5, 3, 9};
		int number=findMaxRange(L,R);
	}
	   
	private static int findMaxRange(int[] l2, int[] r2) {
		int count[]=new int[( l2.length* r2.length)+1];
		int t=0;
		for (int i = 0; i < count.length; i++) {
			for (int k = l2[i]; k <=r2[i] ; k++) {
				int j = k;
				count[t]=j;
				t++;
				
			}
			
		}
		for (int i = l2.length; i < count.length; i++) {
			count[i]=r2[i];
			int j=count[i];
			j++;
			count[i]++;
			
		}
		int max=count[0];
		for (int i = 0; i < count.length; i++) {
			max=Math.max(max, count[i]);
			
		}
		return max;
	}

}
