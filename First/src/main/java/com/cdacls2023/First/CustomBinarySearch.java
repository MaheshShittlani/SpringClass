package com.cdacls2023.First;

public class CustomBinarySearch {
	public void search(int[] arr, int item) {
		// Sort
//		SelectionSort sortAlgo = new SelectionSort();
		BubbleSort sortAlgo = new BubbleSort();
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
