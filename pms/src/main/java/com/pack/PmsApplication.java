package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PmsApplication extends SpringBootServletInitializer {
	
	
			
			@Override
			protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
				
				return builder.sources(PmsApplication.class);
			}
			

	public static void main(String[] args) {
		SpringApplication.run(PmsApplication.class, args);
	}

}