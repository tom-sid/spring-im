package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.app.BinarySearchImpl;
import com.example.demo.app.QuickSortAlgorithm;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 5);
		System.out.println(result);
		SpringApplication.run(DemoApplication.class, args);
	}
}
