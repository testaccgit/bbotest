package com.api.javademo.messaging.factory.activemq;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.api.javademo.messaging.config.ActiveMQConfig;
import com.api.javademo.messaging.factory.MessageProducer;

@Service
//@EnableAutoConfiguration
public class ActiveMQMessageProducer implements MessageProducer {

	@Override
	public void send(String topic, String data) {
		getJmsTemplate().convertAndSend(topic, data);
	}

	@Override
	public Boolean isAlive(String topic, String testMsg) {
		try {
			getJmsTemplate().convertAndSend(topic, testMsg);
		} catch(Exception exp) {
			exp.printStackTrace();
			//Ignore this error , Checking if the broker is running
			System.out.println("Is Alive exception "+exp.toString());
			return false;
		}
		return true;
	}
	private JmsTemplate getJmsTemplate() {
		return ActiveMQConfig.getTemplate();
	}
}
