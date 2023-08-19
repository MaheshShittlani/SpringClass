package com.maheshshittlani.ecomclassroomapprestapi.restapi.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	private UserDaoService userDaoService;

	public UserResource(UserDaoService userDaoService) {
		this.userDaoService = userDaoService;
	}

	@GetMapping(path = "/users")
	public List<User> fetchAllUsers() {
		return userDaoService.findAll();
	}

	@GetMapping(path = "/users/{id}")
	public User fetchUser(@PathVariable int id) {
		return userDaoService.findOne(id);
	}

	@PostMapping(path = "/users")
	public ResponseEntity<User> create(@RequestBody User user) {
		User savedUser = userDaoService.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
}
