package com.ques.hackerrank;

import com.learn.data.structure.Utility;

public class TestRemoveDup {

	public static void main(String[] args) {
	int ar[]={22,33,34,22,5,1,6};
	 removedup(ar);
	 Utility.disp(ar);

	}

	private static void removedup(int[] ar) {
		for (int i = 0; i < ar.length-1; i++) {
			int temp=ar[i];
			for (int j = i+1; j < ar.length; j++) {
				if (temp==ar[j]) {
					ar[i]=1;
					ar[j]=1;	
					
				}
				
			}
			
		}
		separate(ar);
		
	}

	private static void separate(int[] ar) {
		int j=ar.length-1;
		for (int i = ar.length-1;i>0; i--) {
			if (ar[i]!=1) {
				
				ar[j--]=ar[i];
				
			}
			
			
		}
		
		
	}

}
