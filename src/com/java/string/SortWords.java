package com.java.string;

import java.util.Arrays;

public class SortWords {

	public static void main(String[] args) {
		String[] str = {"Monday", "Auesday", "Wednesday" ,"Bhursday","Friday", "Paturday", "Sunday"};
	   
		//sortAlphabetically(str);
	//Arrays.stream(str).sorted().forEach(d->System.out.print(d+" "));
	
	Arrays.stream(str).sorted((p1,p2)->p2.compareTo(p1)).forEach(d-> System.out.print(d+" "));
	}

	private static void sortAlphabetically(String[] str) {
		String[] strAr = str;
		String temp = "";
		for (int i = 0; i < strAr.length; i++) {
			for (int j = i + 1; j < strAr.length; j++) {
				if (strAr[i].compareTo(strAr[j]) > 0) {
					temp = strAr[i];
					strAr[i] = strAr[j];
					strAr[j] = temp;
					
				}

			}

		}

	}

}
