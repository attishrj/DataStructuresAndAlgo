package com.ques.geeksTest.array.prefixSum;

public class PreFixSum {

	public static void main(String[] args) {
		int ar[]={2,8,9,6,5,4};
		prefixSum(ar);

	}

	private static void prefixSum(int[] ar) {
         int[] prefix=new int[ar.length];
        prefix[0]=ar[0];
         for(int i=1;i<ar.length;i++)
         {
        	 prefix[i]=prefix[i-1]+ar[i];
         }
	}

}
