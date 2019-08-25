package com.Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ALProblem {
/*
 * Sugandha
 */
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List <Integer> al=new ArrayList<Integer>(100000);
		
		for(int i=1;i<=n;i++)
		{
			int d=sc.nextInt();
			
			for(int j=1;j<=d;j++)
			{ 
				String index=i+""+j;
				int ind=Integer.parseInt(index);
				System.out.println("Ind is : "+ind);
				int elem=sc.nextInt();
				al.add(ind,elem);
			
			
		}
		}
		int q=sc.nextInt();
		
		for(int i=0;i<q;i++)
		{
			int row=sc.nextInt();
			int col=sc.nextInt();	
			
			String index=row+""+col;
			
			if(al.get(Integer.parseInt(index))!=null)
			{
				System.out.println(al.get(Integer.parseInt(index)));
			}
			else
				System.out.println("ERROR!");
			
		}
	
	
		
		
		
		sc.close();
	}

}
