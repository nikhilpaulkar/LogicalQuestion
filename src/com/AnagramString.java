package com;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Race";
		 String str2 = "Care";
		    
		    
		    
		      char[] charArray1 = str.toCharArray();
		      char[] charArray2 = str2.toCharArray();

		      
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);
		    if(str.length() == str2.length()) 
		    {
               System.out.println("this is anagram string");
		    
		    }else
		    {
		    	
		    }
		     
		    }

}
