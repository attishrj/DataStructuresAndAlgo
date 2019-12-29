package com.java.basics.overriden.scope;

public class Vehicle {
	int maxSpeed;
	String model;
	static String engine;
	static {
		engine="name";
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int sum(int n1)
	{
		n1+=n1;
		return n1;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	  public static void display() { 
	        System.out.println("Static or class method from Base"); 
	    } 

}
