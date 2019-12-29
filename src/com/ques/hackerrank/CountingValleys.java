package com.ques.hackerrank;

public class CountingValleys {
	
	static int countingValleys(int n, String s) {
		
		int altitude=0;
		int valleyCounter=0;
		
		for (int j=0;j<s.length();j++) {
			char charAt=s.charAt(j);
			if (charAt=='U') {
				altitude++;
				if (altitude==0) {
					valleyCounter++;
				}
			}
			else {
				altitude--;
			}
		}
		return valleyCounter;
	}


	public static void main(String[] args) {
		String s="UDDDUDUU";
		int n=s.length();
		
		
		int result = countingValleys(n, s);
		System.out.println("CountingValleys.main()"+result);
	}

}
