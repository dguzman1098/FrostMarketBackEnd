package com.example.stockmarketapi.services;

import com.example.stockmarketapi.StockMarketApiApplication;
import com.example.stockmarketapi.models.Ticker;
import com.example.stockmarketapi.models.TickerDetails;
import com.example.stockmarketapi.models.TickerResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

@Service
public class TickerResultsService {

    @Autowired
    RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(StockMarketApiApplication.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public TickerResults getTickerByName(String name) {

        try {
            TickerResults details = restTemplate.getForObject(
                    "https://api.polygon.io/v3/reference/tickers?ticker=" + name + "&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerResults.class);
            logger.info("The time is now {}", dateFormat.format(new Date()));
            logger.info(details.toString());
            //tickerRepository.save(details);
            return details;

        } catch (RuntimeException e) {
            logger.info("Failed to Load Ticker: " + name);
        }
        return null;
    }

    public TickerResults getAllTickers() {

        try{
            TickerResults details = restTemplate.getForObject(
                    "https://api.polygon.io/v3/reference/tickers?apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerResults.class);
            logger.info("The time is now {}", dateFormat.format(new Date()));
            logger.info(details.toString());
            //tickerRepository.save(details);
            return details;
        } catch (RuntimeException e) {
            logger.info("Failed to Load All Tickers");
        }
        return null;
    }


    //https://api.polygon.io/v3/reference/tickers?ticker=MSFT&active=true&sort=ticker&order=asc&limit=10&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU

}
