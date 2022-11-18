package com;

public class Fibonacci
{
	public static void main(String args[])
	{
	  int a=0,b=0,c=1;
	for (int i=1;i<=5;i++)
	{
		a=b;
		b=c;
		c=a+b;
	}
	System.out.println("fibonacci Series="+c);

   }
}

