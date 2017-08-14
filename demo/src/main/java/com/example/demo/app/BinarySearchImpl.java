package com.example.demo.app;

public class BinarySearchImpl {
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm + " : " + sortedNumbers);
		// Search the array
		return 3;
	}
}
