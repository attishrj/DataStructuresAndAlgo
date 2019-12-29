package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorJava8 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(24);
		list.add(3);
		list.add(125);
		list.add(4);
		list.add(88);
		list.add(88);
		Comparator<Integer> c=(I1,I2)->
		{
			return (I1<I2)?-1:(I1>I2)?1:0;
		};
		Collections.sort(list,c);
		list.forEach((n)->System.out.println(n)
				);
		}

}
