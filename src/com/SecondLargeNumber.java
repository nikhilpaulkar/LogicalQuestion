package com;

public class SecondLargeNumber 
{

	public static void main(String[] args)
	{
		int temp;
	    int a[] = {10, 20, 25, 63, 96, 57};
	    
	      for(int i = 0; i<a.length; i++ )
	      {
	         for(int j = i+1; j<a.length; j++)
	         {

	            if(a[i]<a[j])
	            {
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      System.out.println(" second large number is= "+a[1]);
	}

}
