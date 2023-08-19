package com.maheshshittlani.ecomclassroomapprestapi.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	@RequestMapping(path = "/hello-world", method = RequestMethod.GET)
	@GetMapping(path = "/hello-world")
	public String sayHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "hello-world-bean/{name}")
	public HelloWorldBean sayHelloWorldBean(@PathVariable String name) {
		return new HelloWorldBean("Hello "+name);
	}
}
