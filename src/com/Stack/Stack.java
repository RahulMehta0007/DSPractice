package com.Stack;

public class Stack {
	
private	int maxSize;
private int []stackArray;
private int top;


Stack(int size)
{
this.maxSize=size;
stackArray=new int[size];
top=-1;
}

public void push(int elem)
{
	top++;
	stackArray[top]=elem;
	
}

public int pop()
{
int temp=stackArray[top];
top--;
return temp;

}


public boolean isFull()
{
return (top==maxSize-1);	

}

public boolean isEmpty()
{
return (top==-1);	

}

public int peak()
{
	
return stackArray[top];
}



}
