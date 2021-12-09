package com.example.stockmarketapi.services;

import com.example.stockmarketapi.StockMarketApiApplication;
import com.example.stockmarketapi.models.DailyOpenAndClose;
import com.example.stockmarketapi.models.TickerDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DailyOpenAndCloseService {


    @Autowired
    RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(StockMarketApiApplication.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public DailyOpenAndClose getDailyOpenAndCloseByTickerName(String name, String date) {
        try {
            DailyOpenAndClose details = restTemplate.getForObject(
                    "https://api.polygon.io/v1/open-close/" + name + "/" + date + "?apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", DailyOpenAndClose.class);
            logger.info("The time is now {}", dateFormat.format(new Date()));
            logger.info(details.toString());
            //tickerRepository.save(details);
            return details;
        } catch (RuntimeException e) {
            logger.info("Failed to load Daily Open and Close for Ticker: " + name);
        }
        return null;
    }
}
