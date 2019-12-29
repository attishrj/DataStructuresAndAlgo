package com.learn.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
 Constructor<SampleClass> constructor = SampleClass.class.getConstructor(String.class);
    System.out.println("ConstructorDemo.main()"+constructor);
  SampleClass sampleObject = constructor.newInstance("data");
   System.out.println(sampleObject.getSampleField());
	}

}
