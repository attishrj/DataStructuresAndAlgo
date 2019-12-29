package com.java.basics;

public class AboutOverloading {
	  public  int  sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	  
	    // Overloaded sum(). This sum takes three int parameters 
	    public static int sum(int x, int y, int z) 
	    { 
	    	AboutOverloading s=new AboutOverloading();
	    	z=s.sum(x,y);
	        return (x + y + z); 
	    } 
	    
	public String sum(int x, int y, int z, int n) {
		
		 n = sum(x,y,z);
		int p = (x + y + z+n);
		System.out.println(p);
		return "hello";
	}
	    
	  
	    // Overloaded sum(). This sum takes two double parameters 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 

	public static void main(String[] args) {
		AboutOverloading s=new AboutOverloading();
		// System.out.println(s.sum(10, 20)); 
	      //  System.out.println(s.sum(10, 20, 30)); 
	        System.out.println(s.sum(10, 20, 30,40)); 
	     //   System.out.println(s.sum(10.5, 20.5));
	}

}
