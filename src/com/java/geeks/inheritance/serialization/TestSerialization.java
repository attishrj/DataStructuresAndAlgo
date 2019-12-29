package com.java.geeks.inheritance.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 ChildSerilization b1 = new ChildSerilization(10,20); 
         
	        System.out.println("i = " + b1.i); 
	        System.out.println("j = " + b1.j); 
	        
	        FileOutputStream fileOutputStream=new FileOutputStream("F:\\CJavaWks\\CJavaPrac\\src\\com\\java\\geeks\\inheritance\\serialization\\abc.txt");
	        ObjectOutputStream objectStream=new ObjectOutputStream(fileOutputStream);
	        objectStream.writeObject(b1);
	        objectStream.close();
	        fileOutputStream.close();
	        System.out.println("Object has been serialized"); 
	        
	        System.out.println("-------------------------");
	        
	        
	        FileInputStream fis = new FileInputStream("F:\\CJavaWks\\CJavaPrac\\src\\com\\java\\geeks\\inheritance\\serialization\\abc.txt"); 
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        ChildSerilization readObject = (ChildSerilization)ois.readObject();
	        ois.close();
	        fis.close();
	        System.out.println(readObject.i);
	        

	}

}
