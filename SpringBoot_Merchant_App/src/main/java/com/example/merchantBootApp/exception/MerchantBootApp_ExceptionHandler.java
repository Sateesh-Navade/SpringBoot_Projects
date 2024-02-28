package com.example.merchantBootApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.merchantBootApp.dto.ResponseStructure;

@ControllerAdvice
public class MerchantBootApp_ExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handlingPNFE(ProductNotFoundException e){
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setMessage(e.getMessage());
		structure.setData("Product Not Found");
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handlingINFE(IdNotFoundException e){
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setData("ID Not Found");
		structure.setMessage(e.getMessage());
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidCredentialsException.class)
	public ResponseEntity<ResponseStructure<String>> handlingICE(InvalidCredentialsException e){
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setData("Invalid Credentials");
		structure.setMessage(e.getMessage());
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
}
