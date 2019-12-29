    package com.ques.geeks.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValues {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		addElementsToMap(hmap);
		List<Entry<Integer, String>> sortMapByValues = sortMapByValues1(hmap);
		sortMapByValues.forEach(System.out::println);

	}

   
	private static List<Entry<Integer, String>> sortMapByValues1(Map<Integer, String> hmap) {
		Set<Entry<Integer,String>> set= hmap.entrySet();
		List<Entry<Integer,String>> list=new ArrayList<>(set);
		//simplesort(list);
		sortByJava8(list);
		return list;
		
		
	}


	private static void simplesort(List<Entry<Integer, String>> list) {
		Comparator<Entry<Integer, String>> comp=new Comparator<Map.Entry<Integer,String>>() {
			
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		Collections.sort(list,comp);
	}


	private static void sortByJava8(List<Entry<Integer, String>> list) {
		Collections.sort(list,(v1,v2)->v1.getValue().compareTo(v2.getValue()));
	}


	private static void addElementsToMap(Map<Integer, String> hmap) {
		hmap.put(11, "Peach");
		hmap.put(13, "Orange");
		hmap.put(63, "Guava");
		hmap.put(54, "Carrot");
		hmap.put(45, "Dates");
		hmap.put(49, "Avocardo");
		hmap.put(23, "Mango");
		hmap.put(15, "Litchi");
		hmap.put(74, "Avocardo");
		hmap.put(88, "Apple");
		hmap.put(23, "Butterfruit");
	}

}
