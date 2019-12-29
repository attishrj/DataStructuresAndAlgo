package com.ques.geeksTest.array.prefixSum;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int ar[]={43 ,34 ,2 ,8 ,17 ,5 ,11 ,8};
		System.out.println("Equillibrium point is "+equilibriumPointBestSol(ar, ar.length));
		int ar2[]={3 ,4 ,8 ,-9 ,20 ,6};
		int efficient=ar2[efficientEquilibriumPoint(ar2)];
		System.out.println(efficient);
	}

	
	 private static int efficientEquilibriumPoint(int[] ar) {
		 int sum=0;
		 int leftSum=0;
		 for (int i = 0; i < ar.length; i++) {
			sum+=ar[i];
		}	
		 for (int i = 0; i < ar.length; i++) {
				sum-=ar[i];
				if(sum==leftSum)
				{
					return i;
				}
				leftSum=leftSum+ar[i];
			}
		return -1;
	}


	public static int equilibriumPointBestSol(int arr[], int n) {
	        // Your code here
	        int sum=0;
	        int l_sum=0;
	        for(int i=0;i<n;i++)
	        {
	            sum+=arr[i];
	        }
	        for(int j=0;j<n;j++)
	        {
	            if(l_sum==sum-arr[j])
	            {
	                return j+1;
	            }
	            l_sum+=arr[j];
	            sum-=arr[j];
	        }
	        return -1;
	    }
}
