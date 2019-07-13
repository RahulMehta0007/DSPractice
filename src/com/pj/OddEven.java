package com.pj;

public class OddEven {

	public static void main(String[] args) {
		Printer p=new Printer();
		OddPrint odd=new OddPrint(10, p);
		EvenPrint even=new EvenPrint(10, p);
		Thread evenThread=new Thread (even,"Even Thread");
		evenThread.start();

		Thread oddThread=new Thread (odd,"Odd Thread");
		oddThread.start();
			}

}

class OddPrint implements Runnable
{
int limit;
Printer p;
	
public void run()
{
int i=1;	
while(i<=limit)
{
try {
	p.printOdd(i);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
i+=2;
}
}

OddPrint(int limit,Printer p)
{
	this.p=p;
	this.limit=limit;
}


}

class EvenPrint implements Runnable
{
int limit;
Printer p;
	
public void run()
{
int i=2;	
while(i<=limit)
{
try {
	p.printEven(i);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
i+=2;
}
}

EvenPrint(int limit,Printer p)
{
	this.p=p;
	this.limit=limit;
}


}

class Printer 
{
	public boolean isOddPrinted=false;
	public synchronized void printOdd(int i) throws InterruptedException
	{
		while(isOddPrinted)
		{
			wait();
			
		}
		System.out.println(Thread.currentThread().getName()+i);
		isOddPrinted=true;
		//Thread.sleep(1000);
		notify();
		
	}
	public synchronized void printEven(int i) throws InterruptedException
	{
		while(!isOddPrinted)
		{
			wait();
			
		}
		System.out.println(Thread.currentThread().getName()+i);
		isOddPrinted=false;
		//Thread.sleep(1000);
		notify();
		
	}

	
	
	
	
	
	
	
}