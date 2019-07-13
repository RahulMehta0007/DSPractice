package com.Hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class ViralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
    	int likeCount=0;
    	int recipitent=0;
    	for(int i=1;i<=n;i++)
    	{
    		if(i==1)
    		{
    		recipitent=5;
    		likeCount=2;
    		}
    		else
    		{
    			recipitent=Math.abs(recipitent/2)*3;
    			likeCount+=recipitent/2;
    		}
    		
    		}
    	return likeCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);
System.out.println(result);
       
        scanner.close();
    }
}
