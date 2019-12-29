package com.ques.hackerrank;

public class Recursion {
	
	public static String reverse(String input)
	{
		if(input.isEmpty())
		{
			return input;
		}
		if (input.charAt(0)==input.charAt(input.length()-1)) {
			
		}
		String res="";
		String reverse = reverse(input.substring(1)+input.charAt(0));
		if( input.equals(reverse))
		{
			res= "true";
		}
		res="false";
		return res;
	}

	public static void main(String[] args) {
		String name="madam";
		System.out.println("Recursion.main()"+reverse(name));

	}

}
