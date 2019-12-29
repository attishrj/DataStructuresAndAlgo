package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaptoList {
	public static void main(String args[]) {
	      Map<String,Integer> map = new HashMap<>();
	      map.put("mou", 2003);
	      map.put("suman ", 2005);
	      map.put("arnab ", 1998);
	      map.put("susmita", 2015);
	      
	      List<String> list=new ArrayList<>(map.keySet());
	     // System.out.println("MaptoList.keys"+list);
	      Collection<Integer> values = map.values();
	      List<Integer> valueList=new ArrayList<>(map.values());
	     // System.out.println("MaptoList.values"+valueList);
	      
	      List<String> collect = map.keySet().stream().collect(Collectors.toList());
	      collect.forEach(p->System.out.println(p));
	      
	      
	}

}
