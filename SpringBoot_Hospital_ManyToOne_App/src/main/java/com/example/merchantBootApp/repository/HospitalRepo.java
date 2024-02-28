package com.example.merchantBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.merchantBootApp.dto.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer> {

}
