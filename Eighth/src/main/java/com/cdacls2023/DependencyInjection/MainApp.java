package com.cdacls2023.DependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A {
	
}

@Component
	@Lazy
class B {
	private A obj;
	
	public B(A obj) {
		this.obj = obj; 
		System.out.println("Initialization done");
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
