package com.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.entity.Monster;

@Repository
public interface MonsterRepository extends JpaRepository<Monster, String>{

}
