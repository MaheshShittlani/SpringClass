package com.mahesshittlani.learnhibernateandjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mahesshittlani.learnhibernateandjpa.course.jpa.CourseJPARepository;
import com.mahesshittlani.learnhibernateandjpa.course.springdatajpa.CourseSpringDataJPARepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	@Autowired
//	private CourseJPARepository repository;
//	private CourseRepository repository;
	private CourseSpringDataJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.save(new Course(2, "Learn AWS", "Mahesh Shittlani"));
//		repository.save(new Course(4, "Learn JAVA WEB", "Sumit Sharma"));
		
		
//		repository.deleteById(4);
		
//		System.out.println(repository.findById(1));
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
//		
		
//		System.out.println(repository.findAll());
		
//		System.out.println(repository.count());
		
//		System.out.println(repository.findByAuthor("Mahesh Shittlani"));
		System.out.println(repository.findByTitle("Learn AWS"));
	}
	
}
