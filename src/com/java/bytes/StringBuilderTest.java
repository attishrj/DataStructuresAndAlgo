package com.java.bytes;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder("Love");
		String s1="java";
       builder.append(s1);
       int indexOf = builder.indexOf(s1);
       System.out.println(builder);
       System.out.println(indexOf);
       
	}

}
