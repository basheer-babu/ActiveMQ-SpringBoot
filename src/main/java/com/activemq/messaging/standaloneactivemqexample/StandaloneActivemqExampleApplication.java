package com.activemq.messaging.standaloneactivemqexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StandaloneActivemqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandaloneActivemqExampleApplication.class, args);
		System.out.println("ActiveMQ projet Started..");
	}
}
