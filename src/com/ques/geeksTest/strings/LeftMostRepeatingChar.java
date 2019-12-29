package com.ques.geeksTest.strings;

public class LeftMostRepeatingChar {

	public static void main(String[] args) {
		String str="tthe quick brown fox jumps over the lazy dog";
		 int position=findLeftMostChar(str);
		 if(position==-1)
		 {
			 System.out.println("Not found");
			 return;
		 }
		 System.out.println(" "+str.charAt(position));
		// TODO Auto-generated method stub

	}

	private static int findLeftMostChar(String str) {
		 boolean visited[]=new boolean[256];
		 //done for sentence;	
		 String[] strAr=str.split("\\+");
		 str=strAr[0];
		 int res=Integer.MAX_VALUE;
		  for(int i=0;i<str.length();i++)
		  {
			  char charAT=str.charAt(i);
			  if (visited[charAT]==false) {
				  visited[charAT]=true;
				
			}
			  else{
				  res=Math.min(i, res);
			  }
		  }
		// TODO Auto-generated method stub
		return res==Integer.MAX_VALUE?-1:res;
	}

}
