package com.java.geeks.inheritance.serialization;

public class CloneImpl implements Cloneable {
	int i; 
    String s; 
  
    // A class constructor 
    public CloneImpl(int i,String s) 
    { 
        this.i = i; 
        this.s = s; 
    } 

    public Object clone()throws CloneNotSupportedException{  
    	return super.clone();  
    	} 
    public static void main(String[] args) throws CloneNotSupportedException {
    	CloneImpl s1=new CloneImpl(101,"amit");  
    	  
    	CloneImpl s2=(CloneImpl)s1.clone();  
    	System.out.println(s1.i+" "+s1.s);  
    	System.out.println(s2.i+" "+s2.s);  
	}
}
