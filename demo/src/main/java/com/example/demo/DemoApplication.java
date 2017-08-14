package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.app.BinarySearchImpl;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 5);
		System.out.println(result);
	}
}
