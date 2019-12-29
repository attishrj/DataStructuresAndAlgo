package com.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddNumber {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(20);
		list.add(15);
		list.add(19);
		list.add(17);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(90);
        Predicate<Integer> P= p->(p)%2==0;
        Stream<Integer> filter = list.stream().filter(P);
		Collector<Integer, ?, List<Integer>> collectorList = Collectors.toList();
		List<Integer> collectList = filter.collect(collectorList);
		System.out.println(collectList);
	}

}
