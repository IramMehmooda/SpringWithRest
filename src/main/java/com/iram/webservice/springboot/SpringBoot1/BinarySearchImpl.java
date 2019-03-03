package com.iram.webservice.springboot.SpringBoot1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	SortingAlgorithm algorithm;
	
	
	
	public BinarySearchImpl(SortingAlgorithm algo) {
		super();
		this.algorithm = algo;
	}



	public int search(int[] arr,int num) {
		algorithm.sort();
		System.out.println("In Binary Search Impl.search()");
		return 3;
	}

}
