package com.example.demo.app;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm + " : " + sortedNumbers);
		// Search the array
		return 3;
	}
}
