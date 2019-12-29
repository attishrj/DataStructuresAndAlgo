package com.ques.geeksTest.array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArraay {

	public static void main(String[] args) {
		int ar[] = { 7, 10, 4, 3, 6, 5, 2 };
	//	naiveLeader(ar);
       ArrayList<Integer> optimisedLeader = optimisedLeader(ar);
      optimisedLeader.forEach(System.out::print);
	}

	private static ArrayList<Integer> optimisedLeader(int[] ar) {
		ArrayList<Integer> list=new ArrayList<>();
      int current=ar[ar.length-1];
      list.add(current);
      for(int i=ar.length-2;i>0;i--)
      {
    	  if(current<ar[i])
    	  {
    		  current=ar[i];
    		  list.add(current);
    	  }
      }
      Collections.reverse(list);
	return list;
		
	}

	public static void naiveLeader(int[] ar) {
		int length = ar.length;
		for (int i = 0; i < length - 1; i++) {
			boolean flag=false;
			int j = i + 1;
			for (; j < length - 1; j++) {
				if(ar[i]<=ar[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(ar[i]);
			}
		}
		System.out.println(ar[length - 1]);
	}
	

}
