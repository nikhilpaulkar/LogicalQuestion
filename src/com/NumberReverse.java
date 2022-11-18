package com;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=123,rev;
		for(int i=1;i<=3;i++)
		{
			rev=a%10;
			a=a/10;
			System.out.print(rev);
		}
		
	}

}
