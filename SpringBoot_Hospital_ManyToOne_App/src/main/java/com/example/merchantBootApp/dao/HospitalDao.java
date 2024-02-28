package com.example.merchantBootApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.merchantBootApp.dto.Hospital;
import com.example.merchantBootApp.repository.HospitalRepo;

@Repository
public class HospitalDao {
	
	@Autowired
	private HospitalRepo hr;
	
	public Hospital saveHospital(Hospital h) {
		return hr.save(h);
	}
}
