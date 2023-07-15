package com.cdacls2023.First;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgo {
	public void sort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++ ) {
			for(int j = 1; j < n - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}
}
