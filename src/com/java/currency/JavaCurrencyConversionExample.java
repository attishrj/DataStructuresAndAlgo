package com.java.currency;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyConversionExample {
	public static void main(String[] args) {
		System.out.println("Enter");
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
       String US=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
       String India=NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
       String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
       String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
       
       System.out.println(0);
        
        System.out.println("US: " + US);
      System.out.println("India: " + India);
       System.out.println("China: " + china);
       System.out.println("France: " + france);
		
	}
}
