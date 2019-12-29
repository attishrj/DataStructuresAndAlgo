package com.java.basics;
import java.io.IOException;

public class Parent extends GrandParent {
	int parent=10;  
	public Parent() {
		System.out.println("Parent Constructor");
	}
	  void method() throws IndexOutOfBoundsException, IOException 
    { 
        System.out.println("P ::show() called"); 
    } 
	  int display()
	  {
		  return 12;
	  }
/*	  public static void main(String[] args) throws IOException {
		  GrandParent obj=new Parent();
		  obj.method();
		
	}
*/
}
