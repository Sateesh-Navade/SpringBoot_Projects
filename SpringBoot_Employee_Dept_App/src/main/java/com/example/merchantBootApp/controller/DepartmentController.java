package com.example.merchantBootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.merchantBootApp.dto.Department;
import com.example.merchantBootApp.dto.ResponseStructure;
import com.example.merchantBootApp.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService ds;
	
	@PostMapping
	public ResponseStructure<Department> saveDept(@RequestBody Department d){
	return ds.saveDept(d);	
	}
}
