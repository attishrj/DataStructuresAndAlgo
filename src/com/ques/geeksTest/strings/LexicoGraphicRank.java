package com.ques.geeksTest.strings;

public class LexicoGraphicRank {

	public static void main(String[] args) {
		String str="vsrtkjpre";
		System.out.println(findRank(str));

	}
	
    static int findRank(String S) 
    {
    char str[] = S.toCharArray();   
    int rank=1;
    int n=S.length();
    int fact=findFactRecursive(n);
    int count[]=new int[256];
    for (int i = 0; i < S.length(); i++) {
			char charAT=S.charAt(i);
			count[charAT]++;
			if(count[charAT]>1)
			{
				rank=0;
				return rank;
			}
    }
    
     for (int i = 1; i < 256; i++) {
			
			count[i]+=count[i-1];
    }
    for (int i = 0; i < n; i++) {
			
		fact=fact/(n-i);
		rank=rank+count[str[i]-1]*fact;
		for(int j=str[i];j<256;++j)
		{
		   -- count[j];
		}
		
    }
    return rank;
        
    }
     static int findFactRecursive(int s) {
		if(s==0||s==1)
		{
			return 1;
		}
		
		return s*findFactRecursive(s-1);
	}

}
