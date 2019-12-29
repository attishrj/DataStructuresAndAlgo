package com.ques.geeksTest.strings;

public class MinimumIndexCharacter {
	public static void main(String[] args) {
		String str1="vsizcnmjilegtiugfxqtkeggknxxojrlczmgozrykxgefdmkadfmjotvdsuremfgnroeqfeddljkqvvqacejszfwszpwnue";
		String str2="douhezn";
		char c=getMinimumIndexChar(str1,str2);
		System.out.println(" ans is "+c);
	}

	public static char getMinimumIndexChar(String str1, String str2) {
		int[] temp = new int[str2.length()];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < str2.length(); i++) {

			char charAT = str2.charAt(i);
			// if(str1.indexOf(charAT)!=-1)
			{
				temp[i] = str1.indexOf(charAT);
			}
		}
	//	min = temp[0];
		for (int i = 0; i < temp.length ; i++) {

		
		
		}
         if(min==Integer.MAX_VALUE)
         {
        	 System.out.println("element not return");
        	 return 0;
         }
		return str1.charAt(min);
	}

}
