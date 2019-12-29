package com.ques.geeksTest.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(31, 30, 34, 51, 92));
		// System.out.println(findLargestNumber(list));
		//SortDescNumber(list);
		int a=1;
		int b=2;
		System.out.println(Math.abs(Math.subtractExact(a, b)));

	}

	public static String findLargestNumber(ArrayList<Integer> A) {
		Integer sorted = A.stream().max(Integer::compare).get();
		return sorted.toString();

	}

	public static void SortDescNumber(List<Integer> A) {
		Collections.sort(A, (a,b)->a.compareTo(b));
		Collections.reverse(A);
		A.stream().forEach(System.out::print);
	}
	

}
