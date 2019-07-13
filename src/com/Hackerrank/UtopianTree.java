package com.Hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
    	int count=1;
    	for(int i=1;i<=n;i++)
    	{
    		if(i%2!=0)
    		{
    			count*=2;
    		}
    		else 
    			count+=1;
    	}
    	
    	
return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);
            System.out.println(result);
        }


        scanner.close();
    }
}
