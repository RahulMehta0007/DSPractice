package com.Hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RansomNote {
	
	// Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
    	
    	Arrays.sort(magazine);
    	Arrays.sort(note);
    	
    	Map<String,Integer> magazineMap=new HashMap<String,Integer>();
    	Map<String,Integer> noteMap=new HashMap<String,Integer>();
    	
    	for(int i=0;i<=magazine.length-1;i++)
    	{
    		if(! (magazineMap.containsKey(magazine[i])))
    		{
    			magazineMap.put(magazine[i],1);
    		}
    		else
    		{	int count=magazineMap.get(magazine[i]);
    			magazineMap.put(magazine[i],count+1);
    		}
    	}
    	
    	for(int i=0;i<=note.length-1;i++)
    	{
    		if(! (noteMap.containsKey(note[i])))
    		{
    			noteMap.put(note[i],1);
    		}
    		else
    		{	int count=noteMap.get(note[i]);
    			noteMap.put(note[i],count+1);
    		}
    	}
    	
    	Set<String> noteSet=noteMap.keySet();
    	
    	Iterator<String> itr=noteSet.iterator();
    	int count=0;
    	while(itr.hasNext())
    	{
    		String searchKey=itr.next();
    		if( noteMap.get(searchKey) .equals(magazineMap.get(searchKey)) )
    		{
    			count++;
    			
    		}
    		
    	}
    	if(count==noteSet.size())
    	{
    		System.out.println("YES");
    	}
    	else
    		System.out.println("NO");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
	
}
