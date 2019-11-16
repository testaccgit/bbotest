package com.api.javademo.messaging.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageBrokerConfig {
	
	@Value("${messaging.topic}")
	private String activeMqTopic;

	@Value("${messaging.provider}")
	private String msgProvider;

	@Value("${messaging.topic}")
	private String messageTopic;

	@Value("${messaging.delay}")
	private Integer delay;
	
	@Value("${messaging.enabled}")
	private Boolean isMessagingEnabled;

	public String getActiveMqTopic() {
		return activeMqTopic;
	}

	public String getMsgProvider() {
		return msgProvider;
	}

	public String getMessageTopic() {
		return messageTopic;
	}

	public Integer getDelay() {
		return delay;
	}

	public Boolean getIsMessagingEnabled() {
		return isMessagingEnabled;
	}
}
