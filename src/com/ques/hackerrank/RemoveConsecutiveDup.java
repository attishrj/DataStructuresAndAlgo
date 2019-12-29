package com.ques.hackerrank;

import java.util.Vector;

public class RemoveConsecutiveDup {

	public static void main(String[] args) {
		String str = "aabbbaccddddc"; 
	  remove3ConsecutiveDuplicates(str); 

	}

	private static void remove3ConsecutiveDuplicates(String str) {
		Vector<Character> vlist=new Vector<>();
		for (int i = 0; i < str.length(); i++) {
			
			vlist.add(str.charAt(i));
			 if (vlist.size() > 2)  
		        { 
			int sz = vlist.size(); 
			 if (vlist.get(sz - 1) == vlist.get(sz - 2) &&  
		                vlist.get(sz - 2) == vlist.get(sz - 3))  
		            { 
		                vlist.setSize(sz - 3); // Removing three characters 
		                                // from the string 
		            } 
			
		}
		}
		 for (int i = 0; i < vlist.size(); ++i) 
		        System.out.print(vlist.get(i)); 
	}

}
