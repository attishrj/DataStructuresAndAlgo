package com.ques.geeksTest.strings;

public class RepeatingCharacter_FirstAppearanceLeftmost {
	
	
	public static int findLeftMostRepeatingCharacter(String str) {
		boolean[] visited= new boolean[256];
		int res=-1;
		/*for(int i=0;i<visited.length;i++)
		{
			visited[i]=false;
			
			
		}*/
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char charAt = str.charAt(i);
			if(visited[charAt]==false)
			{
				visited[charAt]=true;
			}
			else
				res=i;
		}
		
		return res==Integer.MAX_VALUE?-1 :res;
	}
	public static void main(String[] args) {
		
		String str="The quick brown fox jumps over the lazy dog;";
		int count[]=new int[124];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		 int index=findLeftMostRepeatingCharacter(str);
		 if (index == -1) 
		        System.out.printf("Either all characters are "
		            +"distinct or string is empty"); 
		    else
		        System.out.printf("First Repeating character"
		            +" is %c", 
		            str.charAt(index)); 
		
		System.out.println("  "+str.charAt(checkindex(str)));
	}
	public static int checkindex(String str) {
		int res=-1;
		for(int i=str.length()-1;i>=0;i--)
		{
			res=i;
			System.out.println("RepeatingCharacter_FirstAppearanceLeftmost.checkindex() "+i );
		}
		return res;
	}

	}
