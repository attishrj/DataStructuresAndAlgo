package com.ques.geeksTest.array;

import java.util.Arrays;

import com.learn.data.structure.Utility;

public class WaveArray {
	public static void main(String[] args) {

	//	int[] ar = { 2, 4, 7, 8, 9, 10 };
		int[] ar = { 1, 2, 3, 4,  5 };
		waveArray(ar);
		Utility.print(ar);
	}
	 static void maximumAdjacent(int sizeOfArray, int arr[]){
	        
	        /*********************************
	         * Your code here
	         * Function should print max adjacents for all pairs
	         * Use string buffer for fast output
	         * ***********************************/
	         StringBuilder builder=new StringBuilder();
	         int min=Integer.MAX_VALUE;
	         int max=Integer.MIN_VALUE;
	         for(int i=1;i<sizeOfArray;i++){
	           max=Math.max(arr[i-1],arr[i]);
	           //builder.append.(" ").append(max);
	           builder.append(" ").append(max);
	    }
	      System.out.print(builder.toString().trim());
	    }

	static void swap(int arr[], int a, int b) 
    { 
        int temp = arr[a]; 
        arr[a] = arr[b]; 
        arr[b] = temp; 
    } 
	public static void waveArray(int[] ar)
	{
		Arrays.sort(ar);
		for (int i = 0; i < ar.length-1; i=i+2) {
			
			swap(ar, i, i+1);
		}
	}
	
	/*public static int[] waveArray(int[] ar) {

		int[] temp = new int[ar.length];

			if (ar.length % 2 == 0) {
				for (int i = ar.length - 1; i >= 0;i--) {
				if ((i % 2) != 0) {
					temp[i - 1] = ar[i];

				} else {
					temp[i+1] = ar[i];
				}
			}
			
			
		}
			
			else{
				for (int i = ar.length-1;i>=0;i--) {
					if(i==ar.length-1)
					{
						temp[i]=ar[i];
						i--;
					}
					if(i%2!=0)
					{
					  temp[i-1]=ar[i];	
					}
					else{
						temp[i+1]=ar[i];
					}
					
					}
					
				
			}
			return temp;

	}
*/	

}
