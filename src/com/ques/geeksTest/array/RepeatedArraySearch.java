package com.ques.geeksTest.array;

import java.util.Arrays;

public class RepeatedArraySearch {

	public static void main(String[] args) {
		int[] ar={1 ,2, 1, 3, 4, 3};
		RepeatedArraySearch.twoRepeated(ar, ar.length);

	}

	static void twoRepeated(int arr[], int n){
        StringBuilder b=new StringBuilder();
        Arrays.sort(arr);
        int count;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                b.append(arr[i]);
            }
        }
        System.out.print(b.toString());
        // Your code here
        
    }
}
