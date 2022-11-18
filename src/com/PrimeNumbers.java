package com;


public class PrimeNumbers 
{

	public static void main(String[] args)
	{

	  int  count,n=100;
		for(int i=2;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}

     }
}