package com.springboot.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.entity.VerificationResult;

@Repository
public interface VerificationResultRepository extends JpaRepository<VerificationResult, Long> {
	
}