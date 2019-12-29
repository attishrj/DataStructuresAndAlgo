package com.ques.geeksTest.array.windowsliding;

import java.io.IOException;

/**
 * given an array of integers and a number k ,find the maximum sum of k
 * consecutive elements
 */
public class MaxConsecutiveElements {

	public static void main(String[] args) throws IOException {
		
	//int[] ar={1,8,30,-5,20,7};
		int[] ar={5, -10,6, 90, 3};
		int k=2;
		//int maxsum=getMaxSum_NaiveSol(ar,k);
		int maxsum=getMaxSum_WindowSliding(ar, k);
	//	int max=getMaxSum_Basic(ar, k);
		//int naive=getMaxSum_Naive(ar, k);
		System.out.println(maxsum);

	}

	//This will work only for one case for k=3
	public static int getMaxSum_Basic(int[] ar, int k) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<=ar.length-k;i++)
		{
			for (int j = 0; j < k; j++) {
				
				int i1 = ar[j];
				int i2 = ar[j+1];
				int i3 = ar[j+2];
				sum=i1+i2+i3;
			}
			max=Math.max(max, sum);
			
		}
		return max;
	}
	public static int getMaxSum_Naive(int[] ar, int k) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i+k<ar.length+1;i++)
		{
			int sum=0;
			for (int j = 0; j < k; j++) {
				
				sum=sum+ar[i+j];
			}
			max=Math.max(max, sum);
			
		}
		return max;
	}

	public static int getMaxSum_WindowSliding(int[] ar, int k) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		//int currentSum
		for(int i=0;i<k;i++)
		{
			int i1 = ar[i];
			sum=sum+i1;
			max=sum;
		}
			
			for (int j = k; j < ar.length; j++) {
				
				
				sum=sum+ar[j]-(ar[j-k]);
				max=Math.max(max, sum);
			}
			
		
		return max;
	}
}
