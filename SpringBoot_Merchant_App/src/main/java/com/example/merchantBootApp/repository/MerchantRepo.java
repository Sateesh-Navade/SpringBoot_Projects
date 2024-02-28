package com.example.merchantBootApp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.merchantBootApp.dto.Merchant;
                                    //by default JpaRepository(I) have save method to save.findbyid 
public interface MerchantRepo extends JpaRepository<Merchant, Integer>{
	
	@Query("select m from Merchant m where m.phone=?1 and m.password=?2")
	public Optional<Merchant> varify(long phone,String password);
	
	@Query("select m from Merchant m where m.name=?1")
	public List<Merchant> findByName(String name);
	
	@Query("select m from Merchant m where m.email=?1 and m.password=?2")
	public Optional<Merchant> varifyByEmail(String email, String password);
	
	@Query("select m from Merchant m where m.id=?1 and m.password=?2")
	public Optional<Merchant> varifyByid(int id, String password);
		
}
