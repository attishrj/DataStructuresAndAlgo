package com.ques.geeksTest.strings;

public class KeypadTyping {
	public static void main(String[] args) {

		String str = "hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvs";
		System.out.println("Number is  "+getTyping(str));
	}

	public static StringBuilder getTyping(String str) {
		char[] charArray = str.toCharArray();
		int keypad=0;
		StringBuilder builder=new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case 'a':
			case 'b':
			case 'c':
				keypad = 2;
				builder.append(keypad);
				//System.out.print(keypad);;
				break;
			case 'd':
			case 'e':
			case 'f':
				keypad = 3;
				//System.out.print(keypad);
				builder.append(keypad);
				break;
			case 'g':
			case 'h':
			case 'i':
				keypad = 4;
				//System.out.print(keypad);
				builder.append(keypad);
				break;
			case 'j':
			case 'k':
			case 'l':
				keypad = 5;
				//System.out.print(keypad);
				builder.append(keypad);
				break;
			case 'm':
			case 'n':
			case 'o':
				keypad = 6;
				//System.out.print(keypad);
				builder.append(keypad);
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				keypad = 7;
				//System.out.print(keypad);
				builder.append(keypad);
				break;
			case 't':
			case 'u':
			case 'v':
				keypad = 8;
				//System.out.print(keypad);
				builder.append(keypad);
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				keypad = 9;
				//System.out.print(keypad);
				builder.append(keypad);
				break;
			default:
				break;
			}
		}
		return builder;

	}

}
