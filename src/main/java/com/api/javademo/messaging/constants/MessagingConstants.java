package com.api.javademo.messaging.constants;

public class MessagingConstants {

	public static final String PROVIDER_KAFKA = "kafka";
	public static final String PROVIDER_RABBITMQ = "rabbitmq";
	public static final String PROVIDER_ACTIVEMQ = "activemq";
	
	//Message Config bean
	public static final String MESSAGING_PROVIDER_CONGIG = "messageProvider";
	public static final String MESSAGING_TOPIC_CONGIG = "messageTopic";
	public static final String MESSAGING_DELAY_CONGIG = "messageDelay";
	public static final String MESSAGING_ENABLED_CONGIG = "messageEnabled";
	public static final Integer MESSAGE_MONITORING_DELAY = 360000;
	
	//Test topic to check message broker availability
	public static final String TEST_TOPIC = "TEST";	
	public static final String TEST_MSG = "Test";
	
	public static final int MESSAGE_POOL_SIZE = 2;
}
