package com.ques.geeksTest.strings;

public class RemoveAllAdjacentDuplicates {

	public static void main(String[] args) {
		String str="azxxzy";
		String res=removeDup(str);
		System.out.println(res);

	}

	private static String removeDup(String str) {
		char[] charArray = str.toCharArray();
		StringBuilder builder=new StringBuilder(str);
		for (int i = 0; i < charArray.length-1; i++) {
	//	for (int j = 0; j <=i+1; j++) 
		{
			char charAtI = builder.charAt(i);
			char charAtJ = builder.charAt(j);
			if(charAtI==charAtJ)
			{
				builder.delete(j, j);
			}
		}
			
		}
		return builder.toString();
	}

}
