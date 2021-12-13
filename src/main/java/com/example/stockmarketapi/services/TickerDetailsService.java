package com.example.stockmarketapi.services;

import com.example.stockmarketapi.StockMarketApiApplication;
import com.example.stockmarketapi.models.tickerdetails.TickerDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TickerDetailsService {


    @Autowired
    RestTemplate restTemplate;


    private static final Logger logger = LoggerFactory.getLogger(StockMarketApiApplication.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public TickerDetails getTickerDetailsByName(String name) {
        try {
            TickerDetails details = restTemplate.getForObject(
                    "https://api.polygon.io/v1/meta/symbols/" + name + "/company?apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerDetails.class);

            logger.info("The time is now {}", dateFormat.format(new Date()));
            logger.info(details.toString());
            return details;
        } catch (RuntimeException e) {
            logger.info("Failed to load Ticker Details for Ticker: " + name);
        }
        return null;


    }

    //https://api.polygon.io/v3/reference/tickers?ticker=MSFT&active=true&sort=ticker&order=asc&limit=10&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU


}
//
//}
