package com.Hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
    int diff=0;
    int count=0;
    	for(int x=i;x<=j;x++)
    	{	
    	 diff=x-reverseNum(x);
    	 if(diff%k==0)
    	 count++;
    	 
    	
    	}
    	
    	
return count;
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
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

       System.out.println(result);

        scanner.close();
    }
}
