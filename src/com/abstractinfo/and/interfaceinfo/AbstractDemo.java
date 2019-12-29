package com.abstractinfo.and.interfaceinfo;

public abstract  class AbstractDemo {
	protected int a;
	/*AbstractDemo(int c)
    {
        a = 10;
    }*/
 
    abstract public void set(int a);
     
    ///cant be staic ,final,private
    abstract   int get();
    
    void display()
    {
    	System.out.println(get());
    }

}
