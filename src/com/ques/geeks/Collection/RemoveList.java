package com.ques.geeks.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class RemoveList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("shailendra");
		list.add("sampak");
		list.add("shailesh");
		list.add("sona");
		list.add("sushil");
		list.add("sanction");
		list.add("sham");
		list.add("abish");
		list.add("ban");
		//method1(list);
		//method2(list);
		List<String> collect = list.stream().filter(s->!s.startsWith("sh")).collect(Collectors.toList());
		collect.forEach(System.out::println);
	//	demospliterator(list);
		//removeListIterate(list);
		// d->System.out.println(list);
		//Sorting(list);
		
	}

	private static void method2(List<String> list) {
		ListRemoverFunc(list);
	}

	private static void method1(List<String> list) {
		removeList(list);
	}

	private static void ListRemoverFunc(List<String> list) {
		list.removeIf(d->d.startsWith("sh"));
		list.forEach(System.out::println);
	}

	private static void demospliterator(List<String> list) {
		Spliterator<String> spliterator = list.spliterator();
		Spliterator<String> splitr2 = spliterator.trySplit();
		//spliterator2.forEachRemaining(n->System.out.println("for each remaining "+n));
		 if(splitr2 != null) { 
		        System.out.println("Output from splitr2: "); 
		      //  splitr2.forEachRemaining((n) -> System.out.println(n)); 
		        } 
		 spliterator.forEachRemaining(n->System.out.println("for each remaining "+n));
		
	}

	private static void Sorting(List<String> list) {
		Comparator<String> customCoparator = Custom();
		Collections.sort(list, customCoparator);
		RemoveList.MyComparator myComparator = new RemoveList().new MyComparator();
		Collections.sort(list, myComparator);
	}

	private static Comparator<String> Custom() {
		Comparator<String> customCoparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		return customCoparator;
	}

	class MyComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}

	}

	private static void removeList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			if (temp.startsWith("sh")) {
				list.remove(i);
			}
		}

	}

	private static void removeListIterate(List<String> list) {
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			if(temp.startsWith("sh"))
			{
				itr.remove();
			}

		}

	}

}
