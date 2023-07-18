package com.cdacls2023.First.searchapp;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cdacls2023.First.searchutil.CustomBinarySearch;
import com.cdacls2023.First.searchutil.NthSmallestUtil;

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
			binarySearch.search(arr, item);
			
			int arr2[] = {65,11,88,22,34,29};
			NthSmallestUtil obj =  context.getBean(NthSmallestUtil.class);
			
			int result = obj.findNthSmallest(arr2, 3);
			System.out.println("3rd smallest items "+ result);
			
			
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
