package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Student;


@Service
public interface StuServiceI {
public void create(Student s);
public List getStudents();
public Student findbyId(int id);
public void update(Student s);
public void delete(int id);
}
