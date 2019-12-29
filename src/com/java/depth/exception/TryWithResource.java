package com.java.depth.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource implements AutoCloseable{
	public static void main(String[] args) throws IOException {
		
	//BufferedReader reader;
	try(BufferedReader reader=new BufferedReader(new FileReader("F:\\CJavaWks\\CJavaPrac\\src\\com\\java\\geeks\\singleton\\complete\\abc.txt")))
	 
	{
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
