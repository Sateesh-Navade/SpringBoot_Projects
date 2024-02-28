package com.example.merchantBootApp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.merchantBootApp.dto.Employee;
import com.example.merchantBootApp.repository.EmployeeRepo;

@Repository
public class EmployeeDao {
	@Autowired
	private EmployeeRepo erepo;
	
	public Employee saveEmployee(Employee e) {
		return erepo.save(e);
	}
	
	public Optional<Employee> findById(int dept_id) {
		return erepo.findById(dept_id);
	}

}
