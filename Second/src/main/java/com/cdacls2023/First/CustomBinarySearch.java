package com.cdacls2023.First;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomBinarySearch {
	@Autowired
	private SortAlgo sortAlgo;
	
	public CustomBinarySearch(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
	
	public void search(int[] arr, int item) {
		
		System.out.println(sortAlgo);
		// Sort
		sortAlgo.sort(arr);
		// Search
		int result = searchItem(arr, item);
		// Result
		if(result != -1) {
			System.out.println("Item found at position: "+result);
		}else {
			System.out.println("Item not found");
		}
	}

	private int searchItem(int[] arr, int item) {
		int lb = 0;
		int ub = arr.length - 1;
		while(lb <= ub) {
			int mid = (lb + ub) / 2;
			if(item == arr[mid]) {
				return mid;
			} else if(item > arr[mid]) {
				lb = mid + 1;
			} else {
				ub = mid - 1;
			}
		}
		return -1;
	}
}
