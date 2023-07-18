package com.cdacls2023.First.searchapp;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cdacls2023.First.searchutil.CustomBinarySearch;

@Configuration
@ComponentScan("com.cdacls2023.First.searchutil")
public class MainApp {
	
	public static void main(String[] args) {
		
		try (
			// Launch the application context
			var context = new AnnotationConfigApplicationContext(MainApp.class)) {
			
			// Do the required configuration
			int arr[] = {22,11,44,33,55,66};
			int item = 33;

			CustomBinarySearch binarySearch =  context.getBean(CustomBinarySearch.class);
//			SelectionSort sortAlgo = (SelectionSort)context.getBean("selectionSort");
//			binarySearch.setSortAlgo(sortAlgo);
			
			
			binarySearch.search(arr, item);
			
			
			String[] beans =  context.getBeanDefinitionNames();
			System.out.println("Loaded beans are...");
			for(String bean : beans) {
				System.out.println(bean);
			}
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
