package com.api.javademo.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetAccountDetailsResponseWrapper {

	 private List<Account> response;
	 private String journeyId;
	 private String timeStamp;
	 private String correlationId;

	 public MultiValueMap<String, String> getHeaders(){
	 final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
 		 map.add("journeyId",this.journeyId);
		 map.add("timeStamp",this.timeStamp);
		 map.add("correlationId",this.correlationId);
	return map;
	}
	 public void setHeaders(String journeyId,String timeStamp,String correlationId){
		 		this.journeyId=journeyId;
		this.timeStamp=timeStamp;
		this.correlationId=correlationId;

	} 
	 public List<Account> getResponse(){
		 return response;
	} 
	 public void setResponse(List<Account> response){
		 this.response=response;
	} 
}