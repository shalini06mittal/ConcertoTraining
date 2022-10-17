package com.example.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootKafkaDemoApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SpringBootKafkaDemoApplication.class, args);
	}
	@Bean
	public NewTopic topic1() {
		System.out.println("topic created");
		return new NewTopic("boot-topic", 2, (short) 1);
	}

}
