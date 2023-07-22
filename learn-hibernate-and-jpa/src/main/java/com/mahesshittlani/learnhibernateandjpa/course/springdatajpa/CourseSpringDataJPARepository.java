package com.mahesshittlani.learnhibernateandjpa.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesshittlani.learnhibernateandjpa.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Integer> {

	public List<Course> findByTitle(String title);
	
	public List<Course> findByAuthor(String title);
}
