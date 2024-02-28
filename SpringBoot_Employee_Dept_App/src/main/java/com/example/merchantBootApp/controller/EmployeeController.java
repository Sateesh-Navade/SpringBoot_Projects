package com.example.merchantBootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.merchantBootApp.dto.Employee;
import com.example.merchantBootApp.dto.ResponseStructure;
import com.example.merchantBootApp.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	
	public ResponseEntity<ResponseStructure<Employee>> saveEmp(@RequestBody Employee e,@PathVariable(name = "dept_id") int dept_id){
		return es.saveEmp(e,dept_id);
	}
}
