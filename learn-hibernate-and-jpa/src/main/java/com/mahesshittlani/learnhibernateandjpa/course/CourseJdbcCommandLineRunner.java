package com.mahesshittlani.learnhibernateandjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mahesshittlani.learnhibernateandjpa.course.jdbc.CourseRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	@Autowired
	private CourseRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(2, "Learn JAVA WEB", "Mahesh Shittlani"));
//		repository.insert(new Course(4, "Learn .Net", "Sumit Sharma"));
		
//		repository.deleteById(2);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
	}
	
}
