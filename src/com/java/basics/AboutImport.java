package com.java.basics;

public class AboutImport {

	public static void main(String[] args) {
		java.util.ArrayList<String> list= new java.util.ArrayList<String>();
		list.add("attish");
		list.add("raj");
		list.remove(1);
		list.add("pic");
		System.out.println("AboutImport.main()"+list.get(1));

	}

}
