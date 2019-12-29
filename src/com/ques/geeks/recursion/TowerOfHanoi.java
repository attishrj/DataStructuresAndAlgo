package com.ques.geeks.recursion;

public class TowerOfHanoi {

	 public static void main(String args[]) 
	    { 
	        int n = 4; // Number of disks 
	        TOH(n, 'A', 'C', 'B');  // A, B and C are names of rods 
	    }

	private static void TOH(int n, char from, char destination, char auxilaary) {
		if(n==1)
		{
			System.out.println(" from "+from+" to destination - "+destination);
			return;
		}
		
		TOH(n-1,from,auxilaary,destination);
		System.out.print(" from "+from+" to destination -- "+destination);
		TOH(n-1,auxilaary,destination,from);
	} 

}
