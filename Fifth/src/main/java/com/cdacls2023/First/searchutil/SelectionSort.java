package com.cdacls2023.First.searchutil;

import org.springframework.stereotype.Component;

@Component
public class SelectionSort implements SortAlgo {
	public void sort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
}
