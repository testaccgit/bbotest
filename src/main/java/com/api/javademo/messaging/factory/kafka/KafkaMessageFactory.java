package com.api.javademo.messaging.factory.kafka;

import org.springframework.stereotype.Service;

import com.api.javademo.messaging.factory.AbstractMessageFactory;
import com.api.javademo.messaging.factory.MessageProducer;

import org.springframework.context.annotation.Bean;

@Service
public class KafkaMessageFactory implements AbstractMessageFactory {

	private KafkaMessageProducer producer;
	
	public MessageProducer createMessageProducer() {
		producer = new KafkaMessageProducer();
		return producer;
	}
}
