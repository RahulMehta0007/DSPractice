package com.Hackerrank;

import java.util.Scanner;

public class SubCompar {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
		
	}

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
      
        String temp;
        for(int i=0;i<s.length();i++)
        {	
        	if(i+k<=s.length())
        	{
        	temp=s.substring(i, k+i);
        	if(smallest.compareTo(temp)>0)
        	{
        		smallest=temp;
        	}
        	else if(largest.compareTo(temp)<=0)
        		largest=temp;
        	
        	}
   
        }
        
        
        
        return smallest + "\n" + largest;
    }
	
	
	
}
