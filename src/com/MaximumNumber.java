package com;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]={12,5,6,2,7};
	       int max=0;
	   
	   for(int i=0;i<a.length;i++)
	   {
	        if(a[i]>max)
	          {
	             max=a[i];
	          }
	          
	       }
	      
	    
	   System.out.println(max);
	}

}
