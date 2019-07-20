package com.rogersamson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RmsNamingServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RmsNamingServerApplication.class, args);
	}
}
