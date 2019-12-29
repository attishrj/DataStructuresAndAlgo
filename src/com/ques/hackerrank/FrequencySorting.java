package com.ques.hackerrank;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

Examples:

Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
*/
public class FrequencySorting {
	public static void main(String[] args) {
		
		int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
		sortFreqMap(arr);
	}

	private static void sortFreqMap(int[] arr) {
	Map<Integer ,Integer> hmap=new HashMap<>();
	for(int num:arr)
	{
		if(hmap.containsKey(num))
		{
			Integer count=hmap.get(num);
			hmap.put(num, ++count);
		}
		else{
			hmap.put(num, 1);
		}
		System.out.println(hmap);
	}
	   FrequencySorting obj=new FrequencySorting();
		FrequencyComparator fcompare=obj.new FrequencyComparator(hmap);
		Map<Integer, Integer> tmap= new TreeMap<Integer, Integer>(fcompare);
			tmap.putAll(hmap);
	//	for(Integer i:tmap.keySet())
		{
		//	int frequencey=tmap.get(i);
			System.out.println("FrequencySorting.sortFreqMap()"+hmap);
		}
	}
	class FrequencyComparator implements Comparator<Integer>{
		Map<Integer,Integer> compareMap;
		
		public FrequencyComparator(Map<Integer, Integer> compareMap) {
			this.compareMap = compareMap;
		}
		
		@Override
		public int compare(Integer o1, Integer o2) {
			Integer val1=compareMap.get(o1);
			Integer val2=compareMap.get(o2);
			int result = val1.compareTo(val2);
			int res = result==0?val1.compareTo(val2):result;
			return res;
		}
		
	}

}
