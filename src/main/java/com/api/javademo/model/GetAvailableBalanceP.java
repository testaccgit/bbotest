package com.api.javademo.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GetAvailableBalanceP {

	private String accountId;

	private String journeyId;

	private String originUserId;

	private String timeStamp;

	private String tppId;

	private String clientId;

	private String subscriptionId;

	private String authorization;

	private String clientSecret;

	private String originSourceId;

	private String originChannelId;

	private String originDeptId;

	private String originEmployeeId;

	private String originTerminalId;

	private String correlationId;

	private String lang;

	public GetAvailableBalanceP(){}

	public GetAvailableBalanceP(String accountId,String journeyId,String originUserId,String timeStamp,String tppId,String clientId,String subscriptionId,String authorization,String clientSecret,String originSourceId,String originChannelId,String originDeptId,String originEmployeeId,String originTerminalId,String correlationId,String lang){
		 this.accountId=accountId;
		 this.journeyId=journeyId;
		 this.originUserId=originUserId;
		 this.timeStamp=timeStamp;
		 this.tppId=tppId;
		 this.clientId=clientId;
		 this.subscriptionId=subscriptionId;
		 this.authorization=authorization;
		 this.clientSecret=clientSecret;
		 this.originSourceId=originSourceId;
		 this.originChannelId=originChannelId;
		 this.originDeptId=originDeptId;
		 this.originEmployeeId=originEmployeeId;
		 this.originTerminalId=originTerminalId;
		 this.correlationId=correlationId;
		 this.lang=lang;
	}


	public String getAccountId() {
		 return accountId;
	}

	public void setAccountId(String accountId) {
		 this.accountId=accountId;
	}
	public String getJourneyId() {
		 return journeyId;
	}

	public void setJourneyId(String journeyId) {
		 this.journeyId=journeyId;
	}
	public String getOriginUserId() {
		 return originUserId;
	}

	public void setOriginUserId(String originUserId) {
		 this.originUserId=originUserId;
	}
	public String getTimeStamp() {
		 return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		 this.timeStamp=timeStamp;
	}
	public String getTppId() {
		 return tppId;
	}

	public void setTppId(String tppId) {
		 this.tppId=tppId;
	}
	public String getClientId() {
		 return clientId;
	}

	public void setClientId(String clientId) {
		 this.clientId=clientId;
	}
	public String getSubscriptionId() {
		 return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		 this.subscriptionId=subscriptionId;
	}
	public String getAuthorization() {
		 return authorization;
	}

	public void setAuthorization(String authorization) {
		 this.authorization=authorization;
	}
	public String getClientSecret() {
		 return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		 this.clientSecret=clientSecret;
	}
	public String getOriginSourceId() {
		 return originSourceId;
	}

	public void setOriginSourceId(String originSourceId) {
		 this.originSourceId=originSourceId;
	}
	public String getOriginChannelId() {
		 return originChannelId;
	}

	public void setOriginChannelId(String originChannelId) {
		 this.originChannelId=originChannelId;
	}
	public String getOriginDeptId() {
		 return originDeptId;
	}

	public void setOriginDeptId(String originDeptId) {
		 this.originDeptId=originDeptId;
	}
	public String getOriginEmployeeId() {
		 return originEmployeeId;
	}

	public void setOriginEmployeeId(String originEmployeeId) {
		 this.originEmployeeId=originEmployeeId;
	}
	public String getOriginTerminalId() {
		 return originTerminalId;
	}

	public void setOriginTerminalId(String originTerminalId) {
		 this.originTerminalId=originTerminalId;
	}
	public String getCorrelationId() {
		 return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		 this.correlationId=correlationId;
	}
	public String getLang() {
		 return lang;
	}

	public void setLang(String lang) {
		 this.lang=lang;
	}
}