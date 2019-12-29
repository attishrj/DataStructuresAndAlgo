package com.java.depth.exception;

public class Car extends Vehicle {
	String trans;

	public Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this.trans = trans;
	}
	public Car(String trans) {
		super(trans);
		this.trans=trans;
	}
	

	public static void main(String[] args) {
		Car car=new Car("auto");
	}

}
