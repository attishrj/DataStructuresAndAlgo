package com.ques.geeksTest.array;

public class RotationCount {

	public static void main(String[] args) {
		//int ar[]={2  ,5 ,1,3 ,4};
		int ar[]={	1,2,3,4,5};
	int c=	rotatedCount(ar);
	System.out.println(c);
	//minimumBribes(ar);
	}   
	

	private static int rotatedCount(int[] ar) {
	int size=ar.length;	
	int low=0;
	int high=size-1;
	while(low<=high)
	{
		if(ar[low]==ar[high])
			
		{
			return low;
		}
		int mid=low+(high-low)/2;
		int prev=(mid+size-1)%size;
		int next=(mid+1)%size;
		if(ar[mid]<=ar[prev]&&ar[mid]<=ar[next])
		{
			return mid;
		}
		if(ar[mid]<=ar[high])
		{
			high=mid-1;
		}
		else if(ar[low]<=ar[mid])
		{
			low=mid+1;
		}
	}
	return -1;
	}

	
	static void minimumBribes(int[] q) {
        int n=q.length;
      int count=rotateCount(q,n);
      if(count==-1)
      {
          System.out.println("Too chaotic");
          return;
      }
      else{
          System.out.println(count);
      }

    }
	 public static int rotateCount(int ar[],int n){
			/*int mid=low+(high-low)/2;
			int prev=(mid+size-1)%size;
			int next=(mid+1)%size;
			if(ar[mid]<=ar[prev]&&ar[mid]<=ar[next])
			{
				return mid;
			}*/
	        int l=0;
	        int h=n-1;
	        while(l<=h)
	        {
	            if(ar[h]==ar[l])
	            {
	                return l;
	            }
	            int mid=l+(h-l)/2;
	            int prev=(n+mid-1)%n;
	            int next=(mid+1)%n;

	            if(ar[mid]<=ar[prev]&&ar[mid]<=ar[next])
	            {
	                return mid;
	            }
	            if(ar[mid]<=ar[h])
	            {
	                h=mid-1;
	            }
	            else if(ar[l]<=ar[mid])
	            {
	                l=mid+1;
	            }
	        }
	        return -1;
	    }

	
}
