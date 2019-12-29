package com.ques.geeksTest.array;

public class SmallestPositive {

	public static void main(String[] args) {
		int ar[]={ 1, 3, 4, 6, 7};
		int number=sortedArrayMissing(ar);
		System.out.println(number);

	}


	private static int sortedArrayMissing(int[] input) {
		for (int i = 0; i < input.length; i++) 
		{
		    if (i != input[i]) {
		        return i;
		    }
		}
		    return input.length;
	}
	
}
