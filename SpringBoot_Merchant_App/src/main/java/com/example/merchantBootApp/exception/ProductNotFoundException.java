package com.example.merchantBootApp.exception;

public class ProductNotFoundException extends RuntimeException {
	public ProductNotFoundException(String message) {
		super(message);
	}
	public ProductNotFoundException() {
		super();
	}
	
}
