package com.Hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class BreakingTheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	int min=scores[0];
    	int max=scores[0];
    	int minCount=0;
    	int maxCount=0;
    	for(int i=0;i<=scores.length-1;i++)
    	{
    		if(scores[i]>max)
    		{
    			max=scores[i];
    			maxCount++;
    		}
    		else if(scores[i]<min)
    		{
    			min=scores[i];
    			minCount++;
    		}
    		
    		
    		
    	}
    	
    	

    	return new int []{maxCount,minCount};
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        for(int x:result)
        {System.out.println(x);}

        scanner.close();
    }
}
