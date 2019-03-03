package com.iram.webservice.springboot.SpringBoot1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	SortingAlgorithm algorithm;
	String name;
	
	
	
	public BinarySearchImpl(SortingAlgorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}



	public int search(int[] arr,int num) {
		algorithm.sort();
		System.out.println("In Binary Search Impl.search()");
		return 3;
	}

}
