package com.invicta.member;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableEurekaClient
@EnableSwagger2

public class MemberServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MemberServiceApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors
				.basePackage("com.invicta.member.controller.StudentController"))
				.paths(PathSelectors
				.ant("/*"))
				.build()
				.apiInfo(myDetails());

	}

	private ApiInfo myDetails() {
		return new ApiInfo("StudentService APIs", "Dev Details", "1.8", "",
				new springfox.documentation.service.Contact("ABC", "http://www.google.com", "saidputhi@gmail.com"),
				"API License", "http://www.google.com", Collections.emptyList()

		);

	}
}
