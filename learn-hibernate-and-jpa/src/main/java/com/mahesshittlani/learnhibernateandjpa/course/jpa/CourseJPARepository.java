package com.mahesshittlani.learnhibernateandjpa.course.jpa;

import org.springframework.stereotype.Repository;

import com.mahesshittlani.learnhibernateandjpa.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {
	@PersistenceContext
	EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(int id) {
		return entityManager.find(Course.class, id);
	}
	
	public void delete(int id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
