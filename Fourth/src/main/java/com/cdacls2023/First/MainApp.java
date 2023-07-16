package com.cdacls2023.First;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		
		try (
			// Launch the application context
			var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			// Do the required configuration
			int arr[] = {22,11,44,33,55,66};
			int item = 33;

			CustomBinarySearch binarySearch =  (CustomBinarySearch)context.getBean("binarySearch");
//			SelectionSort sortAlgo = (SelectionSort)context.getBean("selectionSort");
//			binarySearch.setSortAlgo(sortAlgo);
			
			
			binarySearch.search(arr, item);
			
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
