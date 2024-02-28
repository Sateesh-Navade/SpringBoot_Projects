package com.example.merchantBootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.merchantBootApp.dto.Branch;
import com.example.merchantBootApp.dto.ResponseStructure;
import com.example.merchantBootApp.services.BranchService;

@RestController
@RequestMapping("/branchs")
public class BranchController {
	
	@Autowired
	private BranchService bs;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseStructure<Branch> saveBranch(@RequestBody Branch b){
		return bs.saveBranch(b);	
	}
}
