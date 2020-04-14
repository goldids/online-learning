package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;
@SpringBootApplication
public class DaytuesdayspringbootjpaApplication{

	@Autowired
	StudentDaoI studao;
	
	public static void main(String[] args) {
		SpringApplication.run(DaytuesdayspringbootjpaApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Student s=new Student(1,"Goldi","cse");
//		Student s1=new Student(2,"Pooja","ETC");
//		Student s2=new Student(3,"Lucky","Mechanical");
//		//studao.create(s);studao.create(s1);studao.create(s2);
//		studao.create(s2);
//		System.out.println("Inserted");
////		
//	
////		  List<Student> studentlist =studao.retrive();
////		  
////		  for(Student stu:studentlist) { System.out.println(stu.getRegNo() +" "+
////		  stu.getName() +" "+ stu.getDept() ); }
////		
//		  
////			  Student stu=studao.findById(2); System.out.println(stu.getRegNo() +" "+
////			  stu.getName() + stu.getDept());
////			 
//			
//			//studao.delete(3);
//			
//			//studao.update(4);
//		
//	}
//
}
