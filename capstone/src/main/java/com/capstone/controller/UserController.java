package com.capstone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.User;
import com.capstone.repository.UserRepository;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public void submitUserDetails(@RequestBody User user, String email) {
		this.userRepository.save(user);
	}
	
	@RequestMapping(value="/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	public ResponseEntity<User> loginUser(@RequestBody User u) {
		User user = userRepository.loginUser(u.getEmail(), u.getPassword());
		if(user == null) {
			return new ResponseEntity<User>(HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
//	// OR @GetMapping("/findStudentById")
//		@RequestMapping(value = "/findStudentById", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
//		public ResponseEntity<Optional<Student>> findStudent(String email) {
//			// optional houses the array inside of it, this reduces likelihood of null
//			// pointer exceptions
//			Optional<Student> student = this.studentRepository.findByEmail(email);
//			return new ResponseEntity<>(student, HttpStatus.OK);
//		}
	
	@GetMapping("/findUserById")
	public ResponseEntity<Optional<User>> findUserById(String email){
		Optional<User> user = this.userRepository.findById(email);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

}
