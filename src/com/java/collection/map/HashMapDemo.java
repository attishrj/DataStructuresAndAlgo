package com.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(100, "Amit");
		hmap.put(101, "Vijay");
		hmap.put(102, "Rahul");
		hmap.put(103 , "RahulK");
		System.out.println(hmap.get(106));
		Iterator<Entry<Integer, String>> itr2=hmap.entrySet().iterator();
		while(itr2.hasNext())
		{
			   Map.Entry<Integer, String> entrmap = itr2.next();
			   int key=entrmap.getKey();
			   String value=entrmap.getValue();
			   System.out.println("key "+key+"value  "+value);
		}
	for(Map.Entry<Integer,String> m:hmap.entrySet())
	{
		  System.out.println(m.getKey()+" "+m.getValue()); 
	}

}
}
