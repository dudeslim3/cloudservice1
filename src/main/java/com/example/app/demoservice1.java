package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class demoservice1 {

	public static void main(String[] args) {
		SpringApplication.run(demoservice1.class, args);
	}
	
	
	/*
	 * @Bean //@LoadBalanced public RestTemplate restTemplate() { return new
	 * RestTemplate(); }
	 */
}
