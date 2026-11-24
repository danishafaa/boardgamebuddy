package com.example.boardgamebuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class BoardgamebuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardgamebuddyApplication.class, args);
	}

}
