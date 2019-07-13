package com.Hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class TaumAndBday {

    // Complete the taumBday function below.
    static int taumBday(int b, int w, int bc, int wc, int z) {
    	
    	
    	
    	int cost=0;
    	int minCost=b*bc+w*wc;
    	if(bc==wc)
    	{
    		cost=b*bc+w*wc;
    	}
    	
    	else if(bc<wc+z)
    	{
    		cost=(b+w)*bc+z*w;
    	}
    	else if(wc<bc+z)
    	{
    		cost=(b+w)*wc+z*b;
    	}
    	 
    	if(minCost>cost)
return cost;
    	return minCost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");

            int b = Integer.parseInt(bw[0]);

            int w = Integer.parseInt(bw[1]);

            String[] bcWcz = scanner.nextLine().split(" ");

            int bc = Integer.parseInt(bcWcz[0]);

            int wc = Integer.parseInt(bcWcz[1]);

            int z = Integer.parseInt(bcWcz[2]);

            int result = taumBday(b, w, bc, wc, z);
            System.out.println(result);
            
        }

 

        scanner.close();
    }
}
