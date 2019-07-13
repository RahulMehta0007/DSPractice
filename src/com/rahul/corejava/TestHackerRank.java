package com.rahul.corejava;

import java.io.Console;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHackerRank {
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	String s = "1020122";
	Map<String,Integer> substrings = new LinkedHashMap<String,Integer>();
	int count = 0;

	for(int i = 0; i < s.length(); i++)
	{
		String sub = s.substring(i);

		for(int j = 0; j < sub.length(); j++)
		{
			String subDistinct = sub.substring(0, sub.length() - j);

			if(!substrings.containsKey(subDistinct))
			{
				substrings.put(subDistinct, 1);
				//System.out.println(subDistinct);
				count += 1;
			}
			else
			{
				continue;
			}
		}
	}
			System.out.println(count);
}
}
