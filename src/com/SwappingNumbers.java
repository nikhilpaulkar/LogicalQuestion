package com;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=30;
		
		a=a+b;
		b=a-b;
		
		a=a-b;
		System.out.println("after swap="+a);
        System.out.println("after swap="+b);
	}

}
