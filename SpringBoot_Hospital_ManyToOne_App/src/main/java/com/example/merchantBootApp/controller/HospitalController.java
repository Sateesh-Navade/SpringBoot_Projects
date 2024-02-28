package com.example.merchantBootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.merchantBootApp.dto.Hospital;
import com.example.merchantBootApp.dto.ResponseStructure;
import com.example.merchantBootApp.services.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hs;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseStructure<Hospital> saveHospital(@RequestBody Hospital h){
		return hs.saveHospital(h);
	}
	
}
