package com.ques.geeks.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveMap {

	public static void main(String[] args) {
	Map<Integer,String > hmap=new HashMap<>();
	addElementsToMap(hmap);
	hmap.entrySet().removeIf(val->val.getValue().startsWith("Sh"));
	filterMap(hmap);

	
	System.out.println(hmap);

	}

	private static void filterMap(Map<Integer, String> hmap) {
		Iterator<Entry<Integer, String>> iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			  String val=iterator.next().getValue();
			  if(val.startsWith("Sh"))
			  {
				  iterator.remove();
			  }
		}
	}

	private static void addElementsToMap(Map<Integer, String> hmap) {
      hmap.put(11, "Shailendra");		
      hmap.put(15, "Sampak");
      hmap.put(12, "Shailesh");
      hmap.put(21, "Sam");
      hmap.put(55, "Shushil");
      hmap.put(61, "Sujata");
      hmap.put(18, "Sinha");
      hmap.put(68, "Apple");
      hmap.put(71, "Zebra");
      hmap.put(76, "Shantosh");
	}

}
