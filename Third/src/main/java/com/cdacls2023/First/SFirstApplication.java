package com.cdacls2023.First;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SFirstApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(SFirstApplication.class, args);
		
		CustomBinarySearch binarySearch = context.getBean(CustomBinarySearch.class);
		int[] arr = {22,11,45,66,3,28,90};
		binarySearch.search(arr, 66);
		
		
		CustomBinarySearch binarySearch2 = context.getBean(CustomBinarySearch.class);
		int[] arr2 = {55,77,11,22,99,67};
		binarySearch2.search(arr2, 22);
	}

}
