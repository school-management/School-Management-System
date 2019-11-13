package com.invicta.exam;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableEurekaClient
@EnableSwagger2
public class ExamServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExamServiceApplication.class, args);
	}
	
	
//	@Bean
//	@LoadBalanced
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors
				.basePackage("com.invicta.exam.controller"))
				.paths(PathSelectors.regex("/.*"))
				.build();

	}

}
