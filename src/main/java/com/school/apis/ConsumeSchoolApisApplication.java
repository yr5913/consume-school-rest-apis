package com.school.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.school.apis.proxy")
public class ConsumeSchoolApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeSchoolApisApplication.class, args);
	}

}
