package com.api.javademo.messaging;

import java.util.ArrayList;
import java.util.List;

import com.api.javademo.messaging.config.MessageBrokerConfig;
import com.api.javademo.messaging.config.MessageBrokerMonitor;
import com.api.javademo.messaging.constants.MessagingConstants;
import com.api.javademo.messaging.factory.AbstractMessageFactory;
import com.api.javademo.messaging.factory.MessageProducer;
import com.api.javademo.messaging.factory.activemq.ActiveMQMessageFactory;
import com.api.javademo.messaging.factory.kafka.KafkaMessageFactory;
import com.api.javademo.messaging.scheduler.Scheduler;
import com.api.javademo.messaging.scheduler.ThreadPool;
import com.api.javademo.messaging.scheduler.operation.IMessagingOp;
import com.api.javademo.messaging.scheduler.operation.MessagingOp;

public class MessagePublisher {
	
	private static MessagePublisher msgPublisher = null;

	private AbstractMessageFactory fact = null;
	
	private MessageProducer messageProducer = null;
	
	private Scheduler threadPool = null;
	
	private MessageBrokerMonitor monitor = null;
	
	private List<String> msgCache = null;
	
	private MessageBrokerConfig brokerConfig = null;

	private MessagePublisher() throws Exception {
		msgCache = new ArrayList<String>();
		initialize();
		createAndStartMonitor();
		initMessagePool();
	}
	
	private void initialize() throws Exception {
		
		brokerConfig = (MessageBrokerConfig)BeanUtil.getBean(MessageBrokerConfig.class);
		validate(brokerConfig);
		
		if(MessagingConstants.PROVIDER_KAFKA.equals(brokerConfig.getMsgProvider())) {
			fact = new KafkaMessageFactory();
		} else if(MessagingConstants.PROVIDER_ACTIVEMQ.equals(brokerConfig.getMsgProvider())) {
			fact = new ActiveMQMessageFactory();
		} else {
			// Provider not Supported throw an exception
			throw new Exception("The configured Message broker is not configured");
		}
		messageProducer = fact.createMessageProducer();
	}

	private void validate(MessageBrokerConfig brokerConfig2) throws Exception {
		
		if(brokerConfig.getMsgProvider() == null || brokerConfig.getMessageTopic() == null) {
			throw new Exception("Invalid Message confoiguration");
		}
	}

	public static MessagePublisher getInstance() throws Exception {
		if (msgPublisher == null) {
			msgPublisher = new MessagePublisher();
		}
        return msgPublisher;
    }
	
	private void createAndStartMonitor() {
		this.monitor = new MessageBrokerMonitor(messageProducer, brokerConfig.getDelay());
		monitor.start();
	}

	private void initMessagePool() {
		threadPool = new ThreadPool(MessagingConstants.MESSAGE_POOL_SIZE);
	}
	
	public void sendMessage(String msg) {
		if(isBrokerAlive()) {
			//Check the cache first
			if(!msgCache.isEmpty()) {
				for(String errMsg: msgCache) {
					IMessagingOp op = new MessagingOp(messageProducer, brokerConfig.getMessageTopic(), errMsg);
					threadPool.scheduleOperation(op);
				}
				msgCache.clear();
			}
			IMessagingOp op = new MessagingOp(messageProducer, brokerConfig.getMessageTopic(), msg);
			threadPool.scheduleOperation(op);
		} else {
			msgCache.add(msg);
		}
	}
	
	public Boolean isBrokerAlive() {
		return monitor.isBrokerAlive();
	}
	
	public static Boolean isMessagngEnabled() {
		//Boolean enabled = (Boolean)BeanUtil.getBean(MessagingConstants.MESSAGING_ENABLED_CONGIG);
		MessageBrokerConfig brokerConfig = (MessageBrokerConfig)BeanUtil.getBean(MessageBrokerConfig.class);
		return brokerConfig.getIsMessagingEnabled();
	}
}
