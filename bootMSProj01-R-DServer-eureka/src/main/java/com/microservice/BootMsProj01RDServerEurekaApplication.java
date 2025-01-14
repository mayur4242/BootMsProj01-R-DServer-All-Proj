package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMsProj01RDServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj01RDServerEurekaApplication.class, args);
	}

}
