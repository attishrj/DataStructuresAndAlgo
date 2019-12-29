package com.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(14);
		list.add(5);
		list.add(992);
		System.out.println(check(list,5));

	}

	private static String check(List<Integer> list, int i) {
		String result="";
        return result=	list.contains(i)==true?(result="YES"):(result="No");
		//return null;
	}

}
