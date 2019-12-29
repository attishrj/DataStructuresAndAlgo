package com.ques.geeksTest.strings;

public class StringCompression {

	public static void main(String[] args) {
		String str = "aabbdccc";

		char ch[] = { 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' ,'a'};
		String s = new String(ch);
		outputString(s);
		
		System.out.println(compressionChar(ch));
	}

	private static void outputString(String s) {
		String compressed = checkCompression(s);
		String compressed2 = compressionLeet(s);
		System.out.println(compressed);
	}

	private static String checkCompression(String str) {
		String res = "";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			int j = i + 1;
			char charAtI = str.charAt(i);
			char charAtJ = str.charAt(j);
			if (charAtI == charAtJ) {
				count++;
			} else {
				res = res + charAtI + count;
				count = 1;
			}

		}
		res = res + str.charAt(str.length() - 1) + count;
		return res;
	}

	public static String compressionLeet(String str) {
		String res = "";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			int j = i + 1;
			char charAtI = str.charAt(i);
			char charAtJ = str.charAt(j);
			if (charAtI == charAtJ) {
				count++;
			} else {
				res = count > 1 ? res + charAtI + count : res + charAtI;
				count = 1;
			}

		}
		res = count > 1 ? res + str.charAt(str.length() - 1) + count : res + str.charAt(str.length() - 1);
		return res;
	}
	public static int compressionChar(char[] ch) {
		String res = "";
		int count = 1;
		for (int i = 0; i < ch.length - 1; i++) {
			int j = i + 1;
			if (ch[i] == ch[j]) {
				count++;
			} else {
				res = count > 1 ? res + ch[i] + count : res + ch[i];
				count = 1;
			}

		}
		res = count > 1 ? res + ch[ch.length - 1] + count : res + ch[ch.length - 1];
		ch=res.toCharArray();
		return ch.length;
	}

	/*
	 * private static void checkCompression(String str) { Map<Character,Integer>
	 * map=new HashMap<>(); StringBuilder sb=new StringBuilder(); int count=1;
	 * for (int i = 0; i < str.length()-1; i++) { int j=i+1; char charAtI =
	 * str.charAt(i); char charAtJ = str.charAt(j); if(charAtI==charAtJ) {
	 * map.put(charAtI, ++count); } else{
	 * 
	 * count=1; } } for (int i = 0; i < str.length(); i++) { } }
	 */

}
