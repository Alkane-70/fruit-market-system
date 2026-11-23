package com.fruitmarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fruitmarket.mapper")
public class FruitmarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitmarketApplication.class, args);
	}

}
