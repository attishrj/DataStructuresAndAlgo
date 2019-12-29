package com.java.collection.map.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapToListOfUserObject {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(23, "Mahesh");
		map.put(10, "Suresh");
		map.put(26, "Dinesh");
		map.put(11, "Kamlesh");
		map.put(91, "Kamlesh");
		
		List<Map.Entry<Integer, String>> list = map.entrySet().stream().collect(Collectors.toList());
		Comparator<Map.Entry<Integer, String>> stringComparator =new Comparator<Map.Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		Collections.sort(list,stringComparator);
		list.forEach(p->System.out.print("\n "+p.getKey() +"-- " +p.getValue()));
	}

}
