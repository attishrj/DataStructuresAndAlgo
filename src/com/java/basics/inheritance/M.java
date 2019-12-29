package com.java.basics.inheritance;

public class M {
	int i;
	 
    public M(int i)
    {
        this.i = i--;
        System.out.println("m.i "+this.i);
    }

}
