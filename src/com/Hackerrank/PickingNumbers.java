package com.Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PickingNumbers {
	

    public static int pickingNumbers(List<Integer> a) {
    
    	Collections.sort(a);
    	Set<Integer> mySet=new HashSet<Integer>(a);
    	Iterator<Integer> itr=mySet.iterator();
    	int max=0;
    	
    	while(itr.hasNext())
    	{	int tempValue=itr.next();
    		max=Collections.frequency(a,tempValue);
    	}
    	
    	
    	
    	return 1;
    }
	
	
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = pickingNumbers(a);

        
        bufferedReader.close();
     
    }
}
