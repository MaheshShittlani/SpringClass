package com.cdacls2023.First;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SFirstApplication.class, args);
		
		int[] arr = {22,11,45,66,3,28,90};
		
		CustomBinarySearch binarySearch = new CustomBinarySearch();
		binarySearch.search(arr, 66);
	}

}
