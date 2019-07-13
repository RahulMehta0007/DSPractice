package com.Hackerrank;

import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Stack;

public class ReversePolish {
	
	public static void main(String[] args) throws IOException {
		String[] tokens = new String[] { "5", "1", "2", "+", "4","*","+","13","-" };
		System.out.println(evalRPN("5 1 2 + 4 * + 13 -"));
	
	//compute("512+4*+13");
		
	}
	
	public static void compute(String expr) throws
    ArithmeticException,
    EmptyStackException {
Stack<Double> stack = new Stack<>();

System.out.println(expr);
System.out.println("Input\tOperation\tStack after");

for (String token : expr.split("\\s+")) {
    System.out.print(token + "\t");
    switch (token) {
        case "+":
            System.out.print("Operate\t\t");
            stack.push(stack.pop() + stack.pop());
            break;
        case "-":
            System.out.print("Operate\t\t");
            stack.push(-stack.pop() + stack.pop());
            break;
        case "*":
            System.out.print("Operate\t\t");
            stack.push(stack.pop() * stack.pop());
            break;
        case "/":
            System.out.print("Operate\t\t");
            double divisor = stack.pop();
            stack.push(stack.pop() / divisor);
            break;
        default:
            System.out.print("Push\t\t");
            stack.push(Double.parseDouble(token));
            break;
    }

    System.out.println(stack);
}

System.out.println("Final Answer: " + stack.pop());
}

	
	
	
	public static int evalRPN(String exp) {
		
		char [] ch=exp.toCharArray();
		String [] tokens=exp.split("\\s+");
		/*int count=0;
		for(char temp:ch)
		{
			tokens[count]=temp+"";
			count++;
		}*/
		int count=0;
		
	
		
		int returnValue = 0;
		String operators = "+-*/";
 
		Stack<String> stack = new Stack<String>();
		
		for (String t : tokens) {
			if (!operators.contains(t)) { 
				stack.push(t);
			} else {
				
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (t) {
				case "+":
					stack.push(String.valueOf(a + b));
					break;
				case "-":
					stack.push(String.valueOf(b - a));
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					break;
				case "/":
					stack.push(String.valueOf(b / a));
					break;
				}
			}
		}
 
		returnValue = Integer.valueOf(stack.pop());
 
		return returnValue;
	}
	
}
