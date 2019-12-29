package com.ques.hackerrank;

public class SubArrays {
	public static void main(String[] args) {
	  int[] array={1,2,3,4};
	  System.out.println("All Non-empty Subarrays");
	  subArray(array);
	}

	private static void subArray(int[] array) {
		
		for (int i = 1; i <= array.length; i++) 
		{
			/*System.out.println();
			System.out.println("i "+i)*/;
			for (int j = i; j <= array.length; j++) 
			{
			for(int k=i;k<=j;k++)
				 System.out.print(k);
			System.out.println();
			}
		}
		
	}

}
