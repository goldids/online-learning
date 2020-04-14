package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;

@Service
public class StuService implements StuServiceI{
	@Autowired
	StudentDaoI studentdao;

	@Override
	public List getStudents() {
		return studentdao.retrive();
	}

	@Override
	public Student findbyId(int id) {
		return studentdao.findById(id);
	}

	@Override
	public void create(Student s) {
		studentdao.create(s);
		
	}

	@Override
	public void update(Student s) {
		studentdao.update(s);
		
	}

	@Override
	public void delete(int id) {
		studentdao.delete(id);
		
	}
	
	

}
