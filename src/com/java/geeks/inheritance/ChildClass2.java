package com.java.geeks.inheritance;

public class ChildClass2 extends ParentClass {
	int c1,d;
	int num3=25;
       public ChildClass2(int c, int d) {
    	   super(c,d);
    	   
	}
        
        public void setNum1(int num1,int num2) {
        	this.c1=10;
        }
        
        @Override
        public void setNum1(int num1) {
        	// TODO Auto-generated method stub
        	super.setNum1(num1);
        }
        
        @Override
        public void setNum2(int num2) {
        	this.d=25;
        }
        @Override
        public int getNum1() {
        	// TODO Auto-generated method stub
        	return this.c1;
        }
        
      //  @Override
        public void display2() {
        	super.display();
        	System.out.println(" "+c1+" "+d);
        }

}
