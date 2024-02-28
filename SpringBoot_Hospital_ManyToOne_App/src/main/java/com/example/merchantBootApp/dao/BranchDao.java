package com.example.merchantBootApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.merchantBootApp.dto.Branch;
import com.example.merchantBootApp.repository.BranchRepo;

@Repository
public class BranchDao {
	
	@Autowired
	private BranchRepo mr;
	
	public Branch saveBranch(Branch b) {
		return mr.save(b);
	}
}
