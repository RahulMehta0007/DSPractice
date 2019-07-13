package com.Hackerrank;

import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)<=0)
        {
        System.out.println("No");
        }
        else
        	System.out.println("Yes");
       char chA=A.toUpperCase().charAt(0);
       char chB=B.toUpperCase().charAt(0);
       
       A=A.replace(A.charAt(0),chA);
       B=B.replace(B.charAt(0),chB);
       System.out.println(A+" "+B);
       
       
	}

}
