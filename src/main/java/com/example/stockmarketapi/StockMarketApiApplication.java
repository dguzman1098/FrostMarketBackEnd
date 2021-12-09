package com.example.stockmarketapi;

import com.example.stockmarketapi.models.TickerDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

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
