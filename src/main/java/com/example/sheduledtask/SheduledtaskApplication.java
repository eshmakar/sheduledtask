package com.example.sheduledtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SheduledtaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SheduledtaskApplication.class, args);
	}

}
