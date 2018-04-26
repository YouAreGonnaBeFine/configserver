package com.china.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AthenaDevCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AthenaDevCloudConfigApplication.class, args);
	}
}
