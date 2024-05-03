package com.learning.mc.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class DepartmentServiceModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceModelApplication.class, args);
	}

}
