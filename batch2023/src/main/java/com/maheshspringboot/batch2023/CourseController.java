package com.maheshspringboot.batch2023;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(
				new Course(1, "JAVA Fundamental", "Mahesh Shittlani"),
				new Course(2, "Java web programming", "Mahesh Shittlani"),
				new Course(3, ".Net with C#", "Sumit"),
				new Course(4, "Soft Skills", "Manoj sharma"),
				new Course(5, "Data Strucuture", "Mahesh Shittlani")
		);
		
	}
}
