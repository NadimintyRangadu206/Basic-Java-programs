package com.springboot.main.controller;

import java.util.Arrays;

import org.springframework.http.HttpStatus;

import com.springboot.main.response.ResponseObject;

public class BaseController {

	public <T> ResponseObject getResponse(T entity) {
		if (entity != null) {
			return new ResponseObject(entity, null, HttpStatus.OK);
		}
		return new ResponseObject(Arrays.asList(), null, HttpStatus.OK);
	}
}
