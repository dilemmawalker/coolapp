package com.dilemmawalker.springboot.coolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {
//				"com.dilemmawalker.springboot.coolapp"
//		}
//)
@SpringBootApplication
public class CoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolappApplication.class, args);
	}

}
