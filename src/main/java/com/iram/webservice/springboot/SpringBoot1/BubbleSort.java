package com.iram.webservice.springboot.SpringBoot1;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortingAlgorithm{
	@Override
	public void sort() {
		System.out.println("Using Bubble Sort");
		System.out.println("Here");
		
	}

}
