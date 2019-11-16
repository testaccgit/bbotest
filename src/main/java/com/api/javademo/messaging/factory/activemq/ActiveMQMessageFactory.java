package com.api.javademo.messaging.factory.activemq;

import org.springframework.stereotype.Service;

import com.api.javademo.messaging.factory.AbstractMessageFactory;
import com.api.javademo.messaging.factory.MessageProducer;

@Service
public class ActiveMQMessageFactory implements AbstractMessageFactory {

	private ActiveMQMessageProducer producer;
	
	public MessageProducer createMessageProducer() {
		producer = new ActiveMQMessageProducer();
		return producer;
	}
}
