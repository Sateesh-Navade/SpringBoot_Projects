package com.example.merchantBootApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.merchantBootApp.dao.BranchDao;
import com.example.merchantBootApp.dto.Branch;
import com.example.merchantBootApp.dto.ResponseStructure;

@Service
public class BranchService {

	@Autowired
	private BranchDao bdao;
	
	public ResponseStructure<Branch> saveBranch(Branch b) {
		ResponseStructure<Branch> s=new ResponseStructure<>();
		s.setMessage("Branch Saved");
		s.setStatusCode(HttpStatus.CREATED.value());
		s.setData(bdao.saveBranch(b));
		return null;
	}

}
