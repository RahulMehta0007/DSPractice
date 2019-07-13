package com.Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrayHackerRank {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] arr=new int[n];
	
	int sum=0;
	int count=0;
	int kSum=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	Arrays.sort(arr);
	
	for(int i=0;i<n;i++)
	{	sum=0;
		//Count Unique elements
		if(arr[i]<0)
		{
			count++;
		}
	
	
		for(int j=i;j<n;j++)
		{	
		
			sum+=arr[j];
	
			
			
			
		}
		
		if(sum<0)
			count++;
		
	
	}
	
	
	System.out.println(count);
		
sc.close();
	}

	

}
