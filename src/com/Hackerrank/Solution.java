package com.Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        String result="";
        Stack <Character>st=new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {   char ch=s.charAt(i);
            
       if ( (ch=='{') || (ch=='(') || (ch=='[') )
                   st.push(ch); 
            
       else     if ( (ch=='}') || (ch==')') || (ch==']') )
            	
            {
            	 
            	 if(st.isEmpty())
            		 return "NO";
            	 else
            	 
            	 { 
            		  
            	char temp=st.pop();
            	if(temp=='{' && ch =='}')
            		return "YES";
            	else if(temp=='(' && ch ==')')
            		return "YES";
            	else if(temp=='[' && ch ==']')
            		return "YES";
            	else return "NO";
            }
            }
            else
            	if(st.isEmpty())
            		return "YES";
            	else 
            		return "NO";
            
        }
        
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
