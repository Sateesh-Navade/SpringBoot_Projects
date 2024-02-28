package com.example.merchantBootApp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.merchantBootApp.dto.Department;
import com.example.merchantBootApp.dto.Merchant;
import com.example.merchantBootApp.repository.DepartmentRepo;

@Repository
public class DepartmentDao {
	@Autowired
	private DepartmentRepo drepo;
	
	public Department saveDept(Department d) {
		return drepo.save(d);
	}
	public Optional<Department> findById(int id){
		return drepo.findById(id);
	}

}
