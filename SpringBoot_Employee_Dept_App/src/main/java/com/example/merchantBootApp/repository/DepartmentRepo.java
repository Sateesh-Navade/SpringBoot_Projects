package com.example.merchantBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.merchantBootApp.dto.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
