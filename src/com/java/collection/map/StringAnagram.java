package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
	
	static boolean areAnagram(String str1,String str2)
	{
		Map<Character,Integer> hmap1=new HashMap<>();
		Map<Character,Integer> hmap2=new HashMap<>();
		char[] ar1= str1.toCharArray();
		char[] ar2= str2.toCharArray();
		for(int i=0;i<ar1.length;i++)
		{
			if(null==hmap1.get(ar1[i]))
			{
				hmap1.put(ar1[i], 1);
			}
			else {
				Integer c = hmap2.get(ar1[i]);
				 hmap1.put(ar1[i], ++c); 
			}
		}
		 for (int j = 0; j < ar2.length; j++) { 
			  
	            if (hmap2.get(ar2[j]) == null) 
	                hmap2.put(ar2[j], 1); 
	            else { 
	  
	                Integer d = (int)hmap2.get(ar2[j]); 
	                hmap2.put(ar2[j], ++d); 
	            } 
	        } 
		 
		 return hmap1.equals(hmap2);
			

	}

}
