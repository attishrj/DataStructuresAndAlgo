package com.java.basics.overriden.scope;

public class BikeClass extends Vehicle {
	int ownBikeNumber;
	public BikeClass() {
	this.ownBikeNumber=254;
	
	}
	 public static void display() { 
         System.out.println("Static or class method from Derived"); 
    } 
	 @Override
	public int sum(int n1) {
		return super.sum(n1);
	}
	 public Integer sum(int n1,int n2) {
		 n1+=n2;
			return sum(n1);
		}
	 @Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return super.getMaxSpeed();
	}

}
