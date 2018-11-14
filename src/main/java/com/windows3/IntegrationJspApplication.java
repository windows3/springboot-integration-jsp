package com.windows3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.windows3.controller")
@MapperScan("com.windows3.mapper")
public class IntegrationJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationJspApplication.class, args);
	}
}
