package com.ques.geeksTest.array;

public class MaximumAppearingRange {

	public static void main(String[] args) {
		int[] L = { 1, 4, 9, 13, 21 }; 
		int[] R = { 15, 8, 12, 20 }; 
		int n = L.length; 
		System.out.println(maximumOccuredElement(L, R, n)); 

	}

	private static int maximumOccuredElement(int[] l, int[] r, int n) {
		int MAX_LIMIT=1000;
		int arr[]=new int[MAX_LIMIT];
		int max=-1;
		for (int i = 0; i < n; i++) {
			int left = l[i];
			arr[left]+=1;
			int right = r[i];
			arr[right]-=1;

			
			if (right>max) {
				max=right;
			}
		}
			int msum=arr[0];
			int ind=0;
			for (int i = 1; i <max+1; i++) {
				arr[i]+=arr[i-1];
				if(msum<arr[i])
				{
					msum=arr[i];
					ind=i;
				}
			}
			return ind;
			
		
	}

}
