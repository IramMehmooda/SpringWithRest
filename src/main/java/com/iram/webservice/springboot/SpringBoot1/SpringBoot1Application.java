package com.iram.webservice.springboot.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext app=SpringApplication.run(SpringBoot1Application.class, args);
		BinarySearchImpl binary=app.getBean(BinarySearchImpl.class);
		int result=binary.search(new int[] {1,2,3,4},3);
		System.out.println(result);
	
	}
}
