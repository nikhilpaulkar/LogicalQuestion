package com;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci
{
	public static void main(String args[])
	{
//	  int a=0,b=0,c=1;
//	for (int i=1;i<=5;i++)
//	{
//		a=b;
//		b=c;
//		c=a+b;
//	}
//	System.out.println("fibonacci Series="+c);
//
//   
//     String a="StrigReverse";
//     char ch;
//     String rev="";
//     for(int i=0;i<a.length();i++)
//     {
//    	 ch=a.charAt(i);
//    	 rev=ch+rev;
//     }
//      System.out.println("rev="+rev);
           
//		String a="madam";
//		String b="damam";
//		
//		char [] c=a.toCharArray();
//		char [] d=b.toCharArray();
//		
//		Arrays.sort(c);
//		Arrays.sort(d);
//		if(a.length()==b.length())
//		{
//			System.out.println("this is anagram string");
//			
//		}
//		else
//		{
//			System.out.println("this is not anagram string");
//		}
//	
//		
//		
//		String a="madam";
//		String b="damam";
//		
//		char[]c=a.toCharArray();
//		char[]dd=b.toCharArray();
//		
//		Arrays.sort(c);
//		Arrays.sort(dd);
//		
//		if(String.valueOf(c)==String.valueOf(dd))
//		{
//			System.out.println("anagram string");
//		}
//		else
//		{
//			System.out.println("this is not anagram string");
//		}
		// this 
		
		 int a=0, b=1,d,c=10;
	      
	       for (int i=1;i<=c;i++)
	       {
	          d=a+b;
	         
	          a=b;
	          b=d;
	          System.out.println(d); 
	          
	       }
	
}
}

