package com.ques.hackerrank;

public class Matrix1 {
	

	public static void main(String[] args) {
		int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
		int num=29;
		getPosition(mat,num);

	}

	private static void getPosition(int[][] mat, int num) {
		boolean flag=false;
		int size = mat.length;
		for (int i = 0; i < size; i++) {
			for (int j = size-1; j >=0; j--) {
				if (mat[i][j] == num) {
					flag=true;
					System.out.println(i + " ," + j);
					return;
					
				}
				
				
			}
			
		}
		System.out.println("Element not found");     
		/*if(!flag)
		{
			System.out.println("Element not found");
		}*/
		
	}

}
