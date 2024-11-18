package com.example.CakeBaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class CakeBakerApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve the CakeBaker bean
		CakeBaker cakeBaker = context.getBean(CakeBaker.class);

		// Call the business logic
		cakeBaker.bakeCake();
	}

}


