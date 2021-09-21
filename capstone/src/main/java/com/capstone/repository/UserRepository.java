package com.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capstone.entity.User;

public interface UserRepository extends JpaRepository <User, String>{
	
	@Query("SELECT U FROM USER U WHERE U.email = ?1 AND U.password = ?2")
	User loginUser (String email, String password);
}
