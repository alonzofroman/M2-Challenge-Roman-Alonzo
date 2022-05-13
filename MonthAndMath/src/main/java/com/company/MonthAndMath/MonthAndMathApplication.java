package com.company.MonthAndMath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MonthAndMathApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonthAndMathApplication.class, args);
	}

}
