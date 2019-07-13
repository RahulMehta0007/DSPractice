package com.ProducerAndConsumerWait;

import java.util.List;

public class Producer implements Runnable{

	List<Message> msgList;
	Producer(List<Message> msgList)
	{
		this.msgList=msgList;
	}
	
	
	@Override
	public void run() {
		Message msg=new Message();
		for(int i=0;i<10;i++)
		{	
			msgList.add(msg);
			if(msgList.size()==10)
			{
				
			}
			
		}
		
		
		
	}

}
