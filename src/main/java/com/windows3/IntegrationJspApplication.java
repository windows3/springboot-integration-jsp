package com.windows3;

import com.windows3.datasource.DBConfig1;
import com.windows3.datasource.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.windows3.controller")
@MapperScan("com.windows3.mapper")
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
public class IntegrationJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationJspApplication.class, args);
	}
}
