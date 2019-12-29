package com.java.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListdemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>() 
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(5);
				add(7);
			}
		};
		
		System.out.println("ArrayListdemo.main()"+list);
	}

}
