package com.api.javademo.messaging.scheduler.operation;

import com.api.javademo.messaging.factory.MessageProducer;

public class MessagingOp implements IMessagingOp, Comparable {
	
	private MessageProducer provider;
	private String msg;
	private String topic;
	
	public MessagingOp(MessageProducer provider, String topic, String msg) {
		this.provider = provider;
		this.msg = msg;
		this.topic = topic;
	}
    public void execute() {
    	provider.send(topic, msg);
    }
    
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
