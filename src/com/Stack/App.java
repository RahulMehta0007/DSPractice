package com.Stack;

public class App {

	public static void main(String[] args) {
		
		Stack st=new Stack(4);
		st.push(20);
		st.push(40);
		st.push(60);
		st.push(80);
		
		while(!st.isEmpty())
		{
			
			System.out.println(st.pop());
			
		}

	}

}
