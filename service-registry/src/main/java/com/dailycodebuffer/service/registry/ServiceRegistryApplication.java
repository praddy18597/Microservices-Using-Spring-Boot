package com.dailycodebuffer.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer                 //for service registry
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}


//IMP: In application.yml file,
//register-with-eureka: false,fetch-registry: false since this is our server and we don't need to go to
// eureka server for registering itself.

// but for user and dept service we need to implement eureka client/server for service registry and
// we make register-with-eureka and eureka server as True.

