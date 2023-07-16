package com.cdacls2023.First;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean
	public SelectionSort selectionSort() {
		return new SelectionSort();
	}
	
	@Bean
	@Primary
	public BubbleSort bubbleSort() {
		return new BubbleSort();
	}
	
	@Bean(name = "binarySearch")
	public CustomBinarySearch binarySearch(SortAlgo sortAlgo) {
		return new CustomBinarySearch(sortAlgo);
	}
}
