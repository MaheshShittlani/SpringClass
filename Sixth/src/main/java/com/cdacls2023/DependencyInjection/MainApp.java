package com.cdacls2023.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessLogic {
	private Dependency1 dependency1;
	private Dependency2 dependency2;
	
	
	@Autowired // Optional - By default
	public BusinessLogic(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}


	public void setDependency1(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}

	
	public void setDependency2(Dependency2 dependency2) {
		this.dependency2 = dependency2;
	}
	
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
