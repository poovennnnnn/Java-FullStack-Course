package com.pooven.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pooven.dto.Student;
import com.pooven.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beanss.xml");
		StudentServiceImpl service = (StudentServiceImpl) ctx.getBean("studentService");
		Student s1 = new Student(303, "hiber1", 20, 4002, 203);
		
//		service.addRecord(s1);
		
		Student s2 = service.findRecordbyId(303);
		System.out.println(s2);
		System.out.println("------------------");
		Student s3 = new Student(303, "update1", 20, 4002, 203);
		Student updatedStudent = service.updateById(303, s3);
		System.out.println(updatedStudent);
		System.out.println("------------------");
		
		service.deleteRecord(303);
			
	}

}
