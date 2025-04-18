package com.fezda.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	JdbcTemplate jdbcT;
	
	@RequestMapping("/test")
	public String getText () {
		return "string generated by spring app";
	}
	
	@RequestMapping("/dbTest")
	public String getName () {
		String name = jdbcT.queryForObject("SELECT name FROM person where id = 1", String.class);
		return name;
	}
	
	@RequestMapping("/dbListTest")
	public List<String> getList () {
		List<String> myList = jdbcT.queryForList("SELECT name FROM person where id > 0;", String.class);
		return myList;
	}
	
	@GetMapping(path = "/dbParamTest/{id}")
	public ResponseEntity<String> dbParamTest (@PathVariable Integer id) {
		List<String> names = jdbcT.queryForList("SELECT name FROM person where id = " + id + ";", String.class);
		
		if (names.size() < 1) return new ResponseEntity<> (null, HttpStatus.NO_CONTENT);	// Indicates successful request but no values
		
		return new ResponseEntity<String> (names.get(0), HttpStatus.OK);
	}
	
	// Note: For this to work, you should have a class with an empty constructor, 
	// 		variables corresponding to the column names, and a getter and setter for each variable  
	@GetMapping(path = "/dbCustomClassTest")
	public ResponseEntity<MyCustomClass> dbCustomClassTest () {
		List<MyCustomClass> person = jdbcT.query("SELECT * FROM person where id = 1;", new BeanPropertyRowMapper<MyCustomClass>(MyCustomClass.class));
		return new ResponseEntity<MyCustomClass> (person.get(0), HttpStatus.OK);
	}
	
}
