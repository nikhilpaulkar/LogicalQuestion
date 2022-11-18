package com;

public class SecondLargeNumber 
{

	public static void main(String[] args)
	{
		int temp, size;
	    int array[] = {10, 20, 25, 63, 96, 57};
	    size = array.length;

	      for(int i = 0; i<array.length; i++ )
	      {
	         for(int j = i+1; j<array.length; j++)
	         {

	            if(array[i]>array[j])
	            {
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println(" second large number is= "+array[size-2]);
	}

}
