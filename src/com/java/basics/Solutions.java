package com.java.basics;

import java.util.Scanner;

public class Solutions {

    public static int fibonacci(int n) {
    	if (n==0) {
			return 0;
		}
    	
    	if (n==1) {
			return 1;
		}
    	else{
    		return  fibonacci(n-1)+fibonacci(n-2);
    	}
    	
    	
    	
      
      
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }

}
