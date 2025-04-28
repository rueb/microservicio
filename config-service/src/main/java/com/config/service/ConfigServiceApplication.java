package com.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

	// git remote add origin https://github.com/rueb/microservicio.git
	    // git checkout config-server
	   // https://www.youtube.com/watch?v=icTg6iTqpUk
	    // 2:46

}
