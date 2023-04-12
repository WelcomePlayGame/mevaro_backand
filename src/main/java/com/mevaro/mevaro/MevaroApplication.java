package com.mevaro.mevaro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;



@EnableCaching
@SpringBootApplication
public class MevaroApplication {

	public static void main(String[] args) {
		SpringApplication.run(MevaroApplication.class, args);
		System.out.println("Mevaro : Add Categories");

	}

}
