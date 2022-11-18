package com;

public class DuplicateElementOfArray 
{

	public static void main(String[] args) 
	{


	 int  a[] = { 12, 38, 43, 12, 73, 18, 18, 31};   
	
	for(int i=0;i<=a.length;i++)
	{
		for(int j=i+1;j<=a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("duplicate Element="+a[j]);
			}
		}
	}
	}

}
