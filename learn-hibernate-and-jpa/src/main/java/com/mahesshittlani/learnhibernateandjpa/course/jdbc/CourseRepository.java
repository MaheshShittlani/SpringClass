package com.mahesshittlani.learnhibernateandjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mahesshittlani.learnhibernateandjpa.course.Course;

@Repository
public class CourseRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = 
			"""
				INSERT INTO COURSES (id, title, author) values(?,?,?)
			""";
	
	public String DELETE_QUERY = 
			"""
				DELETE FROM courses where id = ?
			""";
	
	public String SELECT_QUERY = 
			"""
				SELECT id, title, author from courses where id = ?
			""";
	
	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getTitle(), course.getAuthor());
	}
	
	public void deleteById(int id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(int id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class), id);
//		ResultSet -> Bean by using RowMapper
	}
}
