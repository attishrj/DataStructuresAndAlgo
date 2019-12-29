package com.algo.dynamic.programming;

/**
 * using tabular and memoization methods
 */

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		int n = 6;
		System.out.println("Fibonacci.Memo"+fib.fibMemo(n));

	}


	final int MAX = 7;
	final int NIL = -1;
	int lookup[] = new int[MAX];
	/**memoization
	 */
	public int fibMemo(int n) {
		init();
		//if (lookup[n]==NIL) 
		{
			if (n<=1) {
				lookup[n]=n;
			}
			else {
				int fibMemo1 = fibMemo(n-1);
				int fibMemo2 = fibMemo(n-2);
				lookup[n]=fibMemo1+fibMemo2;
			}
		}
		return lookup[n];
	}

	void init() {
		for (int i = 0; i < MAX; i++) {
			lookup[i] = NIL;

		}
	}

	/**
	 * using tabular
	 */
	public static int FibTabular(int n) {

		int[] f = new int[n + 2];
		int i;
		f[0] = 0;
		f[1] = 1;
		for (i = 2; i <= n; i++) {
			int fi1 = f[i - 1];
			int fi2 = f[i - 2];
			f[i] = fi1 + fi2;
			if (fi1 == 0 || fi2 == 1) {
				System.out.println(fi1 + "and" + fi2);
			}
			System.out.println("Fibonacci.fib() i==" + i + "and f[i] " + f[i]);

		}
		return f[n];
	}

}
