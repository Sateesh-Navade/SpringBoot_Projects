package com.example.merchantBootApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.merchantBootApp.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	

}
