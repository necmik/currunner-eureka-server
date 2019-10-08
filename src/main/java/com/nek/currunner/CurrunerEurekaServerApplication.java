package com.nek.currunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CurrunerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrunerEurekaServerApplication.class, args);
	}

}
