package com.java.geeks.inheritance.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class ChildNotSerilizable extends ParentSerialization {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7118316901623224528L;
	int i, j, k;

	public ChildNotSerilizable(int i, int j, int k) {
		super(i);
		this.j = j;
		this.k = k;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		ChildNotSerilizable obj = new ChildNotSerilizable(10, 20, 30);
		FileOutputStream outputStream=new FileOutputStream("F:\\CJavaWks\\CJavaPrac\\src\\com\\java\\geeks\\inheritance\\serialization\\pqr.txt");
        ObjectOutputStream obStream=new ObjectOutputStream(outputStream);
        obj.serilazationNotSupporte(obStream,obj);
	}

	private void serilazationNotSupporte(ObjectOutputStream obStream, ChildNotSerilizable obj) throws IOException
	{
		obStream.writeObject(obj);
		
	}

}
