package com.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.entity.Gene;

public interface GeneRepository extends JpaRepository<Gene, String>{

}
