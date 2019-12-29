package com.java.basics;

public class AboutEquals {
	int m1;
	int m2;
	public AboutEquals(int m1, int m2) {
		this.m1 = m1;
		this.m2 = m2;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return (obj instanceof AboutEquals);
	}

}
