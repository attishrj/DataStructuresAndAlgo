package com.java8;

public interface JAVA8Interface2 {
	void print();

	 default void defaultMethod(){
	        System.out.println("Default");
	    }

	    static void staticMethod(){
	        System.out.println("Static 2");
	    }   
}
