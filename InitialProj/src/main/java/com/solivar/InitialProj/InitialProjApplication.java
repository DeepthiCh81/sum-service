package com.solivar.InitialProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = "com.solivar")
@ComponentScan(basePackages = "com.solivar")
@SpringBootApplication
public class InitialProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialProjApplication.class, args);
	}

}
