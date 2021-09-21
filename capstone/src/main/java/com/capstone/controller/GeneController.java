package com.capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.Gene;
import com.capstone.repository.GeneRepository;

@CrossOrigin
@RestController
public class GeneController {
	
	@Autowired
	GeneRepository geneRepository;
	
	@GetMapping("/findAllGenes")
	@ResponseBody
	public ResponseEntity<List<Gene>> findAllGenes(){
		List<Gene> allGenes = this.geneRepository.findAll();
		return new ResponseEntity<>(allGenes, HttpStatus.OK);
	}
}
