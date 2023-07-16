package com.cdacls2023.ConfigLearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String addressline, String city) {}
@Configuration
public class AppConfig {
	
	@Bean
	public String name() {
		return "Mahesh";
	}
	
	@Bean
	public int age() {
		return 30;
	}
	
	@Bean
	public Person me() {
		return new Person(name(),age());
	}
	
	@Bean
	public Address address() {
		return new Address("V.T. Road, Mansarovar", "Jaipur");
	}
	
	@Bean(name = "officeAddress")
	public Address address2() {
		return new Address("Janpath - Sodala", "Jaipur");
	}
}
