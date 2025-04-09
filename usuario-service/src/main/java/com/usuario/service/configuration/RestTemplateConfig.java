package com.usuario.service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	public RestTemplateConfig() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	

}
