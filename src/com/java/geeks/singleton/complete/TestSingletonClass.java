package com.java.geeks.singleton.complete;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSingletonClass {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
	 Singleton obj1=Singleton.getInstance();
	 System.out.println("obj1.hashCode() "+obj1.hashCode());
	// Singleton obj2=Singleton.getInstance();
	// System.out.println("obj2.hashCode() "+obj2.hashCode());
	 
    Singleton obj3=(Singleton) obj1.clone();
    
    FileOutputStream fileOutputStream=new FileOutputStream("F:\\CJavaWks\\CJavaPrac\\src\\com\\java\\geeks\\singleton\\complete\\abc.txt");
    ObjectOutput objectOutput=new ObjectOutputStream(fileOutputStream);
    objectOutput.writeObject(obj1);
    objectOutput.close();
    fileOutputStream.close();
    obj1.setI(25);
   // System.out.println(obj1.readResolve());
    FileInputStream fileInputStream=new FileInputStream("F:\\CJavaWks\\CJavaPrac\\src\\com\\java\\geeks\\singleton\\complete\\abc.txt");
    ObjectInput objectInput=new ObjectInputStream(fileInputStream);
    Singleton  newObj=(Singleton)objectInput.readObject();
    System.out.println(" newObj.hashCode() "+newObj.hashCode());
    System.out.println(newObj.getI());
    System.out.println(obj1==newObj);
    
	}

}
