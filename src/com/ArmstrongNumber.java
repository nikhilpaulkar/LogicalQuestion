package com;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n=153,r = 0,sum=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(r*r*r)+sum;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("no is armostrong");
		}
		else
		{
			System.out.println("no is not armstong");
		}
	}

}
