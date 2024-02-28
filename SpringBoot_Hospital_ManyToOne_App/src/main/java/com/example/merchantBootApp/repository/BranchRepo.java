package com.example.merchantBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.merchantBootApp.dto.Branch;

public interface BranchRepo extends JpaRepository<Branch, Integer>  {
	
}
