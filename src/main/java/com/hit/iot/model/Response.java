package com.hit.iot.model;

public class Response {
	private String message;
	private Object responsePayload;

	public Response(String message, Object responsePayload) {
		this.message = message;
		this.responsePayload = responsePayload;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResponsePayload() {
		return responsePayload;
	}
	public void setResponsePayload(Object responsePayload) {
		this.responsePayload = responsePayload;
	}
}
