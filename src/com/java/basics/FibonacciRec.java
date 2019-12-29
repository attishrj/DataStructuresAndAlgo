package com.java.basics;

public class FibonacciRec {

	    static int fib(int n) 
	    { 
	    if (n <= 1) 
	       return n; 
	    int fib1 = fib(n-1);
 		int fib2 = fib(n-2);
		return fib1 + fib2; 
	    } 
	       
	    public static void main (String args[]) 
	    { 
	    int n = 4; 
	    System.out.println(fib(n)); 
	    } 
	}
