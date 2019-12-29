package com.algo.dynamic.programming;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {
	public static void main(String[] args) {
		// n coins of given denominations
				int[] count = { 1, 2, 3 };

				// Total Change required
				int amount = 4;
				
				//int ways= funCalChange(N,S);
				
				System.out.println("CoinChange.main()"+coinChange(amount,count));
		
	}


	


	private static int coinChange(int amount, int[] coins) {
		int[] combination=new int[amount+1];
		combination[0]=1;
		for (int coin:coins) {
			for (int i = 1; i < combination.length; i++) {
				if (i>=coin) {
					int remaining = combination[i-coin];
					combination[i]=combination[i]+remaining;
					printAmount(combination);
				}
				
				
			}
			System.out.println();
			
		}
		return combination[amount];
	}





	private static void printAmount(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
	}





	private static int funCalChange(int n, int[] s) {
		List<Integer> resultList=new ArrayList<>();
		for (int i = 0; i < s.length; i++) {
			int j = s[i];
			int quotient = n/j;
			int remainder = n%j;
			int number=quotient+remainder;	
			
		   resultList.add(number);	
		}
		return resultList.size();
		
	}

}
