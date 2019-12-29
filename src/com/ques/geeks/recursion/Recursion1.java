package com.ques.geeks.recursion;

public class Recursion1 {

	public static void main(String[] args) {
    int n=5;
    recursive(n);
}

	private static void recursive(int n) {
          if(n==0||n==1)
          {
        	  return ;
          }
          System.out.print(n);
           recursive(n-1);
	}

}
