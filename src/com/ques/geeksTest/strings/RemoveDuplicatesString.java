package com.ques.geeksTest.strings;

public class RemoveDuplicatesString {
	float i;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String str = "aaaaabbbbbb";
		String test="aabbbaccddddc";
		System.out.println(removeAllConsecutiveDuplicates(str));
		System.out.println(removeThreeConsecutiveDuplicates(test));*/
		float i;
		int j=07;
		System.out.println(i);
		System.out.println(j);

	}

	private static String removeThreeConsecutiveDuplicates(String str) {
		String res="";
		int count=1;

		
		
		for (int i = 0; i < str.length()-3; i++) {
			if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i+1)==str.charAt(i+2))
			{
				
				res=res+str.charAt(i);
				//str=res;
				//i--;
			}
			else{
				res=res+str.charAt(i);
			 
			}
			
		}
		res=res+str.charAt(str.length()-2);
		return res;
	}

	private static String removeAllConsecutiveDuplicates(String str) {
		String res = "";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				res = res + str.charAt(i);
			}
		}
		return res = res + str.charAt(str.length() - 1);
	}

}
