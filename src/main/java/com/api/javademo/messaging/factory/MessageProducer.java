package com.api.javademo.messaging.factory;

public interface MessageProducer {
	public Boolean isAlive(String topic, String testMsg);
	public void send(String topic, String data);
}
