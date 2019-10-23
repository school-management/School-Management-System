package com.invicta.attendance;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableEurekaClient
@EnableSwagger2
public class AttendanceServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AttendanceServiceApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.invicta.attendance.controller"))
				.paths(PathSelectors.ant("/api/**")).build()

				.apiInfo(apiInfo());

	}

	private ApiInfo apiInfo() {

		return new ApiInfo("My REST API", "Some custom description of API.", "API TOS", "Terms of service",
				new Contact("http://localhost:8083/member/Api/", "", "m04.venisiya@gmail.com"), "", "",
				Collections.emptyList());
	}
}
