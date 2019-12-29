package com.ques.geeksTest.array;

/**
 * Given an array A[] of N positive integers which can contain integers from 1
 * to N where elements can be repeated or can be absent from the array. Your
 * task is to count frequency of all elements from 1 to N
 * 
 * 
 * Example:
Input:
2
5
2 3 2 3 5
4
3 3 3 3

Output:
0 2 2 0 1
0 0 4 0

Explanation:
Testcase 1: Counting frequencies of each array elements, we have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
 
 */
public class Frequency {

	public static void main(String[] args) {
		int ar[]={2 ,3 ,2 ,3 ,5};
		//printFrequency(ar, ar.length);
		printFrequencyOptimized(ar, ar.length);

	}
	//O(n*n)
	public static void  printFrequency(int[] ar, int n){
       for(int i=1;i<=n;i++)
       { 
    	   int k=ar[i];
    	   int count =0; 
             for(int j=0;j<n;j++)
             {
            	 int j2 = ar[j];
				if(i==j2)
            	 {
					count++;
            	 }
             }
             System.out.println(count);
       }
       
        
    }
	
	
	
	//O(n)
	public static void  printFrequencyOptimized(int[] arr, int n){
		int count[]=new int[n];
	       for(int i=0;i<n;i++)
	       {
	    	  count[arr[i]-1]++;
	       }

		StringBuffer sbfNumbers = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sbfNumbers.append(" ").append(count[i]);

		}
		System.out.print(sbfNumbers.toString().trim());

	    }
	
	static void count(int[] arr,int n)
	{
		 int i = 0; 
	        while (i < n)  
	        { 
	            if (arr[i] <= 0)  
	            { 
	                i++; 
	                continue; 
	            } 
	  
	            // Find index corresponding to this element 
	            // For example, index for 5 is 4 
	            int elementIndex = arr[i] - 1; 
	  
	            if (arr[elementIndex] > 0)  
	            { 
	                arr[i] = arr[elementIndex]; 
	                arr[elementIndex] = -1; 
	            }  
	            else 
	            { 
	                arr[elementIndex]--; 
	  
	                arr[i] = 0; 
	                i++; 
	            } 
	        } 
	      
	        for (int j = 0; j < n; j++) 
	            System.out.println(j+1 + "->" + Math.abs(arr[j])); 
	    } 
	
		

}
