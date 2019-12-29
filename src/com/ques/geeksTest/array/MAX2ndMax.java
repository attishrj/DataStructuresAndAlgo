package com.ques.geeksTest.array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class MAX2ndMax {

	public static void main(String[] args) {
		int[] ar = { 2, 1, 2 };
		int size = ar.length;
		largestAndSecondLargest(size, ar);

	}

	public static void largestAndSecondLargest(int size, int[] ar) {
		 int max = Integer.MIN_VALUE; int max2 = Integer.MIN_VALUE;
		Arrays.sort(ar); max=ar[size-1]; max2=ar[0];
		List<int[]> asList = Arrays.asList(ar);
		
	}

	/*
	 * static void largestAndSecondLargest(int sizeOfArray, int arr[]){
	 * 
	 * int max = Integer.MIN_VALUE; int max2 = Integer.MIN_VALUE;
	 * 
	 *//*********************************
		 * Your code here This function should print max and second max
		 *******************************/
	/*
	 * Arrays.sort(arr); max=arr[sizeOfArray-1]; max2=arr[0];
	 * 
	 * if(isIdentical(arr)) { max2=-1; } for(int i=0;i<sizeOfArray-1;i++) {
	 * 
	 * if(max2<=arr[i]&&arr[i]!=max) { max2=arr[i]; }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * System.out.println(max + " " + max2); } public static boolean
	 * isIdentical(int arr[]) { int first=arr[0]; for (int i = 0; i <
	 * arr.length; i++) { if(arr[i]!=first) { return false; } } return true; }
	 */}
