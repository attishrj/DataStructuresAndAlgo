package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class Assg1 {

	public static void main(String[] args) {
		String str = "Coffee in google canteen is awsome";
		
		countNextDup(str);
		mapMethod(str);
	}

	private static void countNextDup(String str) {
		String[] strArry = str.split("\\s+");
		int count = 0;
		for (String temp : strArry) {
			for (int i = 0, j = i + 1; i < (temp.length() -1) && (j < temp.length()); i++, j++) {
				char charAti = temp.charAt(i);
				char charAtj = temp.charAt(j);
				if (charAti == charAtj) {
					count++;
				}
			}
		}
		System.out.println("Total count " + count);

	
		
	}

	private static void mapMethod(String str) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		String[] strArry = str.split("\\s+");
		int cnt=0;
		for(String s:strArry)
		{
		for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  if (map.containsKey(c)) {
		     cnt = map.get(c);
		    map.put(c, ++cnt);
		  } else {
		    map.put(c, 1);
		  }
		}
		System.out.println("Assg1.countNextDup()"+cnt);
	}
	}

}
