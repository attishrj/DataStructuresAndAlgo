package com.ques.geeksTest.array;

import com.learn.data.structure.Utility;

public class InsertAtEnd {

	public static void main(String[] args) {

    int arr[]=new int[6];
     arr[0]=1;
     arr[1]=2;
     arr[2]=3;
     arr[3]=4;
     arr[4]=5;
      Utility.print(arr);
      int element=77;
      isertAtEnd(arr,element);
	}

	private static void isertAtEnd(int[] arr, int element) {
		arr[arr.length-1]=element;
		System.out.println("\nafter insertion");
		  Utility.print(arr);
		
	}

}
