package com.aprendepe.categories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CategoriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoriesApplication.class, args);
	}

}
