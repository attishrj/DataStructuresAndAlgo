package com.java8;

interface MathOperation {
	int operation(int a, int b);
}

public class FunctionalProgramming {
	
	public static void main(String[] args) {
		FunctionalProgramming obj=new FunctionalProgramming();
		MathOperation addtion;
		addtion=(int a,int b)->{
			return a+b;
		};
		MathOperation subtraction=(int a,int b)->
		{
			return a>b?a-b:b-a;
		};
		int c=addtion.operation(2, 3);
		System.out.println(obj.testFunction(10, 30, subtraction));
	} 
		
   int testFunction(int a,int b,MathOperation result)
   {
	   return result.operation(a, b);
   }
}