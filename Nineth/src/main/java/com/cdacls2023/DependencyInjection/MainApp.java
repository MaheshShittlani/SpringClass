package com.cdacls2023.DependencyInjection;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class A {
	
}

@Component
@Scope(value =  ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
			
			System.out.println(context.getBean(A.class));
			System.out.println(context.getBean(A.class));
			System.out.println(context.getBean(A.class));
			
			System.out.println(context.getBean(B.class));
			System.out.println(context.getBean(B.class));
			System.out.println(context.getBean(B.class));
			System.out.println(context.getBean(B.class));
			System.out.println(context.getBean(B.class));
		}
	}

}
