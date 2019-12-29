package com.ques.hackerrank;

import java.util.HashSet;
import java.util.Set;

/**Let Array be {1, 4, 45, 6, 10, -8} and sum to find be 16*/
public class EqualPairSum {
	public void setsumpairs(int[] ar, int sum)
	{
		Set<Integer> hset=new HashSet<>();
		for(int i=0;i<ar.length;i++)
		{
			int temp=sum-ar[i];
			if (hset.contains(temp)) {
				 System.out.println("Pair with given sum " + 
                         sum + " is (" + ar[i] + 
                         ", "+temp+")");
			}
			hset.add(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		 int ar[] = {1, 4, 45, 6, 10, 8}; 
		 int sum = 16; 
		 EqualPairSum obj=new EqualPairSum();
		 obj.setsumpairs(ar, sum);
		 
	}

}
