package com.Stack;



class SingletonPattern {

	private static SingletonPattern uniqueInstance;
	private SingletonPattern (){}
	
	public static SingletonPattern getInstance()
	{
		if(uniqueInstance==null)
		{	synchronized (SingletonPattern.class) {
			uniqueInstance=new SingletonPattern();
		}
			
		}
			return uniqueInstance;
	}
	
	
}

public class TestSingleton
{
public static void main(String[] args) {
	SingletonPattern obj1=SingletonPattern.getInstance();
	SingletonPattern obj2=SingletonPattern.getInstance();
	Thread t1=new Thread("Thread 1 "){
		
		public void run()
		{
			
		}
	};
	System.out.println(obj1==obj2);
}

}