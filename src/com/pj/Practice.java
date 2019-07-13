package com.pj;

import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		
		String abc="bob";
		HashSet<String> myPalindrome=isPalindrome(abc);
		System.out.println(myPalindrome);
	}
	static HashSet<String> isPalindrome(String abc)
	{
		HashSet<String> mySet=new HashSet<String>();
		for(int i=0;i<abc.length();i++)
		{
			for(int j=i+1;j<=abc.length();j++)
			{
				if(palindromeSub(abc.substring(i,j)))
				{
					mySet.add(abc.substring(i,j));
				}
			}
		}
		
		return mySet;
	}
	private static boolean palindromeSub(String abc) {
		
		StringBuilder plain=new StringBuilder(abc);
		StringBuilder rev=plain.reverse();
		return abc.equals(rev.toString());
	}
	
	
}