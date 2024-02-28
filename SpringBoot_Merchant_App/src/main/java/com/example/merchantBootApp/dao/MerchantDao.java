package com.example.merchantBootApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.merchantBootApp.dto.Merchant;
import com.example.merchantBootApp.repository.MerchantRepo;

@Repository
public class MerchantDao {
	@Autowired
	private MerchantRepo merchantRepository;
	
	
	public Merchant saveMerchant(Merchant m) {
		return merchantRepository.save(m);
	}
	
	public Optional<Merchant> findById(int id){
		return merchantRepository.findById(id);
	}
	
	public List<Merchant> findAll(){
		return merchantRepository.findAll();
	}

	public List<Merchant> findByName(String name) {
		return merchantRepository.findByName(name);
	}

	public boolean deleteById(int id) {
		Optional<Merchant> recMerchant=findById(id);
		merchantRepository.delete(recMerchant.get());
		return true;
	}
	
	public Optional<Merchant> VarifyByPhone(long phone ,String password){
		return merchantRepository.varify(phone, password);
	}
	
	public Optional<Merchant> VarifyByid(int id ,String password){
		return merchantRepository.varify(id, password);
	}
	
}
