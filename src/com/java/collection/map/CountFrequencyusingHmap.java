package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyusingHmap {

	public static void main(String[] args) {
	int ar[]={1,3,4,2,2};
	//countFreq(ar);
	int res=findDuplicate(ar);
	System.out.println(res);

	}

    public static int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;
        
        for(int i=0;i<=nums.length;i++)
        {
           if(! map.containsKey(nums[i]))
           {
               map.put(nums[i],1);
           }
            else
            {
             int getKey=map.get(nums[i]);
                map.put(nums[i],getKey+1);
                return res=nums[i];
            }    
    }
        return res;
}

	private static void countFreq(int[] nums) {
		 Map<Integer,Integer> map=new HashMap<>();
	        for(int i=0;i<=nums.length;i++)
	        {
	           if(! map.containsKey(nums[i]))
	           {
	               map.put(nums[i],1);
	           }
	            else
	            {
	                int getKey=map.get(nums[i]);
	               map.put(nums[i], getKey+1);
	            }    
	    }
	}

}
