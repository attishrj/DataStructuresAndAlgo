package com.ques.geeksTest.strings;

public class LeftMostNonRepeatingCharacter {

	public static void main(String[] args) {
		String str="abc";
		int position=nonrepeatingleftMostChar(str);
		if(position==-1)
		{
			System.out.println("No unique characters present");
			return;
		}
		int s=5;
		int fact=findFactRecursive(s);
		
		char c=(char)position;
		//System.out.println(" "+c);
		System.out.println(fact +"and " +findFactRecursive(s));

	}

	private static int findFactRecursive(int s) {
		if(s==0||s==1)
		{
			return 1;
		}
		
		return s*findFactRecursive(s-1);
	}
	private static int findFactIterative(int s) {
		int i;
		for( i=s;i>=0;i--)
		{
			i=i*(i-1);
		}
		
		return i;
	}


	private static int nonrepeatingleftMostChar(String str) {
		int count[]=new int[256];
		int mincount=Integer.MAX_VALUE;
		for (int i = 0; i < str.length(); i++) {
			char charAT=str.charAt(i);
			/*if(count[charAT]==1)
			{
				mincount=Math.max(mincount, i);
			}
			else{
			count[charAT]++;
			}*/
			count[charAT]++;
		}
		for(int i = 95; i < 102; i++)
		{
		     if(count[i]==1)
		     {
		    	 mincount=Math.min(mincount, i);
		     }
		}
		return mincount==Integer.MAX_VALUE?-1:mincount;
	}

}
