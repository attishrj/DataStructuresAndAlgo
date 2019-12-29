package com.ques.geeksTest.array;

public class MaximumDiff {

	public static void main(String[] args) {
		int[] ar = { 2, 0,1, 10, 6, 4, 8, 1 };
		int[] ar2 = {7, 9, 5, 6, 3, 2}; 
		int[] arr={1 ,2 ,90 ,10 ,110}; 
		int diff = maxDiff(arr);
		//int diff2=maxDiffOpt(arr);
		System.out.println(diff);

	}

	//wont work
	private static int maxDiffOpt(int[] ar) {
	int maxDiff=Integer.MIN_VALUE;
	int sumDiff=0;
	for(int j=1;j<ar.length;j++)
	{
	   int current = ar[j];
	int prev = ar[j-1];
	int diff = current-prev;
	if(diff>0&&diff>=maxDiff)
	   {
		   sumDiff+=diff;
		   maxDiff=Math.max(maxDiff, sumDiff);
	   }
	}
		return maxDiff;
	}

	private static int maxDiff(int[] ar) {

		int minVal=ar[0];
		int consecutivediff=ar[1]-ar[0];
		for(int j=1;j<ar.length;j++)
		{
		    int relativediff=ar[j]-minVal;
		   consecutivediff=Math.max(consecutivediff,relativediff);
	      minVal=Math.min(minVal,ar[j]);
		}
			return consecutivediff;
		
	}


}
