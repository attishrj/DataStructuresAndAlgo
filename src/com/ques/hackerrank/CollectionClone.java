package com.ques.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CollectionClone {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		String str="x";
		str=str.concat("y");
		resetString(str);
	//	System.out.println("String "+str);
		list.add("ram");
		list.add("shyam");
	//resetList(list);
		System.out.println("CollectionClone.main()"+resetList(list));
	}

	private static void resetString(String str) {
		str=new String();
		str=str.concat("z");
		
	}

	private static List<String> resetList(List<String> list) {
		//private static void resetList(List<String> list) {
			list.add("jai");
		list=new ArrayList<>();
		list.add("kumar");
		return list;
	}

}
