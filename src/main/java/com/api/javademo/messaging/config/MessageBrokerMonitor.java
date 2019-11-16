package com.api.javademo.messaging.config;

import com.api.javademo.messaging.constants.MessagingConstants;
import com.api.javademo.messaging.factory.MessageProducer;

public class MessageBrokerMonitor extends Thread {
	
	private Boolean brokerAlive = true;
	private MessageProducer producer;
	
	private Integer delay;
	
	public MessageBrokerMonitor(MessageProducer producer, Integer delay) {
		this.producer = producer;
		this.delay = delay;
		if(delay == null) {
			this.delay = MessagingConstants.MESSAGE_MONITORING_DELAY;
		}
	}
	
	public void run() {
		while(true) {
			this.brokerAlive = producer.isAlive(MessagingConstants.TEST_TOPIC, MessagingConstants.TEST_MSG);
			try {
				Thread.sleep(delay);
			} catch(InterruptedException exp) {
				brokerAlive = false;
			}
		}
	}

	public Boolean isBrokerAlive() {
		return brokerAlive;
	}
}
