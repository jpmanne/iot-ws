/**
* @author  Jaya Prakash Manne
* @version 1.0
* @since   01-Nov-2019 
*/
package com.hit.iot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.hit.iot.common.Constants;
import com.hit.iot.model.Response;

@RestController
public abstract class BaseController {
	
	/*@Autowired
	AuthCodeRepository authCodeRepository;
	
	@Autowired
	ExceptionRepository exceptionRepository;*/
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//=========================================================================
	
	/*public AuthorizationDetails validateAuthorization(String authCode) {
		String logTag = "validateAuthorization() : ";
		LOGGER.info(logTag + "START of the method");
		AuthorizationDetails authorizationDetails = new AuthorizationDetails();
		
		try {
			List<AuthCodeDetails> authCodes = authCodeRepository.getAuthCodeDetailsByAuthCode(authCode); 
			if(authCodes != null && !authCodes.isEmpty()) { 
				if(authCodes.size() > 1) {
					LOGGER.error(logTag + "Found multiple entries for the authCode, "+authCode); 
					
				} else {
					AuthCodeDetails authCodeDetails = authCodes.get(0);
					LOGGER.info(logTag + "AuthCode: " + authCodeDetails.getAuthCode());
					authorizationDetails.setAuthCode(authCode);
					authorizationDetails.setUserDetailsId(authCodeDetails.getUserDetails().getUserDetailsId()); 
					
					if(Constants.ACTIVE.equalsIgnoreCase(authCodeDetails.getStatus())) {
						authorizationDetails.setValidAuthCode(true);
						
						//TODO: Need to check whether the user is valid authorization to access this api
						authorizationDetails.setValidAccess(true); //This is temporary
					}
				}
			}
		} catch (Exception e) {
			LOGGER.error(logTag + "Exception while validating the authorization, "+authCode, e);  
		}
		
		return authorizationDetails;
	}*/
	
	//=========================================================================
	
	public ResponseEntity<Response> getInvalidDataResponseEntity(String validationResult) {
		Response response = new Response(validationResult, null);
		return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
	}
	
	//=========================================================================
	
	/*public void handleException(Logger LOGGER,  String logTag, String exceptionMessage, Throwable e, AuthorizationDetails authorizationDetails) throws JBoradException {
		LOGGER.error(logTag + exceptionMessage, e);  
		throw new JBoradException(exceptionRepository, logTag, exceptionMessage, e, authorizationDetails);
	}*/
	
	//=========================================================================
	
	public Response getInvalidAuthCodeRespose(String authCode) {
		return new Response("Invalid AuthCode ["+authCode+"]", null);
	}
	
	//=========================================================================
	
	public Response getUnAuthorizedAccessRespose() {
		return new Response("Unauthorized Access", null);
	}
	
	//=========================================================================
	
	public Response getInvalidInputRespose() {
		return new Response("Invalid Input", null);
	}
	
	//=========================================================================
}
