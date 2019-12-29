package com.ques.geeks.recursion;

public class RopeMaximumCut {
	public static void main(String[] args) {
		int n = 23;
		int a = 11, b = 9, c = 12;
		int cuts[] = { a, b, c };
		int res = rodCutting(n, a,b,c);
		System.out.println(res);
	}
	

	private static int rodCutting(int n, int a, int b, int c) {

        if(n== 0)
          return 0;
        if(n < 0)
          return -1;
          
        int res = Math.max(Math.max(rodCutting(n-a, a, b, c), 
                rodCutting(n-b, a, b, c)),rodCutting(n-c, a, b,c));
                
        if(res == -1)
          return -1;
        return 1+res;
    
	}
}
