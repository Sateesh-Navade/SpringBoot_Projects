 package com.example.merchantBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //this Annotation will triger EAC and CS anotation
public class SpringBootMerchantAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMerchantAppApplication.class, args);
	}

}
