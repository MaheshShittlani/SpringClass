package com.cdacls2023.DependencyInjection;

import java.io.FileOutputStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class A {
	
}

@Component
class B {
	private A obj;
	private FileOutputStream fis;
	
	public B(A obj) {
		this.obj = obj; 
		System.out.println("Partial intialization");
	}
	
	@PostConstruct
	public void init() {
//		fis = new FileOutputStream(new File("a.txt"));
		System.out.println("Complete Intialization");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup is in progresss...");
//		fis.close();
	}
}

@Configuration
@ComponentScan
public class MainApp {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(MainApp.class)) {
			
			
			context.getBean(B.class);
		}
	}

}
