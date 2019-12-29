package com.ques.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairShocks {
	
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	/*
    	Set<Integer> set=new HashSet<>();
    	int count =0;
    	for (int i = 0; i < n; i++) {
    		int element=ar[i];
    		if (set.contains(element)) {
    			set.remove(element);
    			count++;
				
			}
    		else{
    			set.add(ar[i]);
    		}
			
		}
    	
    	return count;
*/
    	   Arrays.sort(ar);
    	   int stored[]=new int[n];
    	   int match=0;
    	        for(int i=0;i<n-1;i++)
    	        {
                    for(int j=i+1;j<n;j++)
                    if(stored[i]!=-1&&stored[j]!=-1
                    &&
                    ar[i]==ar[j])
               {
                   stored[j] = -1;

                   ++match;
                   break;
               }
                }
     
      return (match);
    	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int[] ar = {10,20,20,10,10,30,50,10,20};
        int n=ar.length;


        int result = sockMerchant(n, ar);
        System.out.println("PairShocks.main()"+result);
        
        
    }

	

}
