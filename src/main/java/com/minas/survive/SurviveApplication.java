package com.minas.survive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SurviveApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SurviveApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}