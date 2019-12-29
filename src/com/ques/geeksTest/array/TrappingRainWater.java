package com.ques.geeksTest.array;

public class TrappingRainWater {

	public static void main(String[] args) {
		int ar[]={3,0,1,2,5};
		int ar2[]={0,1,0,2,1,0,1,3,2,1,2,1}; 
		int res=trapWater(ar2);

	}

	private static int trapWater(int[] ar) {
        int res=0;
		for(int i=1;i<ar.length-1;i++)
		{
			int lMax=ar[i];
			for(int j=0;j<i;j++)
			{
				 lMax=Math.max(lMax, ar[j]);
				 System.out.println("lMax " +lMax);
			}
			int rMax=ar[i];
			for(int j=i+1;j<ar.length;j++)
			{
				rMax=Math.max(rMax, ar[j]);
				 System.out.println("rMax " +rMax);
			}
			res+=(Math.min(lMax, rMax)-ar[i]);
			System.out.println(res);
		}
		return res; 
				
	}

}
