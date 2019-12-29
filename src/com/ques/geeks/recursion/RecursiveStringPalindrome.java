package com.ques.geeks.recursion;

public class RecursiveStringPalindrome {

	public static void main(String[] args) {
		/*String st="hello";
		System.out.println(st.substring(1));*/
		
		String str="civic";
				int end=str.length()-1;
				int start=0;
				boolean res=isPalindrome(str,start,end);
				System.out.println(res);
	}

	private static boolean isPalindrome(String str, int start, int end) {
	  if(start>=end)
	  {
		  return true;
	  }
		if(str.charAt(start)!=str.charAt(end))
		{	
		return false;
	}
		
	 return isPalindrome(str,start+1,end-1);

	}
}
