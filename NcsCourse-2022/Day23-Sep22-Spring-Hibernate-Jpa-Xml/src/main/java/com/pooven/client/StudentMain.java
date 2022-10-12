package com.pooven.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pooven.dto.Student;
import com.pooven.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beanss.xml");
		StudentService service = (StudentService) ctx.getBean("studentService");
		Student s1 = new Student(303, "hiber1", 20, 4002, 203);
		
//		service.addRecord(s1);
		
		service.findAllRecord();
	}

}
