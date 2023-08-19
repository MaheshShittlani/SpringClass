package com.maheshshittlani.ecomclassroomapprestapi.restapi.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private static int userCount = 0;
	static {
		users.add(new User(++userCount, "Alex", LocalDate.now().minusYears(25)));
		users.add(new User(++userCount, "Tim", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "Clark", LocalDate.now().minusYears(30)));
	}
	
	// Fetch all users
	public List<User> findAll() {
		return users;
	}
	// Fetch single user
	public User findOne(int id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
	// create New user
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	// update user
	// delete user
}
