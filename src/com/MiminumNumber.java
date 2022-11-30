package com;

public class MiminumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,5,6,2,7};
	       int min=0;
	   
	   for(int i=0;i<a.length;i++)
	   {
	        if(a[i]<min)
	          {
	             min=a[i];
	          }
	          
	    }
	   System.out.println(min);
	}

}
