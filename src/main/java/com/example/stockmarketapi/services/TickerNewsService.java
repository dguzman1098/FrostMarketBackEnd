package com.example.stockmarketapi.services;

import com.example.stockmarketapi.StockMarketApiApplication;
import com.example.stockmarketapi.models.TickerDetails;
import com.example.stockmarketapi.models.TickerNews;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TickerNewsService {

    @Autowired
    RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(StockMarketApiApplication.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public TickerNews getNewsByTickerName(String name) {
        try {
            TickerNews data = restTemplate.getForObject(
                    "https://api.polygon.io/v2/reference/news?ticker=" + name + "&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerNews.class);
            logger.info("The time is now {}", dateFormat.format(new Date()));
            logger.info(data.toString());
            //tickerRepository.save(details);
            return data;
        } catch (RuntimeException e) {
            logger.info("Failed to load News for Ticker: " + name);
        }
        return null;


    }
}
