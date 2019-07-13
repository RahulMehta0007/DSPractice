package com.Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
    	int count=0;
    	int sum=0;
    	for(int i=0;i<=s.size()-1;i++)
    	{
    	
    		for(int j=i;j<i+m;j++)
    		{
    		if(i+m>s.size())
    			break;
    		else
    		sum+=s.get(j);
    			
    			
    		}
    		if(sum==d)
    		{
    			count++;
    			sum=0;
    		}
    		
    		
    	}
    	
    	
return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s.add(sItem);
        }

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);
        System.out.println(result);
        
    }
}
