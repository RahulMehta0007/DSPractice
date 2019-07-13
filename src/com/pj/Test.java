package com.pj;

public class Test {

	public static void main(String[] args) {
	
		Runnable r1=new Runnable()
				{
			public void run()
			{
				
				System.out.println("Thread One: "+Display.volatileVariable);
				Display.volatileVariable++;
				System.out.println("Incremented value :"+Display.volatileVariable);
			}
			
				};
				
				Runnable r2=new Runnable()
				{
			public void run()
			{
				
				System.out.println("Thread Two: "+Display.volatileVariable);
				Display.volatileVariable++;
			}
			
				};

			new Thread(r1).start();	
			new Thread(r2).start();	
			System.out.println("Final Value is : "+Display.volatileVariable);
				
	}

}


class Display
{
static  int volatileVariable=10;	

}

