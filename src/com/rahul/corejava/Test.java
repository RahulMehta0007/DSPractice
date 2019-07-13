package com.rahul.corejava;

import java.util.HashMap;

public class Test extends Student{
public static void main(String[] args) {
		
	 Student alex1 = new Student(1, "Alex");
     Student alex2 = new Student(1, "Alex");
     System.out.println("alex1 hashcode = " + alex1.hashCode());
     System.out.println("alex2 hashcode = " + alex2.hashCode());
     System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
     System.out.println("###############");
     String s1 = "abc";
     String s2 = "abc";
     String s3= new String("abc").intern();
     System.out.println("s1 == s2 ? "+(s1==s2)); //true
     System.out.println("s1 == s3 ? "+(s1==s3)); //false
     System.out.println("s1 equals s3 ? "+(s1.equals(s3))); //true
     System.out.println("###############");
     	
     HashMap <String,Integer>map=new HashMap<String,Integer>();
     map.put("Rahul",1);
     map.put("Mehta",1);
     map.put("Rahul",2);
	}



}
