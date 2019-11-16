package com.api.javademo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.api.javademo.services.*;
import com.api.javademo.model.*;


import com.api.javademo.model.Account;
import java.math.BigDecimal;
import com.api.javademo.model.Branch;
import com.api.javademo.model.ErrorResponse;
import com.api.javademo.model.Statement;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.format.annotation.*;
import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-26T16:12:13.568+05:30")

@Controller
public class V1ApiController implements V1Api {
	@Autowired
	 private GetAccountDetailsI getAccountDetailsI;
	@Autowired
	 private GetAccountStatementI getAccountStatementI;
	@Autowired
	 private GetAccountsI getAccountsI;
	@Autowired
	 private GetAvailableBalanceI getAvailableBalanceI;
	@Autowired
	 private GetBranchesI getBranchesI;




    public ResponseEntity<List<Account>> getAccountDetails(@ApiParam(value = "account id of the user.",required=true ) @PathVariable("accountId") String accountId,
        @ApiParam(value = "Global transaction Id" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,
        @ApiParam(value = "User ID of the requester (as per LDAP)" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,
        @ApiParam(value = "The time stamp when the request was sent to system" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,
        @ApiParam(value = "Third party Provide ( TPP ) ID" ,required=true) @RequestHeader(value="tppId", required=true) String tppId,
         @NotNull@ApiParam(value = "Third party Provide ( TPP ) Application Id", required = true) @RequestParam(value = "client_id", required = true)  String clientId,
        @ApiParam(value = "Subscription ID of a subscriber " ,required=true) @RequestHeader(value="subscriptionId", required=true) String subscriptionId,
        @ApiParam(value = "Encrypted access token " ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "True / False" ,required=true) @RequestHeader(value="onlineAccessFlag", required=true) Boolean onlineAccessFlag,
         @NotNull@ApiParam(value = "", required = true) @RequestParam(value = "client_secret", required = true)  String clientSecret,
        @ApiParam(value = "ID of the source system invoking" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,
        @ApiParam(value = "ID of the channel from which the invocation occurred" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,
        @ApiParam(value = "ID of the department from which the invocation occurred" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,
        @ApiParam(value = "Employee ID of the requester (as per employee HR record)" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,
        @ApiParam(value = "Terminal ID of the requester" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,
        @ApiParam(value = "Correlation ID passed by the requesting system" ) @RequestHeader(value="correlationId", required=false) String correlationId,
        @ApiParam(value = "2-character iso code for preferred language.  If empty the default will be English" ) @RequestHeader(value="lang", required=false) String lang) {

	GetAccountDetailsResponseWrapper res = getAccountDetailsI.execute(new GetAccountDetailsP(accountId,journeyId,originUserId,timeStamp,tppId,clientId,subscriptionId,authorization,onlineAccessFlag,clientSecret,originSourceId,originChannelId,originDeptId,originEmployeeId,originTerminalId,correlationId,lang));
        return new ResponseEntity<List<Account>>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<List<Statement>> getAccountStatement(@ApiParam(value = "account id of the user.",required=true ) @PathVariable("accountId") String accountId,
        @ApiParam(value = "Global transaction Id" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,
        @ApiParam(value = "User ID of the requester (as per LDAP)" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,
        @ApiParam(value = "The time stamp when the request was sent to system" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,
        @ApiParam(value = "Third party Provide ( TPP ) ID" ,required=true) @RequestHeader(value="tppId", required=true) String tppId,
         @NotNull@ApiParam(value = "Third party Provide ( TPP ) Application Id", required = true) @RequestParam(value = "client_id", required = true)  String clientId,
        @ApiParam(value = "Subscription ID of a subscriber " ,required=true) @RequestHeader(value="subscriptionId", required=true) String subscriptionId,
        @ApiParam(value = "Encrypted access token " ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
         @NotNull@ApiParam(value = "", required = true) @RequestParam(value = "client_secret", required = true)  String clientSecret,
        @ApiParam(value = "ID of the source system invoking" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,
        @ApiParam(value = "ID of the channel from which the invocation occurred" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,
        @ApiParam(value = "ID of the department from which the invocation occurred" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,
        @ApiParam(value = "Employee ID of the requester (as per employee HR record)" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,
        @ApiParam(value = "Terminal ID of the requester" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,
        @ApiParam(value = "Correlation ID passed by the requesting system" ) @RequestHeader(value="correlationId", required=false) String correlationId,
        @ApiParam(value = "2-character iso code for preferred language.  If empty the default will be English" ) @RequestHeader(value="lang", required=false) String lang,
        @ApiParam(value = "") @RequestParam(value = "startDate", required = false)  String startDate,
        @ApiParam(value = "") @RequestParam(value = "endDate", required = false)  String endDate,
        @ApiParam(value = "") @RequestParam(value = "maxCount", required = false)  BigDecimal maxCount) {

	GetAccountStatementResponseWrapper res = getAccountStatementI.execute(new GetAccountStatementP(accountId,journeyId,originUserId,timeStamp,tppId,clientId,subscriptionId,authorization,clientSecret,originSourceId,originChannelId,originDeptId,originEmployeeId,originTerminalId,correlationId,lang,startDate,endDate,maxCount));
        return new ResponseEntity<List<Statement>>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<List<Account>> getAccounts(@ApiParam(value = "Global transaction Id. " ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,
         @NotNull@ApiParam(value = "", required = true) @RequestParam(value = "client_secret", required = true)  String clientSecret,
        @ApiParam(value = "User ID of the requester (as per LDAP)" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,
        @ApiParam(value = "The time stamp when the request was sent to system" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,
        @ApiParam(value = "Third party Provide ( TPP ) ID" ,required=true) @RequestHeader(value="tppId", required=true) String tppId,
         @NotNull@ApiParam(value = "Third party Provide ( TPP ) Application Id", required = true) @RequestParam(value = "client_id", required = true)  String clientId,
        @ApiParam(value = "Subscription ID of a subscription for which all accounts need to be retrieved" ,required=true) @RequestHeader(value="subscriptionId", required=true) String subscriptionId,
        @ApiParam(value = "Encrypted access token " ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "True / False" ,required=true) @RequestHeader(value="onlineAccessFlag", required=true) Boolean onlineAccessFlag,
        @ApiParam(value = "ID of the source system invoking" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,
        @ApiParam(value = "ID of the channel from which the invocation occurred" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,
        @ApiParam(value = "ID of the department from which the invocation occurred" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,
        @ApiParam(value = "Employee ID of the requester (as per employee HR record)" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,
        @ApiParam(value = "Terminal ID of the requester" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,
        @ApiParam(value = "Correlation ID passed by the requesting system" ) @RequestHeader(value="correlationId", required=false) String correlationId,
        @ApiParam(value = "2-character iso code for preferred language.  If empty the default will be English" ) @RequestHeader(value="lang", required=false) String lang) {

	GetAccountsResponseWrapper res = getAccountsI.execute(new GetAccountsP(journeyId,clientSecret,originUserId,timeStamp,tppId,clientId,subscriptionId,authorization,onlineAccessFlag,originSourceId,originChannelId,originDeptId,originEmployeeId,originTerminalId,correlationId,lang));
        return new ResponseEntity<List<Account>>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<List<Account>> getAvailableBalance(@ApiParam(value = "account id of the user.",required=true ) @PathVariable("accountId") String accountId,
        @ApiParam(value = "Global transaction Id" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,
        @ApiParam(value = "User ID of the requester (as per LDAP)" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,
        @ApiParam(value = "The time stamp when the request was sent to system" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,
        @ApiParam(value = "Third party Provide ( TPP ) ID" ,required=true) @RequestHeader(value="tppId", required=true) String tppId,
         @NotNull@ApiParam(value = "Third party Provide ( TPP ) Application Id", required = true) @RequestParam(value = "client_id", required = true)  String clientId,
        @ApiParam(value = "Subscription ID of a subscriber " ,required=true) @RequestHeader(value="subscriptionId", required=true) String subscriptionId,
        @ApiParam(value = "Encrypted access token " ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
         @NotNull@ApiParam(value = "", required = true) @RequestParam(value = "client_secret", required = true)  String clientSecret,
        @ApiParam(value = "ID of the source system invoking" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,
        @ApiParam(value = "ID of the channel from which the invocation occurred" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,
        @ApiParam(value = "ID of the department from which the invocation occurred" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,
        @ApiParam(value = "Employee ID of the requester (as per employee HR record)" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,
        @ApiParam(value = "Terminal ID of the requester" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,
        @ApiParam(value = "Correlation ID passed by the requesting system" ) @RequestHeader(value="correlationId", required=false) String correlationId,
        @ApiParam(value = "2-character iso code for preferred language.  If empty the default will be English" ) @RequestHeader(value="lang", required=false) String lang) {

	GetAvailableBalanceResponseWrapper res = getAvailableBalanceI.execute(new GetAvailableBalanceP(accountId,journeyId,originUserId,timeStamp,tppId,clientId,subscriptionId,authorization,clientSecret,originSourceId,originChannelId,originDeptId,originEmployeeId,originTerminalId,correlationId,lang));
        return new ResponseEntity<List<Account>>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<List<Branch>> getBranches(@ApiParam(value = "Global Transaction id/Journey ID" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,
        @ApiParam(value = "User ID of the requester (as per LDAP)" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,
        @ApiParam(value = "The time stamp when the request was sent to system" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,
        @ApiParam(value = "Third party Provide ( TPP ) ID" ,required=true) @RequestHeader(value="tppId", required=true) String tppId,
         @NotNull@ApiParam(value = "Third party Provide ( TPP ) Application Id", required = true) @RequestParam(value = "client_id", required = true)  String clientId,
        @ApiParam(value = "Subscription ID of a subscriber " ,required=true) @RequestHeader(value="subscriptionId", required=true) String subscriptionId,
        @ApiParam(value = "Encrypted access token " ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
         @NotNull@ApiParam(value = "", required = true) @RequestParam(value = "client_secret", required = true)  String clientSecret,
        @ApiParam(value = "ID of the source system invoking" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,
        @ApiParam(value = "ID of the channel from which the invocation occurred" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,
        @ApiParam(value = "ID of the department from which the invocation occurred" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,
        @ApiParam(value = "Employee ID of the requester (as per employee HR record)" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,
        @ApiParam(value = "Terminal ID of the requester" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,
        @ApiParam(value = "Correlation ID passed by the requesting system" ) @RequestHeader(value="correlationId", required=false) String correlationId,
        @ApiParam(value = "2-character iso code for preferred language.  If empty the default will be English" ) @RequestHeader(value="lang", required=false) String lang) {

	GetBranchesResponseWrapper res = getBranchesI.execute(new GetBranchesP(journeyId,originUserId,timeStamp,tppId,clientId,subscriptionId,authorization,clientSecret,originSourceId,originChannelId,originDeptId,originEmployeeId,originTerminalId,correlationId,lang));
        return new ResponseEntity<List<Branch>>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

}
