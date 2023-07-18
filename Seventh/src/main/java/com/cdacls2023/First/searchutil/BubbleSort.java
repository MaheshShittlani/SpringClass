package com.cdacls2023.First.searchutil;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("bubbleSortQualifier")
public class BubbleSort implements SortAlgo {
	public void sort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++ ) {
			for(int j = 0; j < n - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}
}
