package com.waps.core.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.waps" })
public class Waps {

	public static void main(String[] args) {
		SpringApplication.run(Waps.class, args);
	}
}
