package com.Hackerrank;

public class ReverseInteger {

	public static void main(String[] args) {
	System.out.println( reverseNum(1234));	
		
		
		
	}
	
	static int reverseNum(int num)
	{
	 int	reverseNum=0;
	 
	 while(num !=0)
	 {
		 reverseNum=reverseNum*10+num%10;
		 num=num/10;
	 }
	 
	return reverseNum;
	}
}
