package com.ques.geeksTest.array.windowsliding;

public class MaximumGapLeetCode {

	public static void main(String[] args) {
   int []ar={3,6,9,1};
   int []ar2={1,3,100};
  int res= findMaxGap(ar2);
  System.out.println(res);
	}

	private static int findMaxGap(int[] nums) {
		  int size=nums.length;
	        if(size<2)
	        {
	            return 0;
	        }
	        int diff=Math.abs(nums[1]-nums[0]);
	        int k=2;
	        int maxDiff=diff;
	        for(int i=k;i<size;i++)
	        {
	            diff=Math.abs(nums[i]-diff)+nums[i-k];
	            maxDiff=Math.max(diff,maxDiff);
	        }
	      return maxDiff;
	          }

}
