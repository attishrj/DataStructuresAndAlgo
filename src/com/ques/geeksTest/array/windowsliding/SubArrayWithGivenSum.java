package com.ques.geeksTest.array.windowsliding;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
       int[] ar={1,4,20,3,10,5}; 
       int sum=33;
       boolean get=NonNevagitiveSubArrayWithGivenSum(ar,sum);
	}

	private static boolean NonNevagitiveSubArrayWithGivenSum(int[] ar,int givenSum) {
		int currentSum=ar[0];
		int start=0;
		for(int end=1;end<ar.length;end++)
		{
			//cleaning the prev window
			while (currentSum > givenSum && start < end - 1) {
				currentSum = currentSum - ar[start];
				start++;
			}
			if (currentSum==givenSum) {
				return true;
			}
			if(end<ar.length)
			{
				currentSum+=ar[end];
			}
		}
		return currentSum==givenSum;
	}

}
