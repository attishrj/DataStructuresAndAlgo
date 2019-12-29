package com.java.basics.innerclass;

public class DemoOuterClass {
	int a = 1;

    void func()
    {
        DemoInnerClass obj = new DemoInnerClass();
        obj.display();
        System.out.println(new DemoInnerClass().b);
    }
 
	
	 class DemoInnerClass
	    {
	        int b = 2;
	 
	        void display()
	        {
	            System.out.println("na = " +a);
	        }
	        void get()
	        {
	            System.out.println("nb = " + b);
	        }
	    }

}
