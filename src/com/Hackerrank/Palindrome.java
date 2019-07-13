package com.Hackerrank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag=false;
       for(int i=0;i<A.length();i++)
       {
    	   for(int j=A.length()-1;j>=0;j--)
    	   {
    		   if(A.charAt(i)==A.charAt(j))
    		   flag=true;
    		   else
    			   flag=false;
    		   
    	   }
    	   
    	   
       }
       if(flag)
    	   System.out.println("Yes");
    	   else
    		   System.out.println("No");
    	   
       
	}

}
