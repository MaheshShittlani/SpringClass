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
		repository.insert();
	}
	
}
