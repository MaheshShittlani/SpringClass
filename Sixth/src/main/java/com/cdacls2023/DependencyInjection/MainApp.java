package com.cdacls2023.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessLogic {
	@Autowired
	private Dependency1 dependency1;
	@Autowired
	private Dependency2 dependency2;
	
	@Override
	public String toString() {
		return "BusinessLogic [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}

@Configuration
@ComponentScan
public class MainApp {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(MainApp.class)) {
			
			
			String[] beans = context.getBeanDefinitionNames();
			
			for(String bean: beans) {
				System.out.println(bean);
			}
			
			var businessLogic = context.getBean(BusinessLogic.class);
			System.out.println(businessLogic);
		}
	}

}
