package com.example.merchantBootApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.merchantBootApp.dao.HospitalDao;
import com.example.merchantBootApp.dto.Hospital;
import com.example.merchantBootApp.dto.ResponseStructure;

@Service
public class HospitalService {

	@Autowired
	private HospitalDao hdao;
	
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(Hospital h) {
		
		
		return null;
	}

}
