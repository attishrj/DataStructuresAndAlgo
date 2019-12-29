package com.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {
	public static void main(String[] args) {
		List<Student> slist = new ArrayList<>();
		addtoList(slist);
		Object objar[] = slist.stream().map(Student::getRoll).toArray();
		int[] arr = new int[objar.length];
		convertToint(objar, arr);
		Arrays.sort(arr);

		int studentRollnumber = StudentList.getStudentRollnumber(arr, 218, 0, arr.length - 1);
		if (-1 != studentRollnumber) {
			System.out.println("Found at position" + studentRollnumber);
			return;
		} else {
			System.out.println("Not present in the list");
		}
	}

	private static void convertToint(Object[] objar, int[] arr) {
		for (int i = 0; i < objar.length; i++) {
			arr[i] = (int) objar[i];

		}

	}

	private static void addtoList(List<Student> slist) {
		slist.add(new Student(11));
		slist.add(new Student(21));
		slist.add(new Student(31));
		slist.add(new Student(121));
		slist.add(new Student(128));
		slist.add(new Student(199));
		slist.add(new Student(218));
		slist.add(new Student(69));
		slist.add(new Student(228));
	}

	public static int getStudentRollnumber(int rollArr[], int searchElement, int start, int end) {
		int mid = (start + (end - start) / 2);
		if (searchElement == rollArr[mid]) {
			return mid;
		}
		if (searchElement < rollArr[mid]) {
			return getStudentRollnumber(rollArr, searchElement, start, mid - 1);
		}
		if (searchElement > rollArr[mid]) {
			return getStudentRollnumber(rollArr, searchElement, mid + 1, end);
		}
		return -1;
	}

}
