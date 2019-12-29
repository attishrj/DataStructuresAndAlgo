package com.java.collection.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(452,"zmit");    
	      map.put(2,"Ravi");    
	      map.put(196,"Vijay");    
	      map.put(347,"asRahul");  
	      map.put(17,"asRahul");  
	      
	      for(Map.Entry<Integer,String> m:map.entrySet()){    
	          System.out.println(m.getKey()+" "+m.getValue());    
	         }    

	}

}
