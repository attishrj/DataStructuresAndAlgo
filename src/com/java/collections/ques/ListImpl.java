package com.java.collections.ques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListImpl {
	
	void input(Scanner sc, int size, List<String> list)
	{
		System.out.println("Enter elements");
		
		int i = 0;
		while (i<size) {
			list.add(sc.next());
			i++;
		}
		
	}
	
	void display(List<String> list)
	{
		System.out.println("ListImpl.display()");
	   Iterator<String> iterator = list.iterator();
	   int sum=0;
	  try {
	//	boolean hasNext = iterator.hasNext();
		while (iterator.hasNext()) {
			 iterator.next();
			
		}
		System.out.println("sum is"+sum);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
	
	
	List<String> sort(List<String> obj)
	{
		Collections.sort(obj);
		
		return obj;
		
	}
	

 	public static void main(String[] args) {
 		
 		Scanner sc=new Scanner(System.in);
 		 System.out.println("Enter the size of input list");
 		ListImpl listimpl=new ListImpl();
 		List<String> list=new ArrayList<String>();
  		int size=sc.nextInt();
  		listimpl.input(sc,size,list);
  		listimpl.sort(list);
  		
  		listimpl.display(list);
 	
 		sc.close();
 
 	
 			}

}
