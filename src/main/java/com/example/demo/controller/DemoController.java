package com.example.demo.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {

	@GetMapping
	public ResponseEntity<Object> printLog(@RequestHeader Map<String, String> headers) {
	    headers.forEach((key, value) -> {
	    	StringBuilder stringBuilder = new StringBuilder();
	    	stringBuilder.append("Headers ").append(key).append(" = ").append(value);
	        System.out.println(stringBuilder.toString());
	    });
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
