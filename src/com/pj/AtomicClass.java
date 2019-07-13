package com.pj;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClass {

	public static void main(String[] args) {
		ExecutorService service=Executors.newCachedThreadPool();
		
		
		
	}

}

class MyRunnable implements Runnable
{	SafeCounterWithoutLock sf;

	MyRunnable(SafeCounterWithoutLock sf){
		this.sf=sf;
		
	}	
	
public void run()
{
	sf.increment();
}

}

 class SafeCounterWithoutLock {
    private final AtomicInteger counter = new AtomicInteger(0);
     
    public int getValue() {
        return counter.get();
    }
    public void increment() {
        while(true) {
            int existingValue = getValue();
            int newValue = existingValue + 1;
            if(counter.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }
}