package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class TuibineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuibineApplication.class, args);
	}
}
