package com.Hackerrank;

import java.util.Scanner;

public class MaskString {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println();
		sc.close();
		char [] tempArray=new char[str.length()];
		int temp;
		for(int i=0;i<str.length();i++)
		{
			temp=(int)str.charAt(i);
			
			if ((temp>=48)&& (temp<=54))
			{
				temp+=3;
				tempArray[i]=(char)temp;
			}
			else if ((temp>54) && (temp<=57))
			{
				temp-=7;
				tempArray[i]=(char)temp;
				
			}
			else
				System.out.println("Incorrect Values !!");
		}
	
		
		String finalString=String.copyValueOf(tempArray);
		System.out.println(finalString);

	}

}
