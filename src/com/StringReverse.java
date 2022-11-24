package com;

public class StringReverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    String a="coc";
    char ch;
    String rev="";
    
    for(int i=0;i<a.length();i++)
    {
      ch=a.charAt(i);
      rev=ch+rev;
       
    	  
      }
    if(a.equals(rev))
    {
    	System.out.println("string is palindrome");
    }
    else
    {
    	System.out.println("string is not palindrome");
    }
    System.out.println("Reverse String ="+rev);
	}

}