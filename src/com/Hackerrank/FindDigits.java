package com.Hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindDigits {

    // Complete the findDigits function below.
    static int findDigits(int n) {
    	int temp=n,count=0,lastDigit;
    	
    while(n!=0)
    {
    	lastDigit=n%10;
    	if(lastDigit==0 && n>0){n=n/10;continue;}
    	if(temp%lastDigit==0)count++;
    	n=n/10;
    	
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

            int result = findDigits(n);
            System.out.println(result);
            
        }

       

        scanner.close();
    }
}
