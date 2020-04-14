package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="Students55")
public class Student {

	@Id
	@Column
	private int regNo;
	
	@Column
	private String name;
	
	
	@Column
	private String dept;


	public Student(int regNo, String name, String dept) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.dept = dept;
	}
	public Student()
	{
		
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
