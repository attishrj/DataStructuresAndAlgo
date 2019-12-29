package com.ques.geeks.recursion;

public class SetOfString {
	
	public static void main(String[] args) {
		String str = "abc";  
	    int index = 0; 
	    String curr=""; 
	    powerSet(str,index,curr);

	}

	private static void powerSet(String str, int index, String curr) {
		int length=str.length();
		if(length==index)
		{
			System.out.println(curr);
			return;
		}
		powerSet(str, index+1, curr+str.charAt(index));
		powerSet(str, index+1, curr  );
		
	}

}
