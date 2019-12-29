package com.ques.geeksTest.array;

public class NewYearChaos {

	public static void main(String[] args) {
		int ar[] = { 2, 5, 1, 3, 4 };
		int count = swap(ar);
		if(count==-1)
		{
			System.out.println("Too chaotic");
			return;
		}
		System.out.println(count);

	}

	
	public static int swap(int []ar)
	{
		 int ans = 0;
		    for (int i = ar.length - 1; i >= 0; i--) {
		        int ari = ar[i];
				if (ari - (i + 1) > 2) {		            return -1;
		        }
		        int b = ari - 2;
				int max = Math.max(0, b);
				for (int j = max; j < i; j++) {
					int arj = ar[j];
					if (arj > ari)
		            	ans++;
				}
		    }
		   return ans ;

	}

}
