package com.cdacls2023.First.searchutil;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NthSmallestUtil {
	private SortAlgo sortAlgo;
	
	public NthSmallestUtil(@Qualifier("selectionSortQualifier") SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
	
	public int findNthSmallest(int[] arr , int n) {
		System.out.println(sortAlgo);
		sortAlgo.sort(arr);
		return arr[n-1];
	}
}
