package com.kc.spring_recipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kc.spring_recipe")
public class SpringRecipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRecipeApplication.class, args);
	}

}
