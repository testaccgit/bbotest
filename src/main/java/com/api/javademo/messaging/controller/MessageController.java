package com.api.javademo.messaging.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.javademo.exception.ErrorResponse;
import com.api.javademo.messaging.MessagePublisher;
import com.google.gson.Gson;

@RestController
@RequestMapping(value="/api/messaging")
public class MessageController {
	
	@PostMapping(value = "/producer")
	public String producer(@RequestBody ErrorResponse response) {

		boolean isMessagingEnabled = MessagePublisher.isMessagngEnabled();
		System.out.println("Messaging enabled "+isMessagingEnabled);
		try {
			if(MessagePublisher.isMessagngEnabled()) {
				MessagePublisher pub = MessagePublisher.getInstance();
				String jsonErr = new Gson().toJson(response);
				System.out.println(jsonErr);
				pub.sendMessage(jsonErr);
			}
		} catch(Exception exp) {
			//TODO: handle this error
			exp.printStackTrace();
		}
		return "Done";
	}
}
