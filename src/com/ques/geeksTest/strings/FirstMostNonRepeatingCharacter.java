package com.ques.geeksTest.strings;

public class FirstMostNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "hello";
		/*int index = getFirstNonRepeatatingCharacter(str);
		if(index==-1)
		{
			System.out.println("No element found");
			return;
		}
		System.out.println("first non repeatiating character "+str.charAt(index));*/
		 System.out.println(getFirstNonRepeatatingCharacter(str));

	}

	private static char getFirstNonRepeatatingCharacter(String str) {
		int count[] = new int[256];
		int index = Integer.MAX_VALUE;
		for (int i = 0; i < str.length(); i++) {
			char charAT = str.charAt(i);
			count[charAT]++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char charAt = str.charAt(i);
			if(count[charAt]==1)
			{
				index=i;
				break;
			}
		}
		 if(index==Integer.MAX_VALUE)
	      {
	          return '$' ;
	      }
	        return str.charAt(index);
	    }

}
