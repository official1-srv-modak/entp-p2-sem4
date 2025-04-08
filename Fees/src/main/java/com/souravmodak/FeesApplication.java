package com.souravmodak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeesApplication.class, args);
	}

}
