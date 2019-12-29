package com.java.basics;

public class AboutStrings {
	public static void main(String[] args) {
	//	basic1();
		
		
		String s="GiraffeeAndZebra";
		System.out.println(s.substring(4, 8));
		String s2="shyam";
		//s=s+s2;
		s=s.concat(s2);
	//	System.out.println(s);

	}

	private static void basic1() {
		String s="hello";
		s=s.concat("hi");
		String s2=s;
		//s="hii";
		System.out.println(s==s2);
		StringBuilder builder=new StringBuilder("ram");
	builder.append("shyam");
	StringBuilder builde2=new StringBuilder("ramshyam");
	
		
		System.out.println("AboutStrings.main()"+s);
		System.out.println("AboutStrings.main()"+builder);
		System.out.println(builder.equals(builde2));
	}

}
