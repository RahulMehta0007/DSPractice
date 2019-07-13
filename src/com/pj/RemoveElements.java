package com.pj;

public class RemoveElements {

	public static void main(String[] args) {
	
		int [] arr={1,2,3,4,4};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[size-1];
					size--;
					j--;
				}
			}
		}
		
		System.out.println(" After Removing Duplicates ");
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
	}

}
