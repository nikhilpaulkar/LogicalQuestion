package com;

public class Palindrome {

	public static void main(String[] args) {
		
		int r=0,sum=0,n=121;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
			if(temp==sum)
			{
				System.out.println("no is palindrome");
			}
			else
			{
				System.out.println("no is not palindrome");
			}
	
	}

}
