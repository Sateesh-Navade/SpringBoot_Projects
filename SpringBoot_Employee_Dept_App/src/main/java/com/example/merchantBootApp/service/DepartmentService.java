package com.example.merchantBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.merchantBootApp.dao.DepartmentDao;
import com.example.merchantBootApp.dto.Department;
import com.example.merchantBootApp.dto.ResponseStructure;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentDao ddao;
	
	public ResponseStructure<Department> saveDept(Department d) {
		ResponseStructure<Department> response=new ResponseStructure<>();
		response.setMessage("Department Saved");
		response.setData(ddao.saveDept(d));
		response.setStatusCode(HttpStatus.CREATED.value());
		return response;
	}

}
