package com.learn.data.structure;

public class Test {
	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println("Test.main()"+10%b);
		/*
		int[] ar={22,3,34,22,5,1,6};
		//1,3,34,1,5,1,6
		//1,1,3,34,5,1,6
		int temp ;
		int size = ar.length;
		for (int i = 0; i < size-1; i++) {
			 temp = ar[i];
			 for (int j = i+1; j < size; j++) {
				 if (temp==ar[j]) {
					ar[i]=1;
					ar[j]=1;
				}
				
			}
			
		}
		relocate(ar,size);
		Utility.disp(ar);
	*/}

	private static void relocate(int[] ar, int size) {
		
		int j=size-1;
		for (int i = size-1; i >0; i--) {
			if (ar[i]!=1) {
				ar[j--]=ar[i];
			}
			
		}
		while (j>=0) {
        ar[j--]=1;			
		}
		
	}

}
