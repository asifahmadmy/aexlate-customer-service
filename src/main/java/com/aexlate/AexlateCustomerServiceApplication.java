package com.aexlate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class AexlateCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AexlateCustomerServiceApplication.class, args);
	}

}
