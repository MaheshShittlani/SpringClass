package com.cdacls2023.ConfigLearning;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		// 1. Launch the application context
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// 2. Manage the configuration of spring beans
		System.out.println(context.getBean("name"));
	}
}
