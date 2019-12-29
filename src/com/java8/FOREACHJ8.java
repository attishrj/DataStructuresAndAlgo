package com.java8;

import java.util.Arrays;
import java.util.List;

public class FOREACHJ8 {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(4,5,6,7,8);
		System.out.println("FOREACHJ8.main()"+values);
		values.forEach(i -> System.out.println(i));

	}

}
