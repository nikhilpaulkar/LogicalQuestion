package com;

public class StringReverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    String a="nimap";
    char ch;
    String rev="";
    
    for(int i=0;i<a.length();i++)
    {
      ch=a.charAt(i);
      rev=ch+rev;
    }
    System.out.println("Reverse String ="+rev);
	}

}
