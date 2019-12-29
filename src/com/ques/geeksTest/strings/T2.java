package com.ques.geeksTest.strings;
import static java.lang.System.identityHashCode;

public class T2 {

	public static void main(String[] args) {
/*	int a=3|5;
	System.out.println(a);*/
		
		//asg1();
		aboutString();
		


	}

	private static void aboutString() {
		String s=new String("hello");
		String s2=new String("hello");
		System.out.println(" "+identityHashCode(s)+" --- "+identityHashCode(s.intern()));
		System.out.println(" "+identityHashCode(s2)+" --- "+identityHashCode(s2.intern()));
		s2=s2+"ram";
		System.out.println(s2+"  "+identityHashCode(s2)+" --- "+identityHashCode(s2.intern()));
		
	}

	private static void asg1() {
		String a= "abc";
		String b=new String("abc");
		System.out.printf("a: %d | %d\n ",identityHashCode(a),identityHashCode(a.intern()));
		
		System.out.printf("b: %d | %d\n ",identityHashCode(b),identityHashCode(b.intern()));
		
		
		
		
		StringBuilder x= new StringBuilder("abc");
		StringBuilder y=new StringBuilder("abc");
		System.out.println("a: %d  "+identityHashCode(x) +" ");
		
		System.out.println("b:  "+identityHashCode(y)+" "+(x==y));
	}

}
