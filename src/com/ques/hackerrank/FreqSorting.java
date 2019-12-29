package com.ques.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

Examples:

Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
*/
public class FreqSorting {

	public static void main(String[] args) {
		int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
		 Map<Integer,Integer> m1 = new TreeMap<>();
		    for(int i : arr)
		    { 
		    if(m1.containsKey(i))
		    {m1.put(i,m1.get(i)+1);} 
		    else  {m1.put(i,1);}
		    };

		  List<Integer> b = new ArrayList<>();
		  m1.entrySet().stream().sorted((k1,k2)->k1.getValue().compareTo(k2.getValue()))
	}

}
