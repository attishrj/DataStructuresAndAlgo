/**
 * 
 */
package com.ques.hackerrank;

/**
 * N jars each contating certain no of cookies placed . U can pick & eat all the cookies.
 * U are not allowed to pick any two consecutive jars
 *
 */
public class MaximumCookies {
	

	public static int maxPic(int[] ar)
	{
		int n=ar.length;
		if(n==0)
		{
			return 0;
		}
		int Val1=ar[0];
		if(n==1)
		{
			return Val1;
		}
		
		int val2=Math.max(ar[0], ar[1]);
		if(n==2)
		{
			return val2;
		}
		
		int maxVal=0;
		for (int i = 2; i < n; i++) {
			maxVal=Math.max(ar[i]+ Val1, val2);
			Val1=val2;
			val2=maxVal;
			
		}
				
		return maxVal;
	}
	public static void main(String[] args) {
	int[] ar={10,50,30,20,45};
	  System.out.println("MaximumCookies.main()"+maxPic(ar));

	}

}
