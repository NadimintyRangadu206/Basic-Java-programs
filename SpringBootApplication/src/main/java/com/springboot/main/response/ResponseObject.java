package com.springboot.main.response;

import java.util.List;

import org.springframework.http.HttpStatus;

public class ResponseObject {

	private Object response;
	private String message;
	private HttpStatus status;
	private List<String> messages;
}
