package com.java.depth.exception;

public class ThrowDesc2 extends Throwable {
	public static void main(String[] args) throws ThrowDesc2, Exception {
		throw new Exception();
	}

}
