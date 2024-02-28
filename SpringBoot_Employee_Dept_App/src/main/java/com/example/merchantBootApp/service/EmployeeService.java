package com.example.merchantBootApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.merchantBootApp.dao.DepartmentDao;
import com.example.merchantBootApp.dao.EmployeeDao;
import com.example.merchantBootApp.dto.Department;
import com.example.merchantBootApp.dto.Employee;
import com.example.merchantBootApp.dto.ResponseStructure;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao edao;
	@Autowired
	private DepartmentDao ddao;
	
	public ResponseEntity<ResponseStructure<Employee>> saveEmp(Employee e,int Dept_id) {
		Optional<Department> recivedDept=ddao.findById(Dept_id);
		ResponseStructure<Employee> response=new ResponseStructure<>();
		if(recivedDept.isPresent()) {
			Department dept=recivedDept.get();
			dept.getEmps().add(e);
			e.setDepartments(dept);
			
			response.setData(edao.saveEmployee(e));
			response.setMessage("Employee Added");
			response.setStatusCode(HttpStatus.CREATED.value());
			return new ResponseEntity<ResponseStructure<Employee>>(response,HttpStatus.CREATED);
		}
		return new ResponseEntity<ResponseStructure<Employee>>(response,HttpStatus.NOT_FOUND);
		
	
	}



}
