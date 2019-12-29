package com.ques.hackerrank;

import java.util.Collections;
import java.util.Vector;

import com.learn.data.structure.Utility;

public class WiggleEvenOdd {
	
	static void bitonicGenerator(int arr[], int n)
	{
		int newarr[]=new int[arr.length];
		Vector<Integer> evenArr=new Vector<>();
		Vector<Integer> oddArr=new Vector<>();
		for (int i = 0; i < arr.length; i++) {
			if (i%2!=1) {
				evenArr.add(arr[i]);
				
			}
			else{
				oddArr.add(arr[i]);
			}
			
		}
		
		 Collections.sort(evenArr); 
	        Collections.sort(oddArr, Collections.reverseOrder()); 
	        
	        int i = 0; 
	        for (int j = 0; j < newarr.length; j++) { 
	        	if (j%2==0) {
					
	        		newarr[i] = evenArr.get(j); 
				}
	        	else{ 
	        		newarr[i] = oddArr.get(j); 
	        	}
	        	 
	        }

	}

	public static void main(String[] args) {
		int[] ar={1, 2, 8, 9, 3, 5};
		int size=ar.length;
		bitonicGenerator(ar, size);
		Utility.disp(ar);

	}

}
