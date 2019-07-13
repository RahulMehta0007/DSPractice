package com.Hackerrank;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a= sc.next();
		String b= sc.next();
		sc.close();
		System.out.println(isAnagram(a, b));

	}

	static boolean isAnagram(String a, String b) {
        // Complete the function
		boolean flag=false;
		if(a.length()!=b.length())
			return false;
		else
		{
			a=a.toLowerCase();
			b=b.toLowerCase();
		Map<Character,Integer> mapA=new LinkedHashMap<Character,Integer>();
		Map<Character,Integer> mapB=new LinkedHashMap<Character,Integer>();
		int count=0;
			for(int i=0;i<a.length();i++)
			{	
				
				if(mapA.containsKey(a.charAt(i)))
				{
					
				int val=mapA.get(a.charAt(i));	
					
				mapA.put(a.charAt(i),val+1);
				}
				else
				mapA.put(a.charAt(i),1);
			
			}
			
			for(int i=0;i<a.length();i++)
			{	
				
				if(mapB.containsKey(b.charAt(i)))
				{
					
				int val=mapB.get(b.charAt(i));	
					
				mapB.put(b.charAt(i),val+1);
				}
				else
				mapB.put(b.charAt(i),1);
			
			}
		
		
			for(int i=0;i<a.length();i++)
			{
				if(mapA.get(a.charAt(i))==mapB.get(a.charAt(i)))
				{
					flag=true;
				}
				else
					flag=false;
			
				
				
				
				
			}
			
			
			
			System.out.println(mapA+" \n"+mapB);
			
		}
			
			
		
		return flag;
		
    }
	
	
}
