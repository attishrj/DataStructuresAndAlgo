package com.ques.hackerrank;

public class SherlockValidString {

	public static void main(String[] args) {
	String str="aabbcd";
	System.out.println(isValid(str));

	}
	
	static String isValid(String s) {
        int []count=new int[128];
        if(null!=s)
        {
          for(int i=0;i<s.length();i++)
          {
              count[s.charAt(i)]++;
          }
          for(int i=96;i<count.length;i++)
          {
              if(count[i]>2)
              {
              return "NO";
              }
                return "YES";
          }
        }
      return "NO";

    }

}
