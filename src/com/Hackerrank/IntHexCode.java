package com.Hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class IntHexCode {

	public static void main(String[] args) {
		
		
		String result=solution(new int[]{5,1,1,1,2,3});
		System.out.println(result);
		
	}
	
	static String solution(int[] array)
	{
	
		String returnString="";
		Set<Integer> mySet=new HashSet<Integer>();
		for(int temp:array)
		{
			mySet.add(temp);
		}
		//1,2,3,4,5
		mySet.stream().sorted();
		List<Integer> myList=new ArrayList<Integer>(mySet);
		int minCount=3;
		int count=0;
		
		for(int i=0;i<myList.size();i++)
		{
		for(int j=i+1;j<myList.size();j++)	
		{  
			if(i+1==myList.size())break;
			
			if(i+1!=myList.size())
			{
				if(myList.get(j)-myList.get(j-1)==1)
					count++;
				
				else count=0;
			}
			
			
		}
			
		}
		
		
		
		return returnString;
	}
}
