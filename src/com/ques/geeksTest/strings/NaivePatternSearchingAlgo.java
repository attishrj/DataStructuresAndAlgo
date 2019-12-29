package com.ques.geeksTest.strings;

public class NaivePatternSearchingAlgo {
	public static void main(String[] args) {
		String str="This is a test of test";
		String patternz ="test";
	//	System.out.println(" index of test "+str.indexOf("ish") +"and length of pattern is  "+patternz.length()+ " and string is "+str.length());
		
		//String text="AABAACAADAABAABA";
		//String text1="AABACDEFGHAABAABA";
		//String pattern="AABA";
		String text="THIS IS A TEST TEXT";
		String pattern="TEST";
		System.out.println("ans is ");
		isPatternFound(text,pattern);
	}

	private static void isPatternFound(String text, String pattern) {
		int textLengh=text.length();
		int patternLength=pattern.length();
		int shift=textLengh-patternLength;
		for (int i = 0; i < shift; i++) 
		{   
			int j;
			for(j=0;j<patternLength;j++)
			{
				char charAttext = text.charAt(i+j);
				char charAtpattern = pattern.charAt(j);
				if(charAttext!=charAtpattern)
				{
					break;
				}
			}
			 if (j == patternLength) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
	                
				 System.out.println("Pattern found at index " + i);
			
		}
		
	}

}
