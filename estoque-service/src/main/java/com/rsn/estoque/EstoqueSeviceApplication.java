package com.rsn.estoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class EstoqueSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoqueSeviceApplication.class, args);
	}

}
