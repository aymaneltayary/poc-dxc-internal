package com.dxc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmpSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpSrvApplication.class, args);
	}

}
