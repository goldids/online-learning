package com.cg.controller;

import java.util.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.StudentEntity;
@RestController
@RequestMapping("/")		
public class ControllerClass {
	
		List <StudentEntity> e=new ArrayList<>();
		
		public ControllerClass() {
			e.add(new StudentEntity("Goldi",1,"CSE","LPU"));
			e.add(new StudentEntity("Pooja",2,"ECE","ANANT"));
					
		}
		@RequestMapping(value="/{name}", method=RequestMethod.GET)
		public String index(@PathVariable String name) {
			return "Welcome to Sring Boot!" + name;
		}

		@RequestMapping(value="/", method=RequestMethod.GET)
		public List<StudentEntity> index() {

			return e ;
		}
		

		@RequestMapping("/greet")
		public String greet() {
			return "Greetings from Spring Boot!";
		}

}
