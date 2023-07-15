package com.cdacls2023.First;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SFirstApplication.class, args);
		
		int[] arr = {22,11,45,66,3,28,90};
		CustomBinarySearch binarySearch = new CustomBinarySearch(new SelectionSort());
		binarySearch.search(arr, 66);
		
		int[] arr2 = {55,77,11,22,99,67};
		CustomBinarySearch binarySearch2 = new CustomBinarySearch(new BubbleSort());
		binarySearch2.search(arr2, 22);
	}

}
