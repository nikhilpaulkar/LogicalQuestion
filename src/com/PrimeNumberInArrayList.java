package com;

public class PrimeNumberInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]={12,5,6,2,7};
		   for(int i=0;i<a.length;i++)
		   {
		      int count=0;
		           if(i%a[i]==0)
		           {
		               count++;
		           }
		       
		       if(count==2)
		       {
		           System.out.println(i);
		       }
		   }
				
	}

}
