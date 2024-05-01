package com.example.SpringRestApi.sbeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringRestApi.Company;

@SpringBootApplication
public class SpringRestApi05ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		// get IOC Container
		 ConfigurableApplicationContext ctx = SpringApplication.run(SpringRestApi05ConfigurationPropertiesApplication.class, args);
	     
	    
	}

}
