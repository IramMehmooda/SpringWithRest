package com.iram.webservice.springboot.SpringBoot1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortingAlgorithm{
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		System.out.println("Using Quick Sort");
		
	}

}
