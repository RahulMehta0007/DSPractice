package com.pj;

import java.util.LinkedList;
import java.util.List;

public class TestBlockingQueue {

	public static void main(String[] args) {
	
		

	}

}

class BlockingQueue
{
int limit;
List<Integer> list=new LinkedList <Integer> ();
	
BlockingQueue(int limit)
{this.limit=limit;}

public synchronized void enQueue(int data)
{
	if(list.size()==limit)
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	if(list.size()==0)
	{
		
		notifyAll();
		
	}
	list.add(data);
}

public synchronized int deQueue() throws InterruptedException
{
	
if(list.size()==0)	
wait();
if(list.size()==limit)
notifyAll();

return list.remove(0);
}




}