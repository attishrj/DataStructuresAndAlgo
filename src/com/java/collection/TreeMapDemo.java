package com.java.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> treemap = new TreeMap<String, String>();
		// Put elements to the map
	    treemap.put("Key1", "Jack");
	    treemap.put("Key2", "Rick");
	    treemap.put("Key3", "Kate");
	    treemap.put("Key4", "Tom");
	    treemap.put("Key5", "Steve");
	    Map sortedMap = sortByValues(treemap);

	}
	public static<K,V extends Comparable<K>> Map<K,V> sortByValues(final Map<K, V> map)
	{
		
		return null;
	}

	
}
