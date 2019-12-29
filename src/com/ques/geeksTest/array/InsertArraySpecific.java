package com.ques.geeksTest.array;

import com.learn.data.structure.Utility;

public class InsertArraySpecific {

	public static void main(String[] args) {
		int arr[] = new int[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		Utility.print(arr);
		int element = 90;
		int index = 3;
		isertAtSpecific(arr, index, element);

	}

	private static void isertAtSpecific(int[] arr, int index, int element) {
		if (index == arr.length - 1) {
			arr[index] = element;
			System.out.println("\nafter insertion");
			Utility.print(arr);
			return;
		}
		int temp = arr[index];

		arr[index] = element;
		
		for (int i = index+1; i < arr.length; i++) {
			int temp2=arr[i];
			arr[i]=temp;
			temp=temp2;
		}
		System.out.println("\nafter insertion");
		Utility.print(arr);

	}

}
