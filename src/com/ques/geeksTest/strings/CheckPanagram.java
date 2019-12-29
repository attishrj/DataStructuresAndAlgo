package com.ques.geeksTest.strings;

public class CheckPanagram {

	public static void main(String[] args) {
		//String str="The quick brown fox jumps over the lazy dog;";
		String str="Nymphs blitz quick vex dwarf jog";
		//String str="bbbbbbb nnbbbbnnnnnnnnnnnnnnnnnnnnnnnnnn bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
		if(isPanagram(str))
		{
			System.out.println("1");
			
		}
		else {
			System.out.println("0");
		}
	}

	private static boolean isPanagram(String s) {
		s=s.toUpperCase();
		/*int temp=0;
		boolean flag=false;
		//String[] split = str.split("\\s+");
		int count[]=new int[120];
		for(int i=0;i<str.length();i++)
		{
			char charAt=str.charAt(i);
			int j = charAt;
			count[j]++;
			
			 char charAt = str.charAt(i);
			count[charAt]++;
		}
		for (int i = 65; i <=90; i++) {
			if(count[i]==0)
			{
				return false;
			}
			
		}
		return true;
	}
*/
		 int[] count=new int[91];
	        //String[] str = s.split("\\s+");
	        for(int i=0;i<s.length();i++)
	        {
	            count[s.charAt(i)]++;
	        }
	        for(int i=65;i<=90;i++)
	        {
	            if(count[i]==0)
	            {
	                return false;
	            }
	        }
	        return true;
	    }
}
