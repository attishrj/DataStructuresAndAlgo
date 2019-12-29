package com.ques.geeksTest.strings;

public class RepeatingCharacter_FirstAppearance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="tcount";
		System.out.println(" "+findfirstMostRepeatingCharacter(str));

	}

	public static Object findfirstMostRepeatingCharacter(String str) {
		
		int count[]=new int[256];
		char charAt = 0;
		int tcount=0;
		for (int i = 0;  i< str.length(); i++) {
			charAt=str.charAt(i);
		///	int j = charAt-'a';
			count[charAt]++;
			if(count[charAt]>1)
			{
				tcount++;
				break;
			}
			
		}
		if(tcount==0)
		{
			return -1;
		}
		return charAt;
	}

}
