package com.api.javademo.messaging.factory.kafka;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.api.javademo.messaging.config.KafkaProducerConfig;
import com.api.javademo.messaging.factory.MessageProducer;

@Service
//@EnableAutoConfiguration
public class KafkaMessageProducer implements MessageProducer {

	private KafkaTemplate<String, String> kafkaTemplate;
	
	public KafkaMessageProducer() {
		this.kafkaTemplate = KafkaProducerConfig.getKafkaTemplate();
	}
	@Override
	public void send(String topic, String data) {
		kafkaTemplate.send(topic, data);
	}

	@Override
	public Boolean isAlive(String topic, String testMsg) {
		try {
			kafkaTemplate.send(topic, testMsg);
		} catch(Exception exp) {
			//Ignore this error , Checking if the broker is running
			return false;
		}
		return true;
	}
}
