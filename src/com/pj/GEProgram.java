package com.pj;

import java.io.FileNotFoundException;

public class GEProgram {

	static
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		/*String regex=".@.";
		compare("Hacker@Earth.com",regex);
		compare("a@N",regex);
		compare("Java@Program",regex);*/
	
		/*char var;
		var="hackathon".charAt(-1);
		System.out.println(var);*/
		//printWIthoutLoop(10);
		System.out.println(reverseString("Rahul"));
		
	}

	
	 GEProgram()
	{
		System.out.println("Hi Me");
	}
	
	
	
	public static void compare(String str,String regex)
	{
		
		if(str.matches(regex))
		System.out.println(str+" matches");
		else
			System.out.println(str+" does not match");
	
	}
	
	int setValue()
	{
		int a=10;
		int b=20;
		try
		{
			++a;
			b++;
			
		}
		finally
		{
			a++;
			b--;
		}
		return a+b;
		
	}
	
	public static void printWIthoutLoop(int n)
	{
		if(n>1)
			printWIthoutLoop(n-1);
		System.out.println(n);
	}
	
	public static String reverseString(String str)
	{
		if(str.isEmpty())
			return str;
		else
			return reverseString(str.substring(1)) + str.charAt(0);
	}
	
}
