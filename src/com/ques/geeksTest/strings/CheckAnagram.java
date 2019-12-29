package com.ques.geeksTest.strings;

public class CheckAnagram {

	public static void main(String[] args) {
		String str1="aab";
		String str2="baaa";
		boolean result=isAnagram(str1,str2);
		//System.out.println("CheckAnagram.main()"+result);
		System.out.println("CheckAnagram.main()"+isAnagramAlternate(str1, str2));
		
	}

	private static boolean isAnagram(String str1, String str2) {
		
		int chArray[]=new int[256];
		int chArray2[]=new int[256];
		for (int i = 0; i < str1.length(); i++) {
			chArray[str1.charAt(i)]++;
			
		}
		for (int i = 0; i < str2.length(); i++) {
			char charAt = str2.charAt(i);
			chArray2[charAt]++;
			
		}
		for (int i = 0; i < 256; i++) {
			if(chArray[i]!=chArray2[i])
			{
				return false;
			}
			
		}
		return true;
		
	}
	private static boolean isAnagramAlternate(String str1, String str2) {

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		int chArray[]=new int[256];
		if(str1.length()!=str2.length())
		{
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			
			chArray[str1.charAt(i)]++;
			
		}
		for (int i = 0; i < str1.length(); i++) {
			char charAt = str2.charAt(i);
			chArray[charAt]--;
			
		}
		for (int i = 0; i < 256; i++) {
			if(chArray[i]!=0)
			{
				return false;
			}
			
		}
		return true;
		
	}


}
