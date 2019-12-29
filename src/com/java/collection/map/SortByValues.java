package com.java.collection.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortByValues {
	public static void main(String[] args) {

		Map<String, Integer> hmap = new HashMap<>();
		initMap(hmap);
		Set<Entry<String, Integer>> hset = hmap.entrySet();
		Collection<Integer> collectionValues = hmap.values();
	List<Integer> collect = collectionValues.stream().collect(Collectors.toList());
		List<Entry<String, Integer>> list = new ArrayList<>(hset);
		Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int i = o1.getValue().compareTo(o2.getValue());
				return i == 0 ? o1.getValue() : i;
				// return i;
			}
		};

		Collections.sort(list, comparator);
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}
	}

	private static void initMap(Map<String, Integer> hmap) {
		hmap.put("java", 20);
		hmap.put("C++", 45);
		hmap.put("Java2Novice", 2);
		hmap.put("Unix", 67);
		hmap.put("MAC", 26);
		hmap.put("HP", 26);
		hmap.put("Why this kolavari", 93);
	}

}
