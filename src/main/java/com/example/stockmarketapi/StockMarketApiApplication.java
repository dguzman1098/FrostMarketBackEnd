package com.example.stockmarketapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StockMarketApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();

	}

//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
//		return args -> {
//			fetchData();
//		};
//	}

}
