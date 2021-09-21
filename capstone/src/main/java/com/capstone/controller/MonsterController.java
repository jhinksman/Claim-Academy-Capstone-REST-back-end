package com.capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.Monster;
import com.capstone.repository.MonsterRepository;

@CrossOrigin
@RestController
public class MonsterController {
	
	@Autowired
	MonsterRepository monsterRepository;
	
	@RequestMapping(value = "/findAllMonsters", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Monster>>findAllMonsters(){
		List<Monster> allMonsters = this.monsterRepository.findAll();
		return new ResponseEntity<>(allMonsters, HttpStatus.OK);
	}

}
