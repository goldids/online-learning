package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;
import com.cg.service.StuServiceI;

@Component
@RestController

public class StudentController {
	@Autowired
	StuServiceI stuservice;
	
	@RequestMapping("/")
	public List getallstudents()
	{
		return stuservice.getStudents();
	}
	@RequestMapping("/students")
	public List getallstudents1()
	{
		return  stuservice.getStudents();
	}
	@RequestMapping("/students/{id}")
	public Student findbyId(@PathVariable int id)
	{
		return stuservice.findbyId(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void addStudent(@RequestBody Student s)
	{
		stuservice.create(s);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
	public void updateStudent(@RequestBody Student s, @PathVariable int id)
	{
		stuservice.update(s);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{id}")
	public void delete(@PathVariable int id)
	{
		stuservice.delete(id);
	}
}
