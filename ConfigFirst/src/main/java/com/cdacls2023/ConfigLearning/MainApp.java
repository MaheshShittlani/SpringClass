package com.cdacls2023.ConfigLearning;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		// 1. Launch the application context
		var context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// 2. Manage the configuration of spring beans
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("me"));
		
		System.out.println(context.getBean("myBrother"));
//		System.out.println(context.getBean("address"));
		
//		System.out.println(context.getBean("officeAddress"));
		
//		System.out.println(context.getBean(Address.class));
	}
}
