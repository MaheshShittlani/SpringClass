package com.cdacls2023.ConfigLearning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	@Primary
	@Qualifier("homeAddress")
	public Address address() {
		return new Address("V.T. Road, Mansarovar", "Jaipur");
	}
	
	@Bean
	public Person me() {
		return new Person(name(),age(), address());
	}
	@Bean
	public Person myBrother(String name, int age, @Qualifier("workAddress") Address brotherAddress) {
		return new Person("Sunny", 25, brotherAddress);
	}
	@Bean(name = "officeAddress")
	@Qualifier("workAddress")
	public Address address2() {
		return new Address("Janpath - Sodala", "Jaipur");
	}
}
