package com.ques.geeksTest.array;

public class CheckArrayRotatedSorted {
	public static void main(String[] args) {
		int ar[]={11,12,13 ,7 ,8 ,9,10};
		 boolean res=checkRotatedAndSorted(ar, ar.length);
		 System.out.println(res);
	}
	
	public static boolean checkRotatedAndSorted(int arr[], int num){
        
	       int max=arr[0];
	      int  maxpos=-1;
	       int min=arr[0];
	       int minpos=-1;
	    //  initDetails(arr,num,max,min,maxpos,minpos);
	       for(int i=1;i<num;i++)
	       {
	           if(arr[i]>max)
	           {
	               max=arr[i];
	               maxpos=i;
	           }
	           if(arr[i]<min)
	           {
	               min=arr[i];
	               minpos=i;
	           }
	       }
	       if((minpos==0&&maxpos==num-1)||(maxpos==0&&minpos==num-1))
	       {
	           return false;//not rotated
	       }
	       if(Math.abs(minpos-maxpos)!=1)
	       {
	           return false;//not sorted
	       }
	       if(maxpos<minpos)
	       {
	            int i = minpos;
				while (i != maxpos) 
				{
					int current = arr[i];
					int next = (i + 1 == num) ? arr[0] : arr[i + 1];//find the next   

					if (current > next)
						return false;
					i = (i == num - 1) ? 0 : i + 1;//is it end
				}
	       }
	       else if(maxpos>minpos)
	       {
	           int i = maxpos;
				while (i != minpos) 
				{
					int current = arr[i];
					int next = (i + 1 == num) ? arr[0] : arr[i + 1];
					if (current < next)
						return false;
					i = (i == num - 1) ? 0 : i + 1;
				}
	           
	       }
	      return true;
	        
	    }
	    public static void initDetails(int []ar,int num,int max,int min,int maxpos,int minpos)
	    {
	         for(int i=1;i<num;i++)
	       {
	           if(ar[i]>max)
	           {
	               max=ar[i];
	               maxpos=i;
	           }
	           if(ar[i]<min)
	           {
	               min=ar[i];
	               minpos=i;
	           }
	       }
	        
	    }

}
