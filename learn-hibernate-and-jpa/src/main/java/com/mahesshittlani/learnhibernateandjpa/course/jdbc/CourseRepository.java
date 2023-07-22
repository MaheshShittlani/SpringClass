package com.mahesshittlani.learnhibernateandjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = 
			"""
				INSERT INTO COURSES (id, title, author) values(3, 'Learn DSA' ,'Rahul Sharma');
			""";
	
	public void insert() {
		jdbcTemplate.update(INSERT_QUERY);
	}
}
