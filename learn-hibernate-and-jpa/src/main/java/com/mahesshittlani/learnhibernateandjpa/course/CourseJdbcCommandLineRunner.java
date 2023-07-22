package com.mahesshittlani.learnhibernateandjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mahesshittlani.learnhibernateandjpa.course.jpa.CourseJPARepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	@Autowired
	private CourseJPARepository repository;
//	private CourseRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(3, "Learn AWS", "Mahesh Shittlani"));
//		repository.insert(new Course(4, "Learn JAVA WEB", "Sumit Sharma"));
		
		
		repository.delete(2);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}
	
}
